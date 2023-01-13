package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class Day8DPTest2 {
  @DataProvider
  public Object[][] FBLogin() {
    return new Object[][] {
    	new Object[] { "yogruppatil@gmail.com" ,"Devansh181213"},
        new Object[] { "yogruppatil@yahoo.com" ,"Dev181213" },
        new Object[] { "YogrupPatil@gmail.com" ,"Devansh1812" },
        new Object[] { "yogrup@gmail.com" ,"Devansh@181213" },
    };
  }
}
