package TestNGPrograms;

import org.testng.annotations.Test;

public class Day5MultipleDependentTest {
  @Test
  public void OpenBrowser() {
	  System.out.println("Opening The Browser");
  }
  @Test (dependsOnMethods = {"SignIn","OpenBrowser"})
  public void LogOut() {
	  System.out.println("Logging Out");
  }
  @Test
  public void SignIn() {
	  System.out.println("Signing In");
  }
}
