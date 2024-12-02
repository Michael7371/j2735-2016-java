package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import j2735.ITIS.ITIScodes;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.ITIS.GenericLocations;

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
public class DisabledVehicle extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private ITIScodes statusDetails;
	@Asn1Property(tag = 1, optional = true)
	private GenericLocations locationDetails;

	public ITIScodes getStatusDetails() {
		return statusDetails;
	}

	public void setStatusDetails(ITIScodes statusDetails) {
		this.statusDetails = statusDetails;
	}

	public GenericLocations getLocationDetails() {
		return locationDetails;
	}

	public void setLocationDetails(GenericLocations locationDetails) {
		this.locationDetails = locationDetails;
	}

	DisabledVehicle() {
		super(true);
	}
}