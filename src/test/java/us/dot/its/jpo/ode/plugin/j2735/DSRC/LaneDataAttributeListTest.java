package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.BaseSerializeTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;

/**
 * LaneDataAttribute is a SEQUENCE-OF CHOICE.  Choices are not wrapped.
 *
 * <p>Note these tests failing tests are ignored, because it isn't possible to add the necessary
 * `@JacksonXmlElementWrapper` annotation directly to the LaneDataAttributeList class.
 * This means a LaneDataAttributeList is not deserializable by itself, but does work
 * in the context of deserializing a class containing a property of this type.
 * See {@link NodeAttributeSetLLTest}.
 */
public class LaneDataAttributeListTest extends BaseSerializeTest<LaneDataAttributeList> {

    public LaneDataAttributeListTest() {
        super(LaneDataAttributeList.class);
    }

    @Disabled
    @Test
    public void xmlDeserialize() throws IOException {
        LaneDataAttributeList obj = fromXml(xml);
        assertThat(obj, notNullValue());
    }

    @Disabled
    @Test
    public void xmlDeserialize_SpeedLimits() throws IOException {
        LaneDataAttributeList obj = fromXml(xml_speedLimits);
        assertThat(obj, notNullValue());
        assertThat(obj, hasSize(1));
    }

    @Disabled
    @Test
    public void xmlDeserialize_LaneAngle() throws IOException {
        LaneDataAttributeList obj = fromXml(xml_laneAngle);
        assertThat(obj, notNullValue());
        assertThat(obj, hasSize(1));
        assertThat(obj.get(0).getLaneAngle(), notNullValue());
    }

    @Disabled
    @Test
    public void xmlSerialize() throws IOException {
        LaneDataAttributeList ldal = new LaneDataAttributeList();
        LaneDataAttribute lda1 = new LaneDataAttribute();
        lda1.setLaneAngle(new MergeDivergeNodeAngle(101L));
        ldal.add(lda1);
        LaneDataAttribute lda2 = new LaneDataAttribute();
        lda2.setPathEndPointAngle(new DeltaAngle(-8L));
        ldal.add(lda2);
        String xml = toXml(ldal);
        assertThat(xml, notNullValue());
    }

    @Disabled
    @Test
    public void jsonSerialize() throws IOException {
        LaneDataAttributeList ldal = new LaneDataAttributeList();
        LaneDataAttribute lda1 = new LaneDataAttribute();
        lda1.setLaneAngle(new MergeDivergeNodeAngle(101L));
        ldal.add(lda1);
        LaneDataAttribute lda2 = new LaneDataAttribute();
        lda2.setPathEndPointAngle(new DeltaAngle(-8L));
        ldal.add(lda2);
        String json = toJson(ldal);
        assertThat(json, notNullValue());
    }

    public static final String xml_laneAngle = """
        <LaneDataAttributeList>
            <laneAngle>101</laneAngle>
        </LaneDataAttributeList>
        """;

    public static final String xml = """
        <LaneDataAttributeList>
            <laneAngle>101</laneAngle>
            <speedLimits>
                <RegulatorySpeedLimit>
                    <type>
                        <truckMaxSpeed/>
                    </type>
                    <speed>5822</speed>
                </RegulatorySpeedLimit>
                <RegulatorySpeedLimit>
                    <type>
                        <truckNightMaxSpeed/>
                    </type>
                    <speed>3017</speed>
                </RegulatorySpeedLimit>
            </speedLimits>
            <pathEndPointAngle>-8</pathEndPointAngle>
            <laneAngle>62</laneAngle>
            <laneCrownPointLeft>35</laneCrownPointLeft>
            <beginAndEnd/>
        </LaneDataAttributeList>
        """;

    public static final String xml_speedLimits = """
            <LaneDataAttributeList>
                <speedLimits>
                    <RegulatorySpeedLimit>
                        <type>
                            <truckNightMaxSpeed/>
                        </type>
                        <speed>6769</speed>
                    </RegulatorySpeedLimit>
                    <RegulatorySpeedLimit>
                        <type>
                            <truckMaxSpeed/>
                        </type>
                        <speed>4438</speed>
                    </RegulatorySpeedLimit>
                    <RegulatorySpeedLimit>
                        <type>
                            <maxSpeedInSchoolZone/>
                        </type>
                        <speed>2679</speed>
                    </RegulatorySpeedLimit>
                    <RegulatorySpeedLimit>
                        <type>
                            <vehiclesWithTrailersNightMaxSpeed/>
                        </type>
                        <speed>3110</speed>
                    </RegulatorySpeedLimit>
                    <RegulatorySpeedLimit>
                        <type>
                            <vehicleMaxSpeed/>
                        </type>
                        <speed>1987</speed>
                    </RegulatorySpeedLimit>
                </speedLimits>
            </LaneDataAttributeList>
            """;
}
