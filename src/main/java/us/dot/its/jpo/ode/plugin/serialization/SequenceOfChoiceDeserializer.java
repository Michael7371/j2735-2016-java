package us.dot.its.jpo.ode.plugin.serialization;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.TreeNode;
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
           // result = xmlParser.getCodec().readValue(jsonParser, sequenceOfClass);
            System.out.println("Hello from SEQUENCE-OF CHOICE xml deserializer");
            result = jsonParser.getCodec().readValue(jsonParser, sequenceOfClass);

        } else {
            // JSON: expects wrapped choice items
            System.out.println("Hello from SEQUENCE-OF CHOICE json deserializer");
            result = jsonParser.getCodec().readValue(jsonParser, sequenceOfClass);
        }
        return result;
    }
}
