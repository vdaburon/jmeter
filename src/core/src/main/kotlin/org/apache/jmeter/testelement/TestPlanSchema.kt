/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jmeter.testelement

import org.apache.jmeter.config.Arguments
import org.apache.jmeter.testelement.schema.BooleanPropertyDescriptor
import org.apache.jmeter.testelement.schema.StringPropertyDescriptor
import org.apache.jmeter.testelement.schema.TestElementPropertyDescriptor
import org.apiguardian.api.API

/**
 * Lists properties of a [TestPlan].
 * @see TestPlan
 * @since 5.6
 */
@API(status = API.Status.EXPERIMENTAL, since = "5.6")
public open class TestPlanSchema protected constructor() : TestElementSchema() {
    public companion object INSTANCE : TestPlanSchema()

    public val functionalMode: BooleanPropertyDescriptor<TestPlanSchema> =
        boolean("TestPlan.functional_mode")

    public val serializeThreadgroups: BooleanPropertyDescriptor<TestPlanSchema> =
        boolean("TestPlan.serialize_threadgroups")

    public val tearDownOnShutdown: BooleanPropertyDescriptor<TestPlanSchema> =
        boolean("TestPlan.tearDown_on_shutdown", false)

    public val userDefinedVariables: TestElementPropertyDescriptor<TestPlanSchema, Arguments> =
        testElement("TestPlan.user_defined_variables")

    public val testPlanClasspath: StringPropertyDescriptor<TestPlanSchema> =
        string("TestPlan.user_define_classpath")
}
