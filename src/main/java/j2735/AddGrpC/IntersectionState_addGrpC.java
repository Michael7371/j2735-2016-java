package j2735.AddGrpC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class IntersectionState_addGrpC extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	@JacksonXmlElementWrapper(localName = "activePrioritizations")
	@JacksonXmlProperty(localName = "PrioritizationResponse")
	private PrioritizationResponseList activePrioritizations;

	public PrioritizationResponseList getActivePrioritizations() {
		return activePrioritizations;
	}

	public void setActivePrioritizations(PrioritizationResponseList activePrioritizations) {
		this.activePrioritizations = activePrioritizations;
	}

	IntersectionState_addGrpC() {
		super(true);
	}
}