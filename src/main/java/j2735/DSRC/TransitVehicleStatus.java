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
@JsonDeserialize(using = TransitVehicleStatusDeserializer.class)
public class TransitVehicleStatus extends Asn1Bitstring {

	public boolean isLoading() {
		return get(0);
	}

	public void setLoading(boolean loading) {
		set(0, loading);
	}

	public boolean isAnADAuse() {
		return get(1);
	}

	public void setAnADAuse(boolean anADAuse) {
		set(1, anADAuse);
	}

	public boolean isABikeLoad() {
		return get(2);
	}

	public void setABikeLoad(boolean aBikeLoad) {
		set(2, aBikeLoad);
	}

	public boolean isDoorOpen() {
		return get(3);
	}

	public void setDoorOpen(boolean doorOpen) {
		set(3, doorOpen);
	}

	public boolean isCharging() {
		return get(4);
	}

	public void setCharging(boolean charging) {
		set(4, charging);
	}

	public boolean isAtStopLine() {
		return get(5);
	}

	public void setAtStopLine(boolean atStopLine) {
		set(5, atStopLine);
	}

	public TransitVehicleStatus() {
		super(8, false, new String[]{"loading", "anADAuse", "aBikeLoad", "doorOpen", "charging", "atStopLine"});
	}
}