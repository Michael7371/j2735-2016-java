package us.dot.its.jpo.ode.plugin.types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.dot.its.jpo.ode.plugin.serialization.SerializationUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Asn1Sequence implements Asn1Type {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    final boolean extensionMarker;

    public Asn1Sequence(boolean hasExtensionMarker) {
        this.extensionMarker = hasExtensionMarker;
    }

    public boolean hasExtensionMarker() {
        return extensionMarker;
    }



    @Override
    public String toString() {
        ObjectMapper mapper = SerializationUtil.jsonMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            logger.error("Failed to covert value to json string",e);
            return "";
        }
    }
}
