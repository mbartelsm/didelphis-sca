/*******************************************************************************
 * Copyright (c) 2015. Samantha Fiona McCabe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.haedus.datatypes.tables;

/**
 * Author: goats
 * Created: 12/14/2014
 */
public class SquareTable<T> extends RectangularTable<T> {

	protected SquareTable(int r, int c) {
		super(r, c);
	}

	public SquareTable(T defaultValue, int n) {
		super(defaultValue, n, n);
	}
}
