package teste;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteAngajat.class, TesteCompanie.class, TestProiect1.class, TestProiect2.class})
public class ToateTestele {

	public static void main(String[] args) {

		TestSuite suite = new TestSuite();
		TestRunner.run(suite);

	}

}
