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
public class NodeXY extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private NodeOffsetPointXY delta;
	@Asn1Property(tag = 1, optional = true)
	private NodeAttributeSetXY attributes;

	public NodeOffsetPointXY getDelta() {
		return delta;
	}

	public void setDelta(NodeOffsetPointXY delta) {
		this.delta = delta;
	}

	public NodeAttributeSetXY getAttributes() {
		return attributes;
	}

	public void setAttributes(NodeAttributeSetXY attributes) {
		this.attributes = attributes;
	}

	NodeXY() {
		super(true);
	}
}