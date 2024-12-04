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
@JsonDeserialize(using = LaneAttributes_BikeDeserializer.class)
public class LaneAttributes_Bike extends Asn1Bitstring {

	public boolean isBikeRevocableLane() {
		return get(0);
	}

	public void setBikeRevocableLane(boolean bikeRevocableLane) {
		set(0, bikeRevocableLane);
	}

	public boolean isPedestrianUseAllowed() {
		return get(1);
	}

	public void setPedestrianUseAllowed(boolean pedestrianUseAllowed) {
		set(1, pedestrianUseAllowed);
	}

	public boolean isIsBikeFlyOverLane() {
		return get(2);
	}

	public void setIsBikeFlyOverLane(boolean isBikeFlyOverLane) {
		set(2, isBikeFlyOverLane);
	}

	public boolean isFixedCycleTime() {
		return get(3);
	}

	public void setFixedCycleTime(boolean fixedCycleTime) {
		set(3, fixedCycleTime);
	}

	public boolean isBiDirectionalCycleTimes() {
		return get(4);
	}

	public void setBiDirectionalCycleTimes(boolean biDirectionalCycleTimes) {
		set(4, biDirectionalCycleTimes);
	}

	public boolean isIsolatedByBarrier() {
		return get(5);
	}

	public void setIsolatedByBarrier(boolean isolatedByBarrier) {
		set(5, isolatedByBarrier);
	}

	public boolean isUnsignalizedSegmentsPresent() {
		return get(6);
	}

	public void setUnsignalizedSegmentsPresent(boolean unsignalizedSegmentsPresent) {
		set(6, unsignalizedSegmentsPresent);
	}

	public LaneAttributes_Bike() {
		super(16, false, new String[]{"bikeRevocableLane", "pedestrianUseAllowed", "isBikeFlyOverLane",
				"fixedCycleTime", "biDirectionalCycleTimes", "isolatedByBarrier", "unsignalizedSegmentsPresent"});
	}
}