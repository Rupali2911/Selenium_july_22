package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Day8DataDrivenTest {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  Integer Sum = n + s;
	  System.out.println("Addition" + Sum);
  }
  @Test(dataProvider = "dp")
  public void diff(Integer n, Integer s) {
	  Integer Diff = n - s;
	  System.out.println("Difference" + Diff);
  }
  @Test(dataProvider = "dp")
  public void mul (Integer n, Integer s) {
	  Integer Mul = n * s;
	  System.out.println("Multiplication" + Mul);
  }
  @Test(dataProvider = "dp")
  public void div(Integer n, Integer s) {
	  Integer Div = n / s;
	  System.out.println("Divison" + Div);
  }

  @DataProvider (parallel = true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 2, 4 },
      new Object[] { 5, 6 },
      new Object[] { 2, 7 },
      new Object[] { 6, 10 },
      new Object[] { 10, 20 },
      new Object[] { 21, 32 },
      new Object[] { 34, 56 },
      new Object[] { 245, 32 },
      new Object[] { 21, 36 },
      new Object[] { 40, 30 },
      new Object[] { 20, 38 },
      new Object[] { 22, 32 },
      new Object[] { 27, 33 },
    };
  }
}
