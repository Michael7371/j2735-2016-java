package j2735.AddGrpC;

import com.fasterxml.jackson.annotation.JsonRootName;
import j2735.REGION.Reg_RestrictionUserType;
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
@JsonRootName("Reg_RestrictionUserType")
public class RestrictionUserType_addGrpCReg_RestrictionUserType
		extends
			Reg_RestrictionUserType<RestrictionUserType_addGrpC> {

	public RestrictionUserType_addGrpCReg_RestrictionUserType() {
		super(3, "RestrictionUserType_addGrpC");
	}

	@Override
	@JsonSerialize(using = RestrictionUserType_addGrpCReg_RestrictionUserTypeValueSerializer.class)
	public RestrictionUserType_addGrpC getRegExtValue() {
		return super.getRegExtValue();
	}

	@Override
	@JsonDeserialize(using = RestrictionUserType_addGrpCReg_RestrictionUserTypeValueDeserializer.class)
	public void setRegExtValue(RestrictionUserType_addGrpC value) {
		super.setRegExtValue(value);
	}
}