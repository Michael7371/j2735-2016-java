package j2735.DSRC;

import asn1jvm.compiler.BaseSerializeTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TIMTest extends BaseSerializeTest<TravelerInformation> {

    public TIMTest() {
        super(TravelerInformation.class);
    }

    @Test
    public void xmlDeserialize_generatedXml() throws IOException {
        TravelerInformation tim = fromXml(loadResource("/TravelerInformation.xml"));
        assertThat(tim, notNullValue());
        assertThat(tim, hasProperty("messageId", equalTo(new DSRCmsgID(31))));
    }
    

    @Test
    public void xmlDeserialize_generatedXmlWithComputedLanes() throws IOException {
        TravelerInformation tim = fromXml(loadResource("/TravelerInformationWithComputedLanes.xml"));
        assertThat(tim, notNullValue());
        assertThat(tim, hasProperty("messageId", equalTo(new DSRCmsgID(31))));
    }
}
