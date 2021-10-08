package data.structure;

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

    LinkedList<String> list1 = new LinkedList();
    list1.append("Hello");
    list1.append("JAVA");
    list1.append("ASAC");
    list1.append("401");
    list1.append("Level");

    assertEquals(list1.toString(), ("\"{Hello}->{JAVA}->{ASAC}->{401}->{Level}->null\""));
    assertEquals(list1.size(), 5);
  }
  @Test
  public void testInsertBefore() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list.insertBefore("401","Software");
    list.insertBefore("Software","development");

    assertEquals(list.toString(), ("\"{Hello}->{JAVA}->{ASAC}->{development}->{Software}->{401}->null\""));
    assertEquals(list.size(), 6);
  }
  @Test
  public void testInsertBeforeNonExistValue() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list.insertBefore("5","Software");

    assertEquals(list.toString(), ("\"{Hello}->{JAVA}->{ASAC}->{401}->null\""),"The Value of insertion before it is not exist");
  }

  @Test
  public void testInsertAfter() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list.insertAfter("ASAC","Software");
    list.insertAfter("Software","development");

    assertEquals(list.toString(), ("\"{Hello}->{JAVA}->{ASAC}->{Software}->{development}->{401}->null\""));
    assertEquals(list.size(), 6);
  }
  @Test
  public void testInsertAfterNonExistValue() {


    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list.insertBefore("5","Software");

    assertEquals(list.toString(), ("\"{Hello}->{JAVA}->{ASAC}->{401}->null\""),"The Value of insertion after it is not exist");
  }
  @Test
  public void zipLinkedListTest() {

    LinkedList<String> list1 = new LinkedList();
    list.append("Hello");
    list.append("JAVA");
    list.append("ASAC");
    list.append("401");
    list1.append("Mohammad in");
    list1.append("at");
    list1.append("Level");
    LinkedList.zipLists(list,list1);
    assertEquals(list.toString(), ("\"{Hello}->{Mohammad in}->{JAVA}->{at}->{ASAC}->{Level}->{401}->null\""));
    assertEquals(list.size(), 7);
  }
}
