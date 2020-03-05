package com.example.vooj.controller

import com.example.vooj.model.TestOutput
import com.example.vooj.model.TestResults

interface TestOperationsInterface {

    fun generateTemplateProject() : Object

    fun runTest(testId: Any)

    fun getTestList() : List<String>

    fun getTestResults() : List<TestResults>

    fun retrieveTestOutput() : TestOutput

}