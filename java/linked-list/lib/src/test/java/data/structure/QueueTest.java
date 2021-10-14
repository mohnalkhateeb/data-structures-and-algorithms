package data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
  //    Queue ={Front --K--L--M--W--Rear}
  Queue queue = new Queue();
  @Test
  public void testToString() {

    try {
      queue.enqueue("Hello");
      queue.enqueue("JAVA");
      queue.enqueue("ASAC");
      queue.enqueue("401");

      assertEquals(queue.toString(), ("Queue ={Front --Hello--JAVA--ASAC--401--Rear}"));
      assertEquals(queue.size(), 4);
    }catch (Exception e)
    {
      System.out.println(e.getMessage());
    }

  }
  @Test
  public void testIsEmpty() {
    Queue queue2 = new Queue();
    queue.enqueue("Hello");
    queue.enqueue("JAVA");
    assertTrue(queue2.isEmpty(), "queue is empty   ");
    assertFalse(queue.isEmpty(),"queue is not empty " );

  }
  @Test
  public void testDequeueEmpty() {
    try {
      Queue queue2 = new Queue();
      assertEquals(queue.dequeue(), ("Queue is empty"));
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
  @Test
  public void testDequeueNonEmpty() {
    try {
      queue.enqueue("Hello");
      queue.enqueue("JAVA");
      queue.enqueue("ASAC");
      queue.enqueue("401");

      assertEquals(queue.dequeue(), "Hello");
      assertEquals(queue.peek(), "JAVA");
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
  @Test
  public void testPeekEmpty() {
    try {
      Queue queue2 = new Queue();
      assertEquals(queue.peek(), ("Queue is empty"));
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
  @Test
  public void testPeekNonEmpty() {
    try {
      queue.enqueue("Hello");
      queue.enqueue("JAVA");
      queue.enqueue("ASAC");
      queue.enqueue("401");

      assertEquals(queue.peek(), "Hello");
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
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
      assertEquals(queue.peek(), "Queue is empty");
      assertEquals(queue.dequeue(), "Queue is empty");
      assertEquals(queue.isEmpty() , true);
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
}
