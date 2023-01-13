package TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7optionalTest {
  @Test
  @Parameters ("message")
  public void OP(@Optional("optional massage selcted")String massage) {
	  System.out.println("message");
  }
  @Test
  @Parameters({"Val1","Val2"})
  public void OP1(@Optional("10")int Val1,@Optional("20")int Val2) {
	  int FinalSum = Val1 + Val2;
	  System.out.println("Final Addition is"+ FinalSum);
  }
}
