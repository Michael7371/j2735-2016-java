package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_RequestorType;

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
public class RequestorType extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private BasicVehicleRole role;
	@Asn1Property(tag = 1, optional = true)
	private RequestSubRole subrole;
	@Asn1Property(tag = 2, optional = true)
	private RequestImportanceLevel request;
	@Asn1Property(tag = 3, optional = true)
	private Iso3833VehicleType iso3883;
	@Asn1Property(tag = 4, optional = true)
	private VehicleType hpmsType;
	@Asn1Property(tag = 5, optional = true)
	private Reg_RequestorType regional;

	public BasicVehicleRole getRole() {
		return role;
	}

	public void setRole(BasicVehicleRole role) {
		this.role = role;
	}

	public RequestSubRole getSubrole() {
		return subrole;
	}

	public void setSubrole(RequestSubRole subrole) {
		this.subrole = subrole;
	}

	public RequestImportanceLevel getRequest() {
		return request;
	}

	public void setRequest(RequestImportanceLevel request) {
		this.request = request;
	}

	public Iso3833VehicleType getIso3883() {
		return iso3883;
	}

	public void setIso3883(Iso3833VehicleType iso3883) {
		this.iso3883 = iso3883;
	}

	public VehicleType getHpmsType() {
		return hpmsType;
	}

	public void setHpmsType(VehicleType hpmsType) {
		this.hpmsType = hpmsType;
	}

	public Reg_RequestorType getRegional() {
		return regional;
	}

	public void setRegional(Reg_RequestorType regional) {
		this.regional = regional;
	}

	RequestorType() {
		super(true);
	}
}