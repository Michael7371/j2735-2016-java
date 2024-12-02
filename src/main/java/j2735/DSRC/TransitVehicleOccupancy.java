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
@JsonSerialize(using = TransitVehicleOccupancySerializer.class)
@JsonDeserialize(using = TransitVehicleOccupancyDeserializer.class)
public enum TransitVehicleOccupancy implements Asn1Enumerated {
	occupancyUnknown(0, "occupancyUnknown"), occupancyEmpty(1, "occupancyEmpty"), occupancyVeryLow(2,
			"occupancyVeryLow"), occupancyLow(3, "occupancyLow"), occupancyMed(4, "occupancyMed"), occupancyHigh(5,
					"occupancyHigh"), occupancyNearlyFull(6, "occupancyNearlyFull"), occupancyFull(7, "occupancyFull");

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

	private TransitVehicleOccupancy(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 7;
	}
}