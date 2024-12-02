package j2735.DSRC;

import asn1jvm.compiler.BaseSerializeTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class NodeAttributeSetLLTest extends BaseSerializeTest<NodeAttributeSetLL> {

    public NodeAttributeSetLLTest() {
        super(NodeAttributeSetLL.class);
    }

    @Test
    public void xmlDeserialize() throws IOException {
        NodeAttributeSetLL obj = fromXml(xml);
        assertThat(obj, notNullValue());
    }

    @Test
    public void xmlDeserialize_enumListsAndIntsOnly() throws IOException {
        NodeAttributeSetLL obj = fromXml(xml_enumsListsAndIntsOnly);
        assertThat(obj, notNullValue());
    }



    public static final String xml = """
        <NodeAttributeSetLL>
            <localNode>
                <downstreamStopLine/>
                <closedToTraffic/>
            </localNode>
            <disabled>
                <adjacentParkingOnLeft/>
                <transitStopOnLeft/>
                <parallelParking/>
                <mergingLaneLeft/>
                <curbOnLeft/>
            </disabled>
            <enabled>
                <midBlockCurbPresent/>
                <transitStopInLane/>
                <taperToCenterLine/>
                <lowCurbsPresent/>
            </enabled>
            <data>
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
            </data>
            <dWidth>162</dWidth>
            <dElevation>424</dElevation>
        </NodeAttributeSetLL>
        """;

    public static final String xml_enumsListsAndIntsOnly = """
        <NodeAttributeSetLL>
            <localNode>
                <downstreamStopLine/>
                <closedToTraffic/>
            </localNode>
            <disabled>
                <adjacentParkingOnLeft/>
                <transitStopOnLeft/>
                <parallelParking/>
                <mergingLaneLeft/>
                <curbOnLeft/>
            </disabled>
            <enabled>
                <midBlockCurbPresent/>
                <transitStopInLane/>
                <taperToCenterLine/>
                <lowCurbsPresent/>
            </enabled>
            <dWidth>162</dWidth>
            <dElevation>424</dElevation>
        </NodeAttributeSetLL>
        """;

}


