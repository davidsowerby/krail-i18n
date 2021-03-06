/*
 *
 *  * Copyright (c) 2016. David Sowerby
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 *  * the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 *  * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *  * specific language governing permissions and limitations under the License.
 *
 */
package uk.q3c.krail.i18n.i18n;

import uk.q3c.krail.i18n.EnumResourceBundle;

/**
 * The base for the resource bundle of {@link PatternLabels}. The separation between them is arbitrary, but helps break down
 * what could other wise be long lists, and only one of them needs to look up parameter values:
 * <ol>
 * <li>{@link PatternLabels} : short, usually one or two words, no parameters, generally used as captions
 * <li>{@link PatternDescriptions} : longer, typically several words, no parameters, generally used in tooltips
 *
 * @author David Sowerby 3 Aug 2013
 */
public class PatternLabels extends EnumResourceBundle<PatternLabelKey> {


    public PatternLabels() {
        super();
    }


    @Override
    protected void loadMap() {

    }
}
