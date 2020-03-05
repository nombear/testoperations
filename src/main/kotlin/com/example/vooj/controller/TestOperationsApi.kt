package com.example.vooj.controller

import com.example.vooj.model.TestOutput
import com.example.vooj.model.TestResults
import com.example.vooj.repository.TestResultsRepository
import org.springframework.web.bind.annotation.GetMapping


//@Controller
class TestOperationsApi(private val resultsRepository: TestResultsRepository ) : TestOperationsInterface {
    override fun generateTemplateProject(): Object {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun runTest(testId: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @GetMapping
    override fun getTestList(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun getTestResults(): List<TestResults> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return resultsRepository.findAll() as List<TestResults>
    }

    override fun retrieveTestOutput(): TestOutput {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}