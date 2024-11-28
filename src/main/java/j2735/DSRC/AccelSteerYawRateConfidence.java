package j2735.DSRC;

import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

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
public class AccelSteerYawRateConfidence extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private YawRateConfidence yawRate;
	@Asn1Property(tag = 1)
	private AccelerationConfidence acceleration;
	@Asn1Property(tag = 2)
	private SteeringWheelAngleConfidence steeringWheelAngle;

	public YawRateConfidence getYawRate() {
		return yawRate;
	}

	public void setYawRate(YawRateConfidence yawRate) {
		this.yawRate = yawRate;
	}

	public AccelerationConfidence getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(AccelerationConfidence acceleration) {
		this.acceleration = acceleration;
	}

	public SteeringWheelAngleConfidence getSteeringWheelAngle() {
		return steeringWheelAngle;
	}

	public void setSteeringWheelAngle(SteeringWheelAngleConfidence steeringWheelAngle) {
		this.steeringWheelAngle = steeringWheelAngle;
	}

	AccelSteerYawRateConfidence() {
		super(false);
	}
}