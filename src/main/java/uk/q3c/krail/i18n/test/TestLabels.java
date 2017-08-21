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
package uk.q3c.krail.i18n.test;

import uk.q3c.krail.i18n.EnumResourceBundle;

/**
 * The base for the resource bundle of PatternLabels. This is an arbitrary division of i18N keys & values, but is loosely
 * defined as containing those value which are short, contain no parameters and are typically used for captions and
 * labels. They can of course be used anywhere.
 *
 * @author David Sowerby 9 Feb 2013
 */
public class TestLabels extends EnumResourceBundle<TestLabelKey> {


    public TestLabels() {
        super();
    }

    @Override
    protected void loadMap() {
        put(TestLabelKey.Home, "home");
        put(TestLabelKey.pattern_with_embedded_key, "Your {0} request has been refused");
        put(TestLabelKey.Transfers, "transfers");
        put(TestLabelKey.Opt, "option");
        put(TestLabelKey.Yes, "Yes");
        put(TestLabelKey.No, "No");
    }

}