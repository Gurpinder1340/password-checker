import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

  //test for isAlphanumeric()
  @Test
  void testAlphanumericPassword() {
    // Arrange
    PasswordChecker checker = new PasswordChecker(5, 10);
    String password = "abc123";
    // Act
    boolean result = checker.isAlphanumeric(password);
    // Assert
    assertTrue(result);
  }

    @Test
    void testPasswordWithSpecialCharacter() {
      // Arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      String password = "abc@123";
      // Act
      boolean result = checker.isAlphanumeric(password);
      // Assert
      assertFalse(result);
    }

    @Test
    void testPasswordWithOnlyLetters() {
      // Arrange
      PasswordChecker checker = new PasswordChecker(5, 10);
      String password = "abcdef";
      // Act
      boolean result = checker.isAlphanumeric(password);
      // Assert
      assertTrue(result);
    }

}
  