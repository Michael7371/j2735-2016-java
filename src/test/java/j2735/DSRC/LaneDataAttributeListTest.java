package j2735.DSRC;

import asn1jvm.compiler.BaseSerializeTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;

/**
 * LaneDataAttribute is a SEQUENCE-OF CHOICE.  Choices are not wrapped
 */
public class LaneDataAttributeListTest extends BaseSerializeTest<LaneDataAttributeList> {

    public LaneDataAttributeListTest() {
        super(LaneDataAttributeList.class);
    }

    @Test
    public void xmlDeserialize() throws IOException {
        LaneDataAttributeList obj = fromXml(xml);
        assertThat(obj, notNullValue());
    }

    @Test
    public void xmlDeserialize_SpeedLimits() throws IOException {
        LaneDataAttributeList obj = fromXml(xml_speedLimits);
        assertThat(obj, notNullValue());
    }

    @Test
    public void xmlDeserialize_LaneAngle() throws IOException {
        LaneDataAttributeList obj = fromXml(xml_laneAngle);
        assertThat(obj, notNullValue());
        assertThat(obj, hasSize(1));
        assertThat(obj.get(0).getLaneAngle(), notNullValue());
    }

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
        </LaneDataAttributeList>
        """;

    public static final String xml_speedLimits = """
            <data>
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
            </data>
            """;
}
