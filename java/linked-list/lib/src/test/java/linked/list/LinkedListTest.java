package linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  LinkedList list = new LinkedList();
  @Test
  public void testInsert() {


    list.insert("Hello");
    list.insert("JAVA");
    list.insert("ASAC");
    list.insert("401");

    assertEquals(list.toString(), ("\"{Hello}->{JAVA}->{ASAC}->{401}->null\""));
    assertEquals(list.size(), 4);
  }
  @Test
  public void testFind() {
    LinkedList list = new LinkedList();
    list.insert("Hello");
    list.insert("JAVA");
    list.insert("ASAC");
    list.insert("401");
    assertTrue(list.include("Hello"), "value includes in List   ");
    assertFalse(list.include("OOH"),"value does not includes List  " );

  }
}
