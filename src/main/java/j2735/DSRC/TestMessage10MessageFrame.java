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
public class TestMessage10MessageFrame extends MessageFrame<TestMessage10> {

	public TestMessage10MessageFrame() {
		super(250, "TestMessage10");
	}

	@Override
	@JsonSerialize(using = TestMessage10MessageFrameValueSerializer.class)
	public TestMessage10 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage10MessageFrameValueDeserializer.class)
	public void setValue(TestMessage10 value) {
		super.setValue(value);
	}
}