package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import com.fasterxml.jackson.annotation.JsonProperty;

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
public class FullPositionVector extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private DDateTime utcTime;
	@Asn1Property(tag = 1, name = "long")
	@JsonProperty("long")
	private Longitude long_;
	@Asn1Property(tag = 2)
	private Latitude lat;
	@Asn1Property(tag = 3, optional = true)
	private Elevation elevation;
	@Asn1Property(tag = 4, optional = true)
	private Heading heading;
	@Asn1Property(tag = 5, optional = true)
	private TransmissionAndSpeed speed;
	@Asn1Property(tag = 6, optional = true)
	private PositionalAccuracy posAccuracy;
	@Asn1Property(tag = 7, optional = true)
	private TimeConfidence timeConfidence;
	@Asn1Property(tag = 8, optional = true)
	private PositionConfidenceSet posConfidence;
	@Asn1Property(tag = 9, optional = true)
	private SpeedandHeadingandThrottleConfidence speedConfidence;

	public DDateTime getUtcTime() {
		return utcTime;
	}

	public void setUtcTime(DDateTime utcTime) {
		this.utcTime = utcTime;
	}

	public Longitude getLong_() {
		return long_;
	}

	public void setLong_(Longitude long_) {
		this.long_ = long_;
	}

	public Latitude getLat() {
		return lat;
	}

	public void setLat(Latitude lat) {
		this.lat = lat;
	}

	public Elevation getElevation() {
		return elevation;
	}

	public void setElevation(Elevation elevation) {
		this.elevation = elevation;
	}

	public Heading getHeading() {
		return heading;
	}

	public void setHeading(Heading heading) {
		this.heading = heading;
	}

	public TransmissionAndSpeed getSpeed() {
		return speed;
	}

	public void setSpeed(TransmissionAndSpeed speed) {
		this.speed = speed;
	}

	public PositionalAccuracy getPosAccuracy() {
		return posAccuracy;
	}

	public void setPosAccuracy(PositionalAccuracy posAccuracy) {
		this.posAccuracy = posAccuracy;
	}

	public TimeConfidence getTimeConfidence() {
		return timeConfidence;
	}

	public void setTimeConfidence(TimeConfidence timeConfidence) {
		this.timeConfidence = timeConfidence;
	}

	public PositionConfidenceSet getPosConfidence() {
		return posConfidence;
	}

	public void setPosConfidence(PositionConfidenceSet posConfidence) {
		this.posConfidence = posConfidence;
	}

	public SpeedandHeadingandThrottleConfidence getSpeedConfidence() {
		return speedConfidence;
	}

	public void setSpeedConfidence(SpeedandHeadingandThrottleConfidence speedConfidence) {
		this.speedConfidence = speedConfidence;
	}

	FullPositionVector() {
		super(true);
	}
}