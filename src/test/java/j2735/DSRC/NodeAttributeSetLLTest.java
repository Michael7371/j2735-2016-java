package j2735.DSRC;

import asn1jvm.compiler.BaseSerializeTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
    public void xmlDeserialize_integerProperties() throws IOException {
        NodeAttributeSetLL obj = fromXml(xml_IntegersOnly);
        assertThat(obj, notNullValue());
        assertThat(obj.getDWidth(), notNullValue());
        assertThat(obj.getDWidth().getValue(), equalTo(162L));
        assertThat(obj.getDElevation(), notNullValue());
        assertThat(obj.getDElevation().getValue(), equalTo(424L));
    }

    @Test
    public void xmlDeserialize_enumListsOnly() throws IOException {
        NodeAttributeSetLL obj = fromXml(xml_enumListsOnly);
        assertThat(obj, notNullValue());
        assertThat(obj.getLocalNode(), hasSize(2));
        assertThat(obj.getDisabled(), hasSize(5));
        assertThat(obj.getEnabled(), hasSize(4));
    }

    @Test
    public void xmlDeserialize_laneAttributeIntData() throws IOException {
        NodeAttributeSetLL obj = fromXml(xml_laneAttributeIntData);
        assertThat(obj, notNullValue());
        // TODO Inspect that all data items are present
    }

    @Test
    public void xmlSerialize() throws IOException {
        NodeAttributeSetLL nasll = new NodeAttributeSetLL();
        LaneDataAttributeList ldal = new LaneDataAttributeList();
        LaneDataAttribute lda1 = new LaneDataAttribute();
        lda1.setLaneAngle(new MergeDivergeNodeAngle(101L));
        ldal.add(lda1);
        LaneDataAttribute lda2 = new LaneDataAttribute();
        lda2.setPathEndPointAngle(new DeltaAngle(-8L));
        ldal.add(lda2);
        nasll.setData(ldal);
        String xml = toXml(nasll);
        assertThat(xml, notNullValue());
        // TODO Inspect output for absence of <data> element.
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

    public static final String xml_laneAttributeIntData = """
        <NodeAttributeSetLL>
            <data>
                <laneCrownPointRight>-87</laneCrownPointRight>
                <laneAngle>-167</laneAngle>
            </data>
        </NodeAttributeSetLL>
        """;



    public static final String xml_enumListsOnly = """
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
        </NodeAttributeSetLL>
        """;

    public static final String xml_IntegersOnly = """
        <NodeAttributeSetLL>
            <dWidth>162</dWidth>
            <dElevation>424</dElevation>
        </NodeAttributeSetLL>
        """;

}


