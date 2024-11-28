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
public class TestMessage14MessageFrame extends MessageFrame<TestMessage14> {

	public TestMessage14MessageFrame() {
		super(254, "TestMessage14");
	}

	@Override
	@JsonSerialize(using = TestMessage14MessageFrameValueSerializer.class)
	public TestMessage14 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage14MessageFrameValueDeserializer.class)
	public void setValue(TestMessage14 value) {
		super.setValue(value);
	}
}