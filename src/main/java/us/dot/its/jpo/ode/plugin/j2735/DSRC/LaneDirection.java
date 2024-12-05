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
@JsonDeserialize(using = LaneDirectionDeserializer.class)
public class LaneDirection extends Asn1Bitstring {

	public boolean isIngressPath() {
		return get(0);
	}

	public void setIngressPath(boolean ingressPath) {
		set(0, ingressPath);
	}

	public boolean isEgressPath() {
		return get(1);
	}

	public void setEgressPath(boolean egressPath) {
		set(1, egressPath);
	}

	public LaneDirection() {
		super(2, false, new String[]{"ingressPath", "egressPath"});
	}
}