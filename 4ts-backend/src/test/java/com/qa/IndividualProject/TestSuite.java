package com.qa.IndividualProject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import domainTest.DomainSuiteTest;
import restTest.restSuiteTest;

@RunWith(Suite.class)
@SuiteClasses({ DomainSuiteTest.class, restSuiteTest.class })
public class TestSuite {

}
