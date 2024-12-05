package us.dot.its.jpo.ode.plugin.j2735.NTCIP;

import lombok.Getter;
import us.dot.its.jpo.ode.plugin.types.Asn1Enumerated;
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
@Getter
@JsonSerialize(using = EssPrecipSituationSerializer.class)
@JsonDeserialize(using = EssPrecipSituationDeserializer.class)
public enum EssPrecipSituation implements Asn1Enumerated {
	OTHER(1, "other"), UNKNOWN(2, "unknown"), NOPRECIPITATION(3, "noPrecipitation"), UNIDENTIFIEDSLIGHT(4,
			"unidentifiedSlight"), UNIDENTIFIEDMODERATE(5, "unidentifiedModerate"), UNIDENTIFIEDHEAVY(6,
					"unidentifiedHeavy"), SNOWSLIGHT(7, "snowSlight"), SNOWMODERATE(8, "snowModerate"), SNOWHEAVY(9,
							"snowHeavy"), RAINSLIGHT(10, "rainSlight"), RAINMODERATE(11, "rainModerate"), RAINHEAVY(12,
									"rainHeavy"), FROZENPRECIPITATIONSLIGHT(13,
											"frozenPrecipitationSlight"), FROZENPRECIPITATIONMODERATE(14,
													"frozenPrecipitationModerate"), FROZENPRECIPITATIONHEAVY(15,
															"frozenPrecipitationHeavy");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private EssPrecipSituation(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return -1;
	}
}