package domainTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import domainTest.AlgorithmDomainTest; 
import domainTest.TimeLogDomainTest; 
import domainTest.UserDomainTest;

@RunWith(Suite.class) 
@SuiteClasses({AlgorithmDomainTest.class, TimeLogDomainTest.class, UserDomainTest.class})
public class DomainSuiteTest {

}
