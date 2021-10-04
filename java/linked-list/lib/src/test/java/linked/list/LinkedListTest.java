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

    assertEquals(list.toString(), ("\"{401}->{ASAC}->{JAVA}->{Hello}->null\""));
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
  @Test
  public void testAppend() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");

    assertEquals(list.toString(), ("\"{Hello}->{JAVa}->{ASAC}->{401}->null\""));
    assertEquals(list.size(), 4);
  }
  @Test
  public void testInsertBefore() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list.insertBefore("401","Software");

    assertEquals(list.toString(), ("\"{Hello}->{JAVa}->{ASAC}->{Software}->{401}->null\""));
    assertEquals(list.size(), 4);
  }
  @Test
  public void testInsertAfter() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list.insertAfter("Software","Software");

    assertEquals(list.toString(), ("\"{Hello}->{JAVa}->{ASAC}->{Software}->{401}->null\""));
    assertEquals(list.size(), 4);
  }
}
