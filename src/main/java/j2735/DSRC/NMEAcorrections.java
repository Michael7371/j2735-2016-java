package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_NMEAcorrections;
import asn2pojo.runtime.types.Asn1SequenceOf;

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
@JsonIgnoreProperties(ignoreUnknown = true)
public class NMEAcorrections extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 1, optional = true)
	private NMEA_Revision rev;
	@Asn1Property(tag = 2, optional = true)
	private NMEA_MsgType msg;
	@Asn1Property(tag = 3, optional = true)
	private ObjectCount wdCount;
	@Asn1Property(tag = 4)
	private NMEA_Payload payload;
	@Asn1Property(tag = 5, optional = true)
	private SequenceOfRegional regional;

	public MinuteOfTheYear getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(MinuteOfTheYear timeStamp) {
		this.timeStamp = timeStamp;
	}

	public NMEA_Revision getRev() {
		return rev;
	}

	public void setRev(NMEA_Revision rev) {
		this.rev = rev;
	}

	public NMEA_MsgType getMsg() {
		return msg;
	}

	public void setMsg(NMEA_MsgType msg) {
		this.msg = msg;
	}

	public ObjectCount getWdCount() {
		return wdCount;
	}

	public void setWdCount(ObjectCount wdCount) {
		this.wdCount = wdCount;
	}

	public NMEA_Payload getPayload() {
		return payload;
	}

	public void setPayload(NMEA_Payload payload) {
		this.payload = payload;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_NMEAcorrections> {
		SequenceOfRegional() {
			super(j2735.REGION.Reg_NMEAcorrections.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	NMEAcorrections() {
		super(true);
	}
}