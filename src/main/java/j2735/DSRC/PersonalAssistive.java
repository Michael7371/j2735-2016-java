package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Bitstring;
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
@JsonDeserialize(using = PersonalAssistiveDeserializer.class)
public class PersonalAssistive extends Asn1Bitstring {

	public boolean isUnavailable() {
		return get(0);
	}

	public void setUnavailable(boolean unavailable) {
		set(0, unavailable);
	}

	public boolean isOtherType() {
		return get(1);
	}

	public void setOtherType(boolean otherType) {
		set(1, otherType);
	}

	public boolean isVision() {
		return get(2);
	}

	public void setVision(boolean vision) {
		set(2, vision);
	}

	public boolean isHearing() {
		return get(3);
	}

	public void setHearing(boolean hearing) {
		set(3, hearing);
	}

	public boolean isMovement() {
		return get(4);
	}

	public void setMovement(boolean movement) {
		set(4, movement);
	}

	public boolean isCognition() {
		return get(5);
	}

	public void setCognition(boolean cognition) {
		set(5, cognition);
	}

	public PersonalAssistive() {
		super(6, false, new String[]{"unavailable", "otherType", "vision", "hearing", "movement", "cognition"});
	}
}