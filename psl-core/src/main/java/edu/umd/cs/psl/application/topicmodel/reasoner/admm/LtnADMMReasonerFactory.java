/*
 * This file is part of the PSL software.
 * Copyright 2011-2015 University of Maryland
 * Copyright 2013-2015 The Regents of the University of California
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.umd.cs.psl.application.topicmodel.reasoner.admm;

import edu.umd.cs.psl.config.ConfigBundle;
import edu.umd.cs.psl.reasoner.Reasoner;
import edu.umd.cs.psl.reasoner.ReasonerFactory;

/** A factory for creating the latent topic networks wrapper for the ADMM reasoner.
 * 
 * @author Jimmy Foulds <jfoulds@ucsc.edu>
 *
 */
public class LtnADMMReasonerFactory implements ReasonerFactory {
	
	@Override
	public Reasoner getReasoner(ConfigBundle config)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		return new LatentTopicNetworkADMMReasoner(config);
	}
}
