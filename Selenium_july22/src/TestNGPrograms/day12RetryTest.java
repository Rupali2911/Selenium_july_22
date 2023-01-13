package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day12RetryTest {
  @Test (retryAnalyzer =TestNGPrograms.day12RetryAnalyzer.class)
  public void first() {
	  Assert.assertEquals(false, true);
  }
  @Test
  public void Second() {
	  Assert.assertEquals(false, true);
  }
  @Test
  public void Third() {
	  Assert.assertEquals(true, true);
  }
}
