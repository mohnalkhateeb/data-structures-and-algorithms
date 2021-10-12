package data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackQueueBracketsTest {
  @Test
  public void testStackQueueBrackets() {
    String s1 ="";
    String S2 = "()[[Extra Characters]]";
    String S3 = "[({}]";
    String S4 = "{(})";
    assertFalse(StackQueueBrackets.stackQueueBrackets(s1), "String is empty   ");
    assertTrue(StackQueueBrackets.stackQueueBrackets(S2), "true");
    assertFalse(StackQueueBrackets.stackQueueBrackets(S3), "false   ");
    assertFalse(StackQueueBrackets.stackQueueBrackets(S4), "false   ");

  }
}
