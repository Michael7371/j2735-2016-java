package us.dot.its.jpo.ode.plugin.j2735.DSRC;

import us.dot.its.jpo.ode.plugin.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
abstract public class PartIIcontent<TValue> extends Asn1Sequence {

	@JsonIgnore
	@JsonDeserialize(using = PartII_Id.PartII_IdDeserializer.class)
	final protected PartII_Id partII_Id;
	@JsonIgnore
	final protected String name;
	private TValue partII_Value;
	public final static String INFORMATION_OBJECT_CLASS = "PARTII_EXT_ID_AND_TYPE";

	public PartII_Id getPartII_Id() {
		return partII_Id;
	}

	public String getName() {
		return name;
	}

	@JsonProperty("partII-Id")
	public String getIdString() {
		return partII_Id.toString();
	}

	public TValue getPartII_Value() {
		return partII_Value;
	}

	public void setPartII_Value(TValue partII_Value) {
		this.partII_Value = partII_Value;
	}

	public PartIIcontent(int id, String name) {
		super(true);
		var theId = new PartII_Id();
		theId.setValue(id);
		this.partII_Id = theId;
		this.name = name;
	}
}