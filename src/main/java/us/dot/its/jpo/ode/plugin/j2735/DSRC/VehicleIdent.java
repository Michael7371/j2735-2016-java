/*==============================================================================
 *
 * This source file was generated by a tool.
 * Beware manual edits might be overwritten in future releases.
 * asn1jvm v1.0-SNAPSHOT
 *
 *------------------------------------------------------------------------------
 * Copyright 2024 USDOT
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *============================================================================*/

package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.types.Asn1Choice;
import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import us.dot.its.jpo.ode.plugin.types.IA5String;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import us.dot.its.jpo.ode.plugin.j2735.itis.IncidentResponseEquipment;
import us.dot.its.jpo.ode.plugin.j2735.itis.ResponderGroupAffected;
import us.dot.its.jpo.ode.plugin.j2735.itis.VehicleGroupAffected;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class VehicleIdent extends Asn1Sequence {

	@Asn1Property(tag = 0, name = "name", optional = true)
	@JsonProperty("name")
	private DescriptiveName name;
	@Asn1Property(tag = 1, name = "vin", optional = true)
	@JsonProperty("vin")
	private VINstring vin;
	@Asn1Property(tag = 2, name = "ownerCode", optional = true)
	@JsonProperty("ownerCode")
	private IA5String ownerCode;
	@Asn1Property(tag = 3, name = "id", optional = true)
	@JsonProperty("id")
	private VehicleID id;
	@Asn1Property(tag = 4, name = "vehicleType", optional = true)
	@JsonProperty("vehicleType")
	private VehicleType vehicleType;
	@Asn1Property(tag = 5, name = "vehicleClass", optional = true)
	@JsonProperty("vehicleClass")
	private VehicleClassChoice vehicleClass;

	@Getter
	@Setter
	@JsonInclude(Include.NON_NULL)
	public static class VehicleClassChoice extends Asn1Choice {
		@Asn1Property(tag = 0, name = "vGroup")
		@JsonProperty("vGroup")
		private VehicleGroupAffected vGroup;
		@Asn1Property(tag = 1, name = "rGroup")
		@JsonProperty("rGroup")
		private ResponderGroupAffected rGroup;
		@Asn1Property(tag = 2, name = "rEquip")
		@JsonProperty("rEquip")
		private IncidentResponseEquipment rEquip;

		VehicleClassChoice() {
			super(false);
		}
	}

	VehicleIdent() {
		super(true);
	}
}