import org.junit.*;

public class MyTest {
  @Test
  public void shouldFail() {
    System.out.println("This is test output");
    Assert.fail("This is a failure");
  }
}
