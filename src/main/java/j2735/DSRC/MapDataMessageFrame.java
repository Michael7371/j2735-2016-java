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
public class MapDataMessageFrame extends MessageFrame<MapData> {

	public MapDataMessageFrame() {
		super(18, "MapData");
	}

	@Override
	@JsonSerialize(using = MapDataMessageFrameValueSerializer.class)
	public MapData getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = MapDataMessageFrameValueDeserializer.class)
	public void setValue(MapData value) {
		super.setValue(value);
	}
}