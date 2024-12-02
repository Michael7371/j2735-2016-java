package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Enumerated;
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
@JsonSerialize(using = ResponseTypeSerializer.class)
@JsonDeserialize(using = ResponseTypeDeserializer.class)
public enum ResponseType implements Asn1Enumerated {
	notInUseOrNotEquipped(0, "notInUseOrNotEquipped"), emergency(1, "emergency"), nonEmergency(2,
			"nonEmergency"), pursuit(3, "pursuit"), stationary(4,
					"stationary"), slowMoving(5, "slowMoving"), stopAndGoMovement(6, "stopAndGoMovement");

	private final int index;
	private final String name;

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public boolean hasExtensionMarker() {
		return false;
	}

	private ResponseType(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 6;
	}
}