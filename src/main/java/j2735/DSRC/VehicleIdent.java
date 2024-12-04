package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import asn2pojo.runtime.annotations.Asn1Property;
import asn2pojo.runtime.types.IA5String;
import j2735.ITIS.VehicleGroupAffected;
import j2735.ITIS.ResponderGroupAffected;
import j2735.ITIS.IncidentResponseEquipment;
import asn2pojo.runtime.types.Asn1Choice;
import java.util.List;
import java.util.Optional;
import asn2pojo.runtime.types.Asn1Type;

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
public class VehicleIdent extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private DescriptiveName name;
	@Asn1Property(tag = 1, optional = true)
	private VINstring vin;
	@Asn1Property(tag = 2, optional = true)
	private IA5String ownerCode;
	@Asn1Property(tag = 3, optional = true)
	private VehicleID id;
	@Asn1Property(tag = 4, optional = true)
	private VehicleType vehicleType;
	@Asn1Property(tag = 5, optional = true)
	private VehicleClassChoice vehicleClass;

	@Getter
	@Setter
	@JsonInclude(Include.NON_NULL)
	public static class VehicleClassChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		private VehicleGroupAffected vGroup;
		@Asn1Property(tag = 1)
		private ResponderGroupAffected rGroup;
		@Asn1Property(tag = 2)
		private IncidentResponseEquipment rEquip;

		VehicleClassChoice() {
			super(false);
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	VehicleIdent() {
		super(true);
	}
}