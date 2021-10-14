package data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PesudoQueueTest {
  PseudoQueue queue = new PseudoQueue();
  @Test
  public void testToStringAndEnqueue() {

    try {
      queue.enqueue("Hello");
      queue.enqueue("JAVA");
      queue.enqueue("ASAC");
      queue.enqueue("401");

      assertEquals(queue.toString(), ("PseudoQueue{ --401--ASAC--JAVA--Hello--null}}"));
      assertEquals(queue.size(), 4);
    }catch (Exception e)
    {
      System.out.println(e.getMessage());
    }

  }
//  @Test
//  public void testIsEmpty() {
//    Queue queue2 = new Queue();
//    queue.enqueue("Hello");
//    queue.enqueue("JAVA");
//    assertTrue(queue2.isEmpty(), "queue is empty   ");
//    assertFalse(queue.isEmpty(),"queue is not empty " );
//
//  }
  @Test
  public void testDequeueEmpty() {
    try {
      Queue queue2 = new Queue();
      assertEquals(queue.dequeue(), ("PseudoQueue is Empty"));
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
//  @Test
//  public void testDequeueNonEmpty() {
//    try {
//      queue.enqueue("Hello");
//      queue.enqueue("JAVA");
//      queue.enqueue("ASAC");
//      queue.enqueue("401");
//
//      assertEquals(queue.dequeue(), "Hello");
//      assertEquals(queue.peek(), "JAVA");
//    }catch (Exception e)
//    {
//      assertEquals(queue.dequeue(), e.getMessage());
//    }

//
//  }
//  @Test
//  public void testPeekEmpty() {
//    try {
//      Queue queue2 = new Queue();
//      assertEquals(queue.peek(), ("Queue is empty"));
//    }catch (Exception e)
//    {
//      assertEquals(queue.dequeue(), e.getMessage());
//    }
//
//
//  }
//  @Test
//  public void testPeekNonEmpty() {
//    try {
//      queue.enqueue("Hello");
//      queue.enqueue("JAVA");
//      queue.enqueue("ASAC");
//      queue.enqueue("401");
//
//      assertEquals(queue.peek(), "Hello");
//    }catch (Exception e)
//    {
//      assertEquals(queue.dequeue(), e.getMessage());
//    }
//
//
//  }
  @Test
  public void testMulipleDequeuToEmpty() {
    try {
      queue.enqueue("Hello");
      queue.enqueue("JAVA");
      queue.enqueue("ASAC");
      queue.enqueue("401");
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      assertEquals(queue.dequeue(), "PseudoQueue is Empty");
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
  @Test
  public void testDequeu() {
    try {
      queue.enqueue("Hello");
      queue.enqueue("JAVA");
      queue.enqueue("ASAC");
      queue.enqueue("401");
      assertEquals(queue.dequeue(), "Hello");
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
}
