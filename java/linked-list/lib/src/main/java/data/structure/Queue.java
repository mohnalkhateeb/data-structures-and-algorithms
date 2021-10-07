package data.structure;

public class Queue {
  private Node front;
  private Node rear;
  private int size;
  public Queue() {
  }

  public void enqueue(String data) {
    if (isEmpty()) {
      Node node = new Node(data);
      front = node;
      rear = node;
    } else {
      Node node = new Node(data);
      rear.setNext(node);
      rear = node;
    }
    size++;
  }

  public String dequeue() {
    try {
      if (isEmpty()) {
        return "Queue is empty";
      } else {
        String data = front.getData();
        front = front.getNext();
        size--;
        return data;
      }
    }catch (Exception e)
    {
      return e.getMessage();
    }

  }

  public String peek() {
    try{
      if (isEmpty()) {
        return "Queue is empty";
      } else {
        return front.getData();
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
