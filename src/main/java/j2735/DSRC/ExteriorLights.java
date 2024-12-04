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
@JsonDeserialize(using = ExteriorLightsDeserializer.class)
public class ExteriorLights extends Asn1Bitstring {

	public boolean isLowBeamHeadlightsOn() {
		return get(0);
	}

	public void setLowBeamHeadlightsOn(boolean lowBeamHeadlightsOn) {
		set(0, lowBeamHeadlightsOn);
	}

	public boolean isHighBeamHeadlightsOn() {
		return get(1);
	}

	public void setHighBeamHeadlightsOn(boolean highBeamHeadlightsOn) {
		set(1, highBeamHeadlightsOn);
	}

	public boolean isLeftTurnSignalOn() {
		return get(2);
	}

	public void setLeftTurnSignalOn(boolean leftTurnSignalOn) {
		set(2, leftTurnSignalOn);
	}

	public boolean isRightTurnSignalOn() {
		return get(3);
	}

	public void setRightTurnSignalOn(boolean rightTurnSignalOn) {
		set(3, rightTurnSignalOn);
	}

	public boolean isHazardSignalOn() {
		return get(4);
	}

	public void setHazardSignalOn(boolean hazardSignalOn) {
		set(4, hazardSignalOn);
	}

	public boolean isAutomaticLightControlOn() {
		return get(5);
	}

	public void setAutomaticLightControlOn(boolean automaticLightControlOn) {
		set(5, automaticLightControlOn);
	}

	public boolean isDaytimeRunningLightsOn() {
		return get(6);
	}

	public void setDaytimeRunningLightsOn(boolean daytimeRunningLightsOn) {
		set(6, daytimeRunningLightsOn);
	}

	public boolean isFogLightOn() {
		return get(7);
	}

	public void setFogLightOn(boolean fogLightOn) {
		set(7, fogLightOn);
	}

	public boolean isParkingLightsOn() {
		return get(8);
	}

	public void setParkingLightsOn(boolean parkingLightsOn) {
		set(8, parkingLightsOn);
	}

	public ExteriorLights() {
		super(9, false,
				new String[]{"lowBeamHeadlightsOn", "highBeamHeadlightsOn", "leftTurnSignalOn", "rightTurnSignalOn",
						"hazardSignalOn", "automaticLightControlOn", "daytimeRunningLightsOn", "fogLightOn",
						"parkingLightsOn"});
	}
}