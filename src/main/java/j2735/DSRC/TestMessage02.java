package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_TestMessage02;

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
public class TestMessage02 extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private Header header;
	@Asn1Property(tag = 1, optional = true)
	private Reg_TestMessage02 regional;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Reg_TestMessage02 getRegional() {
		return regional;
	}

	public void setRegional(Reg_TestMessage02 regional) {
		this.regional = regional;
	}

	TestMessage02() {
		super(true);
	}
}