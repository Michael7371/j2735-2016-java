package j2735.AddGrpB;

import com.fasterxml.jackson.annotation.JsonRootName;
import j2735.REGION.Reg_Position3D;
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
@JsonRootName("Reg_Position3D")
public class Position3D_addGrpBReg_Position3D extends Reg_Position3D<Position3D_addGrpB> {

	public Position3D_addGrpBReg_Position3D() {
		super(2, "Position3D_addGrpB");
	}

	@Override
	@JsonSerialize(using = Position3D_addGrpBReg_Position3DValueSerializer.class)
	public Position3D_addGrpB getRegExtValue() {
		return super.getRegExtValue();
	}

	@Override
	@JsonDeserialize(using = Position3D_addGrpBReg_Position3DValueDeserializer.class)
	public void setRegExtValue(Position3D_addGrpB value) {
		super.setRegExtValue(value);
	}
}