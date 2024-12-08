package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.j2735.REGION.Reg_NodeAttributeSetLL;
import us.dot.its.jpo.ode.plugin.types.Asn1SequenceOf;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

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
public class NodeAttributeSetLL extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	@JsonDeserialize(using = NodeAttributeLLList.NodeAttributeLLListDeserializer.class)
	private NodeAttributeLLList localNode;
	@Asn1Property(tag = 1, optional = true)
	@JsonDeserialize(using = SegmentAttributeLLList.SegmentAttributeLLListDeserializer.class)
	private SegmentAttributeLLList disabled;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = SegmentAttributeLLList.SegmentAttributeLLListDeserializer.class)
	private SegmentAttributeLLList enabled;
	@Asn1Property(tag = 3, optional = true)
	//@JacksonXmlElementWrapper(useWrapping = false)
	@JsonDeserialize(using = LaneDataAttributeList.LaneDataAttributeListDeserializer.class)
	@JsonSerialize(using = LaneDataAttributeList.LaneDataAttributeListSerializer.class)
	private LaneDataAttributeList data;
	@Asn1Property(tag = 4, optional = true)
	@JsonDeserialize(using = Offset_B10.Offset_B10Deserializer.class)
	private Offset_B10 dWidth;
	@Asn1Property(tag = 5, optional = true)
	@JsonDeserialize(using = Offset_B10.Offset_B10Deserializer.class)
	private Offset_B10 dElevation;
	@Asn1Property(tag = 6, optional = true)
	private SequenceOfRegional regional;

	@JsonInclude(Include.NON_NULL)
	public static class SequenceOfRegional extends Asn1SequenceOf<Reg_NodeAttributeSetLL> {
		SequenceOfRegional() {
			super(Reg_NodeAttributeSetLL.class, 1L, 4L);
		}
	}

	NodeAttributeSetLL() {
		super(true);
	}
}