package j2735.AddGrpC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;

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
public class RestrictionUserType_addGrpC extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private EmissionType emission;

	public EmissionType getEmission() {
		return emission;
	}

	public void setEmission(EmissionType emission) {
		this.emission = emission;
	}

	RestrictionUserType_addGrpC() {
		super(true);
	}
}