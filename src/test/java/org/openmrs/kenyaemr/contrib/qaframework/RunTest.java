/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.kenyaemr.contrib.qaframework;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        // defining ordered by name features folder
        features = { "src/features" },
        // defining the definition steps package
        glue = "org.openmrs.kenyaemr.contrib.qaframework.automation", plugin = { "html:target/index.html",
            "message:target/cucumber.ndjson" }, monochrome = true)
public class RunTest {

        public class HOOK {

                public static final String LOGIN = "@login";

                public static final String PASSWORD = "@password";

                public static final String FORM = "@form";

        }
}
