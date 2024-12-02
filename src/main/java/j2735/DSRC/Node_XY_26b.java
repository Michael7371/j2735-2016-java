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
public class Node_XY_26b extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private Offset_B13 x;
	@Asn1Property(tag = 1)
	private Offset_B13 y;

	public Offset_B13 getX() {
		return x;
	}

	public void setX(Offset_B13 x) {
		this.x = x;
	}

	public Offset_B13 getY() {
		return y;
	}

	public void setY(Offset_B13 y) {
		this.y = y;
	}

	Node_XY_26b() {
		super(false);
	}
}