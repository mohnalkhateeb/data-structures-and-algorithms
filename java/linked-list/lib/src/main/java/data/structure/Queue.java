package data.structure;

public class Queue<T> {
  private Node<T> front;
  private Node<T> rear;
  private int size;
  public Queue() {
  }

  public void enqueue(T data) {
    if (isEmpty()) {
      Node<T> node = new Node(data);
      front = node;
      rear = node;
    } else {
      Node<T> node = new Node(data);
      rear.setNext(node);
      rear = node;
    }
    size++;
  }

  public T dequeue() {
    try {
      if (isEmpty()) {
        return null;
      } else {
        T data = front.getData();
        front = front.getNext();
        size--;
        return data;
      }
    }catch (Exception e)
    {
      return (T) e;
    }

  }

  public String peek() {
    try{
      if (isEmpty()) {
        return "Queue is empty";
      } else {
        return front.getData().toString();
      }
    }catch (Exception e)
    {
      return e.getMessage();
    }
  }

  public boolean isEmpty() {
    return front == null;
  }
  @Override
  public String toString() {
    StringBuilder stackString = new StringBuilder();
    try{

      if(front == null) {
        stackString.append("Queue = {Front --"
          + " " + "Rear"+
          '}');
      }
      else if(front.getNext() == null) {
        stackString.append("Queue = {Front --" +
          front.getData() + "-- Rear" +
          '}');
      }
      else {
        Node current = front;
        stackString.append("Queue ={Front --");
        while (current != null)
        {
          stackString.append(
            current.getData() +"--");
          current = current.getNext();
        }
        stackString.append("Rear}");
      }
    } catch (Exception exception)
    {
      exception.getMessage();
    }

    return stackString.toString();
  }

  public int size() {
    return size;
  }
}
