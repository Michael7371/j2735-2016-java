package j2735.AddGrpB;

import asn2pojo.runtime.types.Asn1Integer;
import com.fasterxml.jackson.annotation.JsonCreator;
import asn2pojo.runtime.serialization.IntegerDeserializer;

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
public class SecondsAngle extends Asn1Integer {

	public SecondsAngle() {
		super(0L, 5999L);
	}

	@JsonCreator
	public SecondsAngle(long value) {
		this();
		this.value = value;
	}

	public static class SecondsAngleDeserializer extends IntegerDeserializer<SecondsAngle> {
		public SecondsAngleDeserializer() {
			super(SecondsAngle.class);
		}

		@Override
		protected SecondsAngle construct() {
			return new SecondsAngle();
		}
	}
}