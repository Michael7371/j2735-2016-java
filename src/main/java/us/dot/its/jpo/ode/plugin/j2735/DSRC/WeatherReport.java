package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import us.dot.its.jpo.ode.plugin.j2735.NTCIP.EssPrecipYesNo;
import us.dot.its.jpo.ode.plugin.annotations.Asn1Property;
import us.dot.its.jpo.ode.plugin.j2735.NTCIP.EssPrecipRate;
import us.dot.its.jpo.ode.plugin.j2735.NTCIP.EssPrecipSituation;
import us.dot.its.jpo.ode.plugin.j2735.NTCIP.EssSolarRadiation;
import us.dot.its.jpo.ode.plugin.j2735.NTCIP.EssMobileFriction;
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
public class WeatherReport extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private EssPrecipYesNo isRaining;
	@Asn1Property(tag = 1, optional = true)
	@JsonDeserialize(using = EssPrecipRate.EssPrecipRateDeserializer.class)
	private EssPrecipRate rainRate;
	@Asn1Property(tag = 2, optional = true)
	private EssPrecipSituation precipSituation;
	@Asn1Property(tag = 3, optional = true)
	@JsonDeserialize(using = EssSolarRadiation.EssSolarRadiationDeserializer.class)
	private EssSolarRadiation solarRadiation;
	@Asn1Property(tag = 4, optional = true)
	@JsonDeserialize(using = EssMobileFriction.EssMobileFrictionDeserializer.class)
	private EssMobileFriction friction;
	@Asn1Property(tag = 5, optional = true)
	@JsonDeserialize(using = CoefficientOfFriction.CoefficientOfFrictionDeserializer.class)
	private CoefficientOfFriction roadFriction;

	WeatherReport() {
		super(true);
	}
}