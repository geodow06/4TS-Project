package businessTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlgorithmBusinessTest.class, TimeLogBusinessTest.class, UserBusinessTest.class,
		CustomMethodsBusinessTest.class })
public class BusinessSuiteTest {

}
