package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import asn2pojo.runtime.annotations.Asn1Property;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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
public class Connection extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private ConnectingLane connectingLane;
	@Asn1Property(tag = 1, optional = true)
	private IntersectionReferenceID remoteIntersection;
	@Asn1Property(tag = 2, optional = true)
	@JsonDeserialize(using = SignalGroupID.SignalGroupIDDeserializer.class)
	private SignalGroupID signalGroup;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = RestrictionClassID.RestrictionClassIDDeserializer.class)
	private RestrictionClassID userClass;
	@Asn1Property(tag = 4, optional = true)
	@JsonDeserialize(using = LaneConnectionID.LaneConnectionIDDeserializer.class)
	private LaneConnectionID connectionID;

	Connection() {
		super(false);
	}
}