package data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
  Stack stack = new Stack();
  @Test
  public void testToString() {

    try {
      stack.push("Hello");
      stack.push("JAVA");
      stack.push("ASAC");
      stack.push("401");

      assertEquals(stack.toString(), ("Stack ={top --401--ASAC--JAVA--Hello--null}"));
      assertEquals(stack.size(), 4);
    }catch (Exception e)
    {
      System.out.println(e.getMessage());
    }

  }
  @Test
  public void testIsEmpty() {
    Stack stack2 = new Stack();
    stack.push("Hello");
    stack.push("JAVA");
    assertTrue(stack2.isEmpty(), "stack is empty   ");
    assertFalse(stack.isEmpty(),"stack is not empty " );

  }
@Test
  public void testPopEmpty() {
    try {
      Stack stack2 = new Stack();
      assertEquals(stack.pop(), ("The stack is empty"));
    }catch (Exception e)
    {
      assertEquals(stack.pop(), e.getMessage());
    }


  }
  @Test
  public void testPopNonEmpty() {
    try {
      stack.push("Hello");
      stack.push("JAVA");
      stack.push("ASAC");
      stack.push("401");

      assertEquals(stack.pop(), "401");
      assertEquals(stack.peek(), "ASAC");
    }catch (Exception e)
    {
      assertEquals(stack.pop(), e.getMessage());
    }


  }
  @Test
  public void testPeekEmpty() {
    try {
      Stack stack2 = new Stack();
      assertEquals(stack.peek(), ("The stack is empty"));
    }catch (Exception e)
    {
      assertEquals(stack.pop(), e.getMessage());
    }


  }
  @Test
  public void testPeekNonEmpty() {
    try {
      stack.push("Hello");
      stack.push("JAVA");
      stack.push("ASAC");
      stack.push("401");

      assertEquals(stack.peek(), "401");
    }catch (Exception e)
    {
      assertEquals(stack.pop(), e.getMessage());
    }


  }

}
