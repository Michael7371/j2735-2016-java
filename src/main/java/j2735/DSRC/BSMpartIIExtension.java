package j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import j2735.DSRC.PartIIcontent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import asn2pojo.runtime.annotations.Asn1ParameterizedTypes;
import asn2pojo.runtime.annotations.Asn1ParameterizedTypes.IdType;

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
@JsonTypeInfo(use = Id.NAME, include = As.EXISTING_PROPERTY, property = "partII_Id")
@JsonSubTypes({@JsonSubTypes.Type(value = j2735.DSRC.VehicleSafetyExtensionsBSMpartIIExtension.class, name = "0"),
		@JsonSubTypes.Type(value = j2735.DSRC.SpecialVehicleExtensionsBSMpartIIExtension.class, name = "1"),
		@JsonSubTypes.Type(value = j2735.DSRC.SupplementalVehicleExtensionsBSMpartIIExtension.class, name = "2")})
@Asn1ParameterizedTypes(idProperty = "partII_Id", idType = IdType.INTEGER, valueProperty = "partII_Value", value = {
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.VehicleSafetyExtensionsBSMpartIIExtension.class, intId = 0),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.SpecialVehicleExtensionsBSMpartIIExtension.class, intId = 1),
		@Asn1ParameterizedTypes.Type(value = j2735.DSRC.SupplementalVehicleExtensionsBSMpartIIExtension.class, intId = 2)})
abstract public class BSMpartIIExtension<TValue> extends PartIIcontent<TValue> {

	public BSMpartIIExtension(int id, String name) {
		super(id, name);
	}
}