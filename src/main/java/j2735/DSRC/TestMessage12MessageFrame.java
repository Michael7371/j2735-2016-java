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
public class TestMessage12MessageFrame extends MessageFrame<TestMessage12> {

	public TestMessage12MessageFrame() {
		super(252, "TestMessage12");
	}

	@Override
	@JsonSerialize(using = TestMessage12MessageFrameValueSerializer.class)
	public TestMessage12 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage12MessageFrameValueDeserializer.class)
	public void setValue(TestMessage12 value) {
		super.setValue(value);
	}
}