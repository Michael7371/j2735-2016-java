package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Bitstring;
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
@JsonDeserialize(using = PublicSafetyDirectingTrafficSubTypeDeserializer.class)
public class PublicSafetyDirectingTrafficSubType extends Asn1Bitstring {

	public boolean isUnavailable() {
		return get(0);
	}

	public void setUnavailable(boolean unavailable) {
		set(0, unavailable);
	}

	public boolean isPoliceAndTrafficOfficers() {
		return get(1);
	}

	public void setPoliceAndTrafficOfficers(boolean policeAndTrafficOfficers) {
		set(1, policeAndTrafficOfficers);
	}

	public boolean isTrafficControlPersons() {
		return get(2);
	}

	public void setTrafficControlPersons(boolean trafficControlPersons) {
		set(2, trafficControlPersons);
	}

	public boolean isRailroadCrossingGuards() {
		return get(3);
	}

	public void setRailroadCrossingGuards(boolean railroadCrossingGuards) {
		set(3, railroadCrossingGuards);
	}

	public boolean isCivilDefenseNationalGuardMilitaryPolice() {
		return get(4);
	}

	public void setCivilDefenseNationalGuardMilitaryPolice(boolean civilDefenseNationalGuardMilitaryPolice) {
		set(4, civilDefenseNationalGuardMilitaryPolice);
	}

	public boolean isEmergencyOrganizationPersonnel() {
		return get(5);
	}

	public void setEmergencyOrganizationPersonnel(boolean emergencyOrganizationPersonnel) {
		set(5, emergencyOrganizationPersonnel);
	}

	public boolean isHighwayServiceVehiclePersonnel() {
		return get(6);
	}

	public void setHighwayServiceVehiclePersonnel(boolean highwayServiceVehiclePersonnel) {
		set(6, highwayServiceVehiclePersonnel);
	}

	public PublicSafetyDirectingTrafficSubType() {
		super(7, false,
				new String[]{"unavailable", "policeAndTrafficOfficers", "trafficControlPersons",
						"railroadCrossingGuards", "civilDefenseNationalGuardMilitaryPolice",
						"emergencyOrganizationPersonnel", "highwayServiceVehiclePersonnel"});
	}
}