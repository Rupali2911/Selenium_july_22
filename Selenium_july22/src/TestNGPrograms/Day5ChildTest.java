package TestNGPrograms;

import org.testng.annotations.Test;

public class Day5ChildTest extends Day5BaseTest {
  @Test (dependsOnMethods="openBrowser")
  public void Login() {
	  System.out.println ("This will execute second (LogIn)");
  }
}
