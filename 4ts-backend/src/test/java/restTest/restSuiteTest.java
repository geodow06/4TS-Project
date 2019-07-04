package restTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlgorithmEndpointTest.class, TimeLogEndpointTest.class, UserEndpointTest.class,
		CustomMethodsEndpointTest.class })
public class restSuiteTest {

}
