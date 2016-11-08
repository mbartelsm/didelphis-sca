/******************************************************************************
 * Copyright (c) 2015. Samantha Fiona McCabe                                  *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License");            *
 * you may not use this file except in compliance with the License.           *
 * You may obtain a copy of the License at                                    *
 *     http://www.apache.org/licenses/LICENSE-2.0                             *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 ******************************************************************************/

package org.didelphis.phonetic;

import org.didelphis.phonetic.model.FeatureSpecification;

/**
 * Samantha Fiona Morrigan McCabe
 * Created: 1/21/2015
 */
public interface SpecificationBearer {

	/**
	 * Returns the model used by this ModelBearer
	 * @return the FeatureModel; must never be null
	 */
	FeatureSpecification getSpecification();
}