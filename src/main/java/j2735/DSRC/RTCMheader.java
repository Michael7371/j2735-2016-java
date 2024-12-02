package j2735.DSRC;

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
public class RTCMheader extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private GNSSstatus status;
	@Asn1Property(tag = 1)
	private AntennaOffsetSet offsetSet;

	public GNSSstatus getStatus() {
		return status;
	}

	public void setStatus(GNSSstatus status) {
		this.status = status;
	}

	public AntennaOffsetSet getOffsetSet() {
		return offsetSet;
	}

	public void setOffsetSet(AntennaOffsetSet offsetSet) {
		this.offsetSet = offsetSet;
	}

	RTCMheader() {
		super(false);
	}
}