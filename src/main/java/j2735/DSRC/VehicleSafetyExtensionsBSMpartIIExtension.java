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
@JsonRootName("BSMpartIIExtension")
public class VehicleSafetyExtensionsBSMpartIIExtension extends BSMpartIIExtension<VehicleSafetyExtensions> {

	public VehicleSafetyExtensionsBSMpartIIExtension() {
		super(0, "VehicleSafetyExtensions");
	}

	@Override
	@JsonSerialize(using = VehicleSafetyExtensionsBSMpartIIExtensionValueSerializer.class)
	public VehicleSafetyExtensions getPartII_Value() {
		return super.getPartII_Value();
	}

	@Override
	@JsonDeserialize(using = VehicleSafetyExtensionsBSMpartIIExtensionValueDeserializer.class)
	public void setPartII_Value(VehicleSafetyExtensions value) {
		super.setPartII_Value(value);
	}
}