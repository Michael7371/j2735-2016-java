package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import asn2pojo.runtime.annotations.Asn1Property;
import j2735.REGION.Reg_SignalStatusMessage;
import asn2pojo.runtime.types.Asn1SequenceOf;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 
 *******************************************************************************
 *
 * This source file was generated by a tool. Beware manual edits might be
 * overwritten in future releases. asn1jvm v1.0-SNAPSHOT
 *
 *******************************************************************************
 * Copyright 2024 USDOT
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class SignalStatusMessage extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	@JsonDeserialize(using = MinuteOfTheYear.MinuteOfTheYearDeserializer.class)
	private MinuteOfTheYear timeStamp;
	@Asn1Property(tag = 1)
	@JsonDeserialize(using = DSecond.DSecondDeserializer.class)
	private DSecond second;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = MsgCount.MsgCountDeserializer.class)
	private MsgCount sequenceNumber;
	@Asn1Property(tag = 3)
	@JacksonXmlElementWrapper(localName = "status")
	@JacksonXmlProperty(localName = "SignalStatus")
	private SignalStatusList status;
	@Asn1Property(tag = 4, optional = true)
	private SequenceOfRegional regional;

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_SignalStatusMessage> {
		SequenceOfRegional() {
			super(j2735.REGION.Reg_SignalStatusMessage.class, 1L, 4L);
		}
	}

	SignalStatusMessage() {
		super(true);
	}
}