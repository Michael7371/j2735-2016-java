package j2735.AddGrpB;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.DSRC.TimeIntervalConfidence;

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
public class MovementEvent_addGrpB extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private TimeRemaining startTime;
	@Asn1Property(tag = 1)
	private MinTimetoChange minEndTime;
	@Asn1Property(tag = 2, optional = true)
	private MaxTimetoChange maxEndTime;
	@Asn1Property(tag = 3, optional = true)
	private TimeRemaining likelyTime;
	@Asn1Property(tag = 4, optional = true)
	private TimeIntervalConfidence confidence;
	@Asn1Property(tag = 5, optional = true)
	private TimeRemaining nextTime;

	public TimeRemaining getStartTime() {
		return startTime;
	}

	public void setStartTime(TimeRemaining startTime) {
		this.startTime = startTime;
	}

	public MinTimetoChange getMinEndTime() {
		return minEndTime;
	}

	public void setMinEndTime(MinTimetoChange minEndTime) {
		this.minEndTime = minEndTime;
	}

	public MaxTimetoChange getMaxEndTime() {
		return maxEndTime;
	}

	public void setMaxEndTime(MaxTimetoChange maxEndTime) {
		this.maxEndTime = maxEndTime;
	}

	public TimeRemaining getLikelyTime() {
		return likelyTime;
	}

	public void setLikelyTime(TimeRemaining likelyTime) {
		this.likelyTime = likelyTime;
	}

	public TimeIntervalConfidence getConfidence() {
		return confidence;
	}

	public void setConfidence(TimeIntervalConfidence confidence) {
		this.confidence = confidence;
	}

	public TimeRemaining getNextTime() {
		return nextTime;
	}

	public void setNextTime(TimeRemaining nextTime) {
		this.nextTime = nextTime;
	}

	MovementEvent_addGrpB() {
		super(true);
	}
}