package j2735.AddGrpC;

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
@JsonSerialize(using = EmissionTypeSerializer.class)
@JsonDeserialize(using = EmissionTypeDeserializer.class)
public enum EmissionType implements Asn1Enumerated {
	TYPEA(0, "typeA"), TYPEB(1, "typeB"), TYPEC(2, "typeC"), TYPED(3, "typeD"), TYPEE(4, "typeE");

	private final int index;
	private final String name;

	public boolean hasExtensionMarker() {
		return false;
	}

	private EmissionType(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public int maxIndex() {
		return 4;
	}
}