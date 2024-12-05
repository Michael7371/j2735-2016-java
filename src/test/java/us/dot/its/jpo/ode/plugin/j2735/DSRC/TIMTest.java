package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.BaseSerializeTest;
import org.junit.jupiter.api.Test;
import us.dot.its.jpo.ode.plugin.j2735.DSRC.TravelerInformation;

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
    }
    

    @Test
    public void xmlDeserialize_generatedXmlWithComputedLanes() throws IOException {
        TravelerInformation tim = fromXml(loadResource("/TravelerInformationWithComputedLanes.xml"));
        assertThat(tim, notNullValue());
    }
}
