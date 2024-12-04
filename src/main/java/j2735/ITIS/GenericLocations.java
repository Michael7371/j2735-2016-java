package j2735.ITIS;

import lombok.Getter;
import asn2pojo.runtime.types.Asn1Enumerated;
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
@JsonSerialize(using = GenericLocationsSerializer.class)
@JsonDeserialize(using = GenericLocationsDeserializer.class)
public enum GenericLocations implements Asn1Enumerated {
	ON_BRIDGES(7937, "on-bridges"), IN_TUNNELS(7938, "in-tunnels"), ENTERING_OR_LEAVING_TUNNELS(7939,
			"entering-or-leaving-tunnels"), ON_RAMPS(7940, "on-ramps"), IN_ROAD_CONSTRUCTION_AREA(7941,
					"in-road-construction-area"), AROUND_A_CURVE(7942, "around-a-curve"), ON_CURVE(8026,
							"on-curve"), ON_TRACKS(8009, "on-tracks"), IN_STREET(8025, "in-street"), SHOULDER(8027,
									"shoulder"), ON_MINOR_ROADS(7943, "on-minor-roads"), IN_THE_OPPOSING_LANES(7944,
											"in-the-opposing-lanes"), ADJACENT_TO_ROADWAY(7945,
													"adjacent-to-roadway"), ACROSS_TRACKS(8024,
															"across-tracks"), ON_BEND(7946, "on-bend"), INTERSECTION(
																	8032, "intersection"), ENTIRE_INTERSECTION(7947,
																			"entire-intersection"), IN_THE_MEDIAN(7948,
																					"in-the-median"), MOVED_TO_SIDE_OF_ROAD(
																							7949,
																							"moved-to-side-of-road"), MOVED_TO_SHOULDER(
																									7950,
																									"moved-to-shoulder"), ON_THE_ROADWAY(
																											7951,
																											"on-the-roadway"), DIP(
																													8010,
																													"dip"), TRAFFIC_CIRCLE(
																															8011,
																															"traffic-circle"), CROSSOVER(
																																	8028,
																																	"crossover"), CROSS_ROAD(
																																			8029,
																																			"cross-road"), SIDE_ROAD(
																																					8030,
																																					"side-road"), TO_(
																																							8014,
																																							"to"), BY(
																																									8015,
																																									"by"), THROUGH(
																																											8016,
																																											"through"), AREA_OF(
																																													8017,
																																													"area-of"), UNDER(
																																															8018,
																																															"under"), OVER(
																																																	8019,
																																																	"over"), FROM(
																																																			8020,
																																																			"from"), APPROACHING(
																																																					8021,
																																																					"approaching"), ENTERING_AT(
																																																							8022,
																																																							"entering-at"), EXITING_AT(
																																																									8023,
																																																									"exiting-at"), IN_SHADED_AREAS(
																																																											7952,
																																																											"in-shaded-areas"), IN_LOW_LYING_AREAS(
																																																													7953,
																																																													"in-low-lying-areas"), IN_THE_DOWNTOWN_AREA(
																																																															7954,
																																																															"in-the-downtown-area"), IN_THE_INNER_CITY_AREA(
																																																																	7955,
																																																																	"in-the-inner-city-area"), IN_PARTS(
																																																																			7956,
																																																																			"in-parts"), IN_SOME_PLACES(
																																																																					7957,
																																																																					"in-some-places"), IN_THE_DITCH(
																																																																							7958,
																																																																							"in-the-ditch"), IN_THE_VALLEY(
																																																																									7959,
																																																																									"in-the-valley"), ON_HILL_TOP(
																																																																											7960,
																																																																											"on-hill-top"), NEAR_THE_FOOTHILLS(
																																																																													7961,
																																																																													"near-the-foothills"), AT_HIGH_ALTITUDES(
																																																																															7962,
																																																																															"at-high-altitudes"), NEAR_THE_LAKE(
																																																																																	7963,
																																																																																	"near-the-lake"), NEAR_THE_SHORE(
																																																																																			7964,
																																																																																			"near-the-shore"), NEARBY_BASIN(
																																																																																					8008,
																																																																																					"nearby-basin"), OVER_THE_CREST_OF_A_HILL(
																																																																																							7965,
																																																																																							"over-the-crest-of-a-hill"), OTHER_THAN_ON_THE_ROADWAY(
																																																																																									7966,
																																																																																									"other-than-on-the-roadway"), NEAR_THE_BEACH(
																																																																																											7967,
																																																																																											"near-the-beach"), NEAR_BEACH_ACCESS_POINT(
																																																																																													7968,
																																																																																													"near-beach-access-point"), MOUNTAIN_PASS(
																																																																																															8006,
																																																																																															"mountain-pass"), LOWER_LEVEL(
																																																																																																	7969,
																																																																																																	"lower-level"), UPPER_LEVEL(
																																																																																																			7970,
																																																																																																			"upper-level"), AIRPORT(
																																																																																																					7971,
																																																																																																					"airport"), CONCOURSE(
																																																																																																							7972,
																																																																																																							"concourse"), GATE(
																																																																																																									7973,
																																																																																																									"gate"), BAGGAGE_CLAIM(
																																																																																																											7974,
																																																																																																											"baggage-claim"), CUSTOMS_POINT(
																																																																																																													7975,
																																																																																																													"customs-point"), RESERVATION_CENTER(
																																																																																																															8007,
																																																																																																															"reservation-center"), STATION(
																																																																																																																	7976,
																																																																																																																	"station"), PLATFORM(
																																																																																																																			7977,
																																																																																																																			"platform"), DOCK(
																																																																																																																					7978,
																																																																																																																					"dock"), DEPOT(
																																																																																																																							7979,
																																																																																																																							"depot"), EV_CHARGING_POINT(
																																																																																																																									7980,
																																																																																																																									"ev-charging-point"), INFORMATION_WELCOME_POINT(
																																																																																																																											7981,
																																																																																																																											"information-welcome-point"), AT_REST_AREA(
																																																																																																																													7982,
																																																																																																																													"at-rest-area"), AT_SERVICE_AREA(
																																																																																																																															7983,
																																																																																																																															"at-service-area"), AT_WEIGH_STATION(
																																																																																																																																	7984,
																																																																																																																																	"at-weigh-station"), ROADSIDE_PARK(
																																																																																																																																			8033,
																																																																																																																																			"roadside-park"), PICNIC_AREAS(
																																																																																																																																					7985,
																																																																																																																																					"picnic-areas"), REST_AREA(
																																																																																																																																							7986,
																																																																																																																																							"rest-area"), SERVICE_STATIONS(
																																																																																																																																									7987,
																																																																																																																																									"service-stations"), TOILETS(
																																																																																																																																											7988,
																																																																																																																																											"toilets"), BUS_STOP(
																																																																																																																																													8031,
																																																																																																																																													"bus-stop"), PARK_AND_RIDE_LOT(
																																																																																																																																															8012,
																																																																																																																																															"park-and-ride-lot"), ON_THE_RIGHT(
																																																																																																																																																	7989,
																																																																																																																																																	"on-the-right"), ON_THE_LEFT(
																																																																																																																																																			7990,
																																																																																																																																																			"on-the-left"), IN_THE_CENTER(
																																																																																																																																																					7991,
																																																																																																																																																					"in-the-center"), IN_THE_OPPOSITE_DIRECTION(
																																																																																																																																																							7992,
																																																																																																																																																							"in-the-opposite-direction"), CROSS_TRAFFIC(
																																																																																																																																																									7993,
																																																																																																																																																									"cross-traffic"), NORTHBOUND_TRAFFIC(
																																																																																																																																																											7994,
																																																																																																																																																											"northbound-traffic"), EASTBOUND_TRAFFIC(
																																																																																																																																																													7995,
																																																																																																																																																													"eastbound-traffic"), SOUTHBOUND_TRAFFIC(
																																																																																																																																																															7996,
																																																																																																																																																															"southbound-traffic"), WESTBOUND_TRAFFIC(
																																																																																																																																																																	7997,
																																																																																																																																																																	"westbound-traffic"), NORTH(
																																																																																																																																																																			7998,
																																																																																																																																																																			"north"), SOUTH(
																																																																																																																																																																					7999,
																																																																																																																																																																					"south"), EAST(
																																																																																																																																																																							8000,
																																																																																																																																																																							"east"), WEST(
																																																																																																																																																																									8001,
																																																																																																																																																																									"west"), NORTHEAST(
																																																																																																																																																																											8002,
																																																																																																																																																																											"northeast"), NORTHWEST(
																																																																																																																																																																													8003,
																																																																																																																																																																													"northwest"), SOUTHEAST(
																																																																																																																																																																															8004,
																																																																																																																																																																															"southeast"), SOUTHWEST(
																																																																																																																																																																																	8005,
																																																																																																																																																																																	"southwest");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private GenericLocations(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return -1;
	}
}