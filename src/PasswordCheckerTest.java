import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {

  @Test
  public void testShortPassword() {
    PasswordChecker checker = new PasswordChecker(6,12);
    assertEquals("short", checker.describePasswordLength("123"));
  }

}

//how're you doing?