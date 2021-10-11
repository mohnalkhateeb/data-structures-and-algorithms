package data.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalShelterTest {
  Queue<Animal> queue = new Queue();
  @Test
  public void testEnqueue() {

    try {
      Animal cat = new Cat("foo");
      Animal dog = new Dog(("doo"));
      Animal elph = new Animal("an");
      queue.enqueue(cat);
      queue.enqueue(dog);
      queue.enqueue(elph);

      assertEquals(queue.toString(), ("Queue ={Front --Animal{name='foo', type='Cat'}--Animal{name='doo', type='Dog'}--Animal{name='an', type='null'}--Rear}"));
      assertEquals(queue.size(), 3);
    }catch (Exception e)
    {
      System.out.println(e.getMessage());
    }

  }

  @Test
  public void testDequeueEmpty() {
    try {
      assertEquals(queue.dequeue(), null);
    }catch (Exception e)
    {
      assertEquals(queue.dequeue(), e.getMessage());
    }


  }
  @Test
  public void testDequeueNonEmpty() {
    try {
      Animal cat = new Cat("foo");
      Animal dog = new Dog(("doo"));
      Animal elph = new Animal("an");
      queue.enqueue(cat);
      queue.enqueue(dog);
      queue.enqueue(elph);

      assertEquals(queue.dequeue(), cat);
      assertEquals(queue.dequeue(), dog);
    } catch (Exception e) {
      assertEquals(queue.dequeue(), e.getMessage());
    }
  }

  }
