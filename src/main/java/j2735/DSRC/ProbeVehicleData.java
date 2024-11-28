package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.REGION.Reg_ProbeVehicleData;

/**
 * 
 * <p>
 * This source code was generated by a tool. Manual edits are futile.
 * </p>
 * <p>
 * asn1jvm v1.0-SNAPSHOT
 * </p>
 * <p>
 * ASN.1 source files:
 * </p>
 * 
 * <pre>
 * J2735_201603DA.ASN
 * </pre>
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProbeVehicleData extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 1, optional = true)
	private ProbeSegmentNumber segNum;
	@Asn1Property(tag = 2, optional = true)
	private VehicleIdent probeID;
	@Asn1Property(tag = 3)
	private FullPositionVector startVector;
	@Asn1Property(tag = 4)
	private VehicleClassification vehicleType;
	@Asn1Property(tag = 5)
	private SequenceOfSnapshots snapshots;
	@Asn1Property(tag = 6, optional = true)
	private SequenceOfRegional regional;

	public MinuteOfTheYear getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(MinuteOfTheYear timeStamp) {
		this.timeStamp = timeStamp;
	}

	public ProbeSegmentNumber getSegNum() {
		return segNum;
	}

	public void setSegNum(ProbeSegmentNumber segNum) {
		this.segNum = segNum;
	}

	public VehicleIdent getProbeID() {
		return probeID;
	}

	public void setProbeID(VehicleIdent probeID) {
		this.probeID = probeID;
	}

	public FullPositionVector getStartVector() {
		return startVector;
	}

	public void setStartVector(FullPositionVector startVector) {
		this.startVector = startVector;
	}

	public VehicleClassification getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleClassification vehicleType) {
		this.vehicleType = vehicleType;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfSnapshots extends Asn1SequenceOf<Snapshot> {
		SequenceOfSnapshots() {
			super(Snapshot.class, 1L, 32L);
		}
	}

	public SequenceOfSnapshots getSnapshots() {
		return snapshots;
	}

	public void setSnapshots(SequenceOfSnapshots snapshots) {
		this.snapshots = snapshots;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_ProbeVehicleData> {
		SequenceOfRegional() {
			super(Reg_ProbeVehicleData.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	ProbeVehicleData() {
		super(true);
	}
}