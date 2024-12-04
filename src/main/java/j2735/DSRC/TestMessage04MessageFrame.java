package j2735.DSRC;

import com.fasterxml.jackson.annotation.JsonRootName;
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
@JsonRootName("MessageFrame")
public class TestMessage04MessageFrame extends MessageFrame<TestMessage04> {

	public TestMessage04MessageFrame() {
		super(244, "TestMessage04");
	}

	@Override
	@JsonSerialize(using = TestMessage04MessageFrameValueSerializer.class)
	public TestMessage04 getValue() {
		return super.getValue();
	}

	@Override
	@JsonDeserialize(using = TestMessage04MessageFrameValueDeserializer.class)
	public void setValue(TestMessage04 value) {
		super.setValue(value);
	}
}