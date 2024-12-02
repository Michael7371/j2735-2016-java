package j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
public class TestMessage06MessageFrame extends MessageFrame<TestMessage06> {

	public TestMessage06MessageFrame() {
		super(246, "TestMessage06");
	}

	@Override
	@JsonSerialize(using = TestMessage06MessageFrameValueSerializer.class)
	public TestMessage06 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage06MessageFrameValueDeserializer.class)
	public void setValue(TestMessage06 value) {
		super.setValue(value);
	}
}