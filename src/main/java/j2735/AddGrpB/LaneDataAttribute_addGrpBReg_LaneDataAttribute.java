package j2735.AddGrpB;

import com.fasterxml.jackson.annotation.JsonRootName;
import j2735.REGION.Reg_LaneDataAttribute;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
@JsonRootName("Reg_LaneDataAttribute")
public class LaneDataAttribute_addGrpBReg_LaneDataAttribute extends Reg_LaneDataAttribute<LaneDataAttribute_addGrpB> {

	public LaneDataAttribute_addGrpBReg_LaneDataAttribute() {
		super(2, "LaneDataAttribute_addGrpB");
	}

	@Override
	@JsonSerialize(using = LaneDataAttribute_addGrpBReg_LaneDataAttributeValueSerializer.class)
	public LaneDataAttribute_addGrpB getRegExtValue() {
		return super.getRegExtValue();
	}

	@Override
	@JsonDeserialize(using = LaneDataAttribute_addGrpBReg_LaneDataAttributeValueDeserializer.class)
	public void setRegExtValue(LaneDataAttribute_addGrpB value) {
		super.setRegExtValue(value);
	}
}