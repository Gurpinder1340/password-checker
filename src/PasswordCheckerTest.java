import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testShortPassword() {
    PasswordChecker checker = new PasswordChecker(6,12);
    assertEquals("short", checker.describePasswordLength("123"));
  }

 // test for describePasswordLength()'s medium password
  @Test
  void testMediumPassword() {
    PasswordChecker checker = new PasswordChecker(5, 10);
    String result = checker.describePasswordLength("abcdef"); 
    assertEquals("medium", result);
  }


  @Test
  void testLongPassword() {
    PasswordChecker checker = new PasswordChecker(6,12);
    assertEquals("long", checker.describePasswordLength("password12345"));
  }

}
  