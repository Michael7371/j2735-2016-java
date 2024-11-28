package j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

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
@JsonRootName("MessageFrame")
public class TestMessage02MessageFrame extends MessageFrame<TestMessage02> {

	public TestMessage02MessageFrame() {
		super(242, "TestMessage02");
	}

	@Override
	@JsonSerialize(using = TestMessage02MessageFrameValueSerializer.class)
	public TestMessage02 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage02MessageFrameValueDeserializer.class)
	public void setValue(TestMessage02 value) {
		super.setValue(value);
	}
}