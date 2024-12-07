package us.dot.its.jpo.ode.plugin.serialization;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser;
import us.dot.its.jpo.ode.plugin.types.Asn1Choice;
import us.dot.its.jpo.ode.plugin.types.Asn1SequenceOf;
import us.dot.its.jpo.ode.plugin.utils.XmlUtils;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.util.*;

import static us.dot.its.jpo.ode.plugin.utils.XmlUtils.*;


/**
 * Deserializer for SEQUENCE-OF CHOICE types.
 * These are unwrapped in XER, but wrapped in JER.
 * @param <S> The Asn1Choice type
 * @param <T> The Asn1SequenceOf type
 */
public abstract class SequenceOfChoiceDeserializer<S extends Asn1Choice, T extends Asn1SequenceOf<S>>
    extends StdDeserializer<T> {

    protected final Class<S> choiceClass;
    protected final Class<T> sequenceOfClass;

    protected abstract T construct();

    protected SequenceOfChoiceDeserializer(Class<S> choiceClass, Class<T> sequenceOfClass) {
        super(sequenceOfClass);
        this.choiceClass = choiceClass;
        this.sequenceOfClass = sequenceOfClass;
    }

    @Override
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JacksonException {
        T result = construct();
        if (jsonParser instanceof FromXmlParser xmlParser) {
            // XML: expects unwrapped choice items
            String parentName = null;
            if (xmlParser.getParsingContext().getParent() != null) {
                parentName = xmlParser.getParsingContext().getParent().getCurrentName();
            }
            XMLStreamReader xmlReader = xmlParser.getStaxReader();

            // Read the xml into a list
            List<XmlUtils.XmlToken> xmlTokens = null;
            try {
                if (parentName == null) {
                    xmlTokens = XmlUtils.readTokens(xmlReader);
                    System.out.println(stringifyTokens(xmlTokens));
                    xmlTokens = unwrap(xmlTokens);
                    System.out.println(stringifyTokens(xmlTokens));
                } else {
                    xmlTokens = XmlUtils.readTokens(xmlReader, parentName);
                    System.out.println(stringifyTokens(xmlTokens));
                }
            } catch (XMLStreamException e) {
                throw new IOException("Exception reading xml", e);
            }


            // Group by top level
            List<List<XmlUtils.XmlToken>> xmlGroups = groupTopLevelTokens(xmlTokens);
            // Deserialize the xml for each choice
            for (var group : xmlGroups) {
                String choiceXml = stringifyTokens(wrap(group, choiceClass.getSimpleName()));
                System.out.println(choiceXml);
                S choice =SerializationUtil.xmlMapper().readValue(choiceXml, choiceClass);
                result.add(choice);
            }
        } else {
            // JSON: expects wrapped choice items
            // Pass through normally
            result = jsonParser.getCodec().readValue(jsonParser, sequenceOfClass);
        }
        return result;
    }
}
