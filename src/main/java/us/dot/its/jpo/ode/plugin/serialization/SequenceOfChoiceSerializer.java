package us.dot.its.jpo.ode.plugin.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import us.dot.its.jpo.ode.plugin.types.Asn1Choice;
import us.dot.its.jpo.ode.plugin.types.Asn1SequenceOf;

import java.io.IOException;

/**
 * Serializer for SEQUENCE-OF CHOICE types.
 * These are unwrapped in XER, but wrapped in JER.
 * @param <S> The Asn1Choice type
 * @param <T> The Asn1SequenceOf type
 */
public class SequenceOfChoiceSerializer<S extends Asn1Choice, T extends Asn1SequenceOf<S>>
    extends StdSerializer<T> {


    protected SequenceOfChoiceSerializer(Class<T> t) {
        super(t);
    }

    @Override
    public void serialize(T s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

    }
}
