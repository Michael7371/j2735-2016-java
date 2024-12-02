package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_RTCMcorrections;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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
public class RTCMcorrections extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private MsgCount msgCnt;
	@Asn1Property(tag = 1)
	private RTCM_Revision rev;
	@Asn1Property(tag = 2, optional = true)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 3, optional = true)
	private FullPositionVector anchorPoint;
	@Asn1Property(tag = 4, optional = true)
	private RTCMheader rtcmHeader;
	@Asn1Property(tag = 5)
	@JacksonXmlElementWrapper(localName = "msgs")
	@JacksonXmlProperty(localName = "RTCMmessage")
	private RTCMmessageList msgs;
	@Asn1Property(tag = 6, optional = true)
	private SequenceOfRegional regional;

	public MsgCount getMsgCnt() {
		return msgCnt;
	}

	public void setMsgCnt(MsgCount msgCnt) {
		this.msgCnt = msgCnt;
	}

	public RTCM_Revision getRev() {
		return rev;
	}

	public void setRev(RTCM_Revision rev) {
		this.rev = rev;
	}

	public MinuteOfTheYear getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(MinuteOfTheYear timeStamp) {
		this.timeStamp = timeStamp;
	}

	public FullPositionVector getAnchorPoint() {
		return anchorPoint;
	}

	public void setAnchorPoint(FullPositionVector anchorPoint) {
		this.anchorPoint = anchorPoint;
	}

	public RTCMheader getRtcmHeader() {
		return rtcmHeader;
	}

	public void setRtcmHeader(RTCMheader rtcmHeader) {
		this.rtcmHeader = rtcmHeader;
	}

	public RTCMmessageList getMsgs() {
		return msgs;
	}

	public void setMsgs(RTCMmessageList msgs) {
		this.msgs = msgs;
	}

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_RTCMcorrections> {
		SequenceOfRegional() {
			super(j2735.REGION.Reg_RTCMcorrections.class, 1L, 4L);
		}
	}

	public SequenceOfRegional getRegional() {
		return regional;
	}

	public void setRegional(SequenceOfRegional regional) {
		this.regional = regional;
	}

	RTCMcorrections() {
		super(true);
	}
}