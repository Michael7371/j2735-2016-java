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
@JsonSerialize(using = Location_techSerializer.class)
@JsonDeserialize(using = Location_techDeserializer.class)
public enum Location_tech implements Asn1Enumerated {
	loc_tech_unknown(0, "loc-tech-unknown"), loc_tech_GNSS(1, "loc-tech-GNSS"), loc_tech_DGPS(2,
			"loc-tech-DGPS"), loc_tech_RTK(3, "loc-tech-RTK"), loc_tech_PPP(4, "loc-tech-PPP"), loc_tech_drGPS(5,
					"loc-tech-drGPS"), loc_tech_drDGPS(6, "loc-tech-drDGPS"), loc_tech_dr(7,
							"loc-tech-dr"), loc_tech_nav(8, "loc-tech-nav"), loc_tech_fault(9, "loc-tech-fault");

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

	private Location_tech(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 9;
	}
}