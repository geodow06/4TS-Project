package com.qa.IndividualProject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import businessTest.BusinessSuiteTest;
import domainTest.DomainSuiteTest;
import restTest.restSuiteTest;

@RunWith(Suite.class)
@SuiteClasses({ BusinessSuiteTest.class, DomainSuiteTest.class, restSuiteTest.class })
public class TestSuite {

}
 