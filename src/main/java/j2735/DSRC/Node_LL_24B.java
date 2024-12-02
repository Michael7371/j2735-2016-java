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
public class Node_LL_24B extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private OffsetLL_B12 lon;
	@Asn1Property(tag = 1)
	private OffsetLL_B12 lat;

	public OffsetLL_B12 getLon() {
		return lon;
	}

	public void setLon(OffsetLL_B12 lon) {
		this.lon = lon;
	}

	public OffsetLL_B12 getLat() {
		return lat;
	}

	public void setLat(OffsetLL_B12 lat) {
		this.lat = lat;
	}

	Node_LL_24B() {
		super(false);
	}
}