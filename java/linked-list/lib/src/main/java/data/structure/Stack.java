package data.structure;

public class Stack {
  private Node top;
  private int size;
  public Stack() {
  }

  public void push(String data) {
    if (isEmpty()) {
      Node node = new Node(data);
      top = node;
    } else {
      Node node = new Node(data);
      node.setNext(top);
      top = node;
    }
    size++;
  }

  public String pop() {

      if (isEmpty()) {
        return "The stack is empty";
      } else {
        try{
        String data = top.getData();
        top = top.getNext();
        size--;
        return data;
      }catch (Exception e)
        {
          return e.getMessage();
        }}
  }

  public String peek() {
    try{
      if (isEmpty()) {
        return "The stack is empty";
      } else {
        return top.getData();
      }
    }catch (Exception e)
    {
      return e.getMessage();
    }

  }

  public boolean isEmpty() {
    return top == null;
  }
  public int size() {
    return size;
  }
  @Override
  public String toString() {
    StringBuilder stackString = new StringBuilder();
    try{

      if(top == null) {
        stackString.append("Stack = {top --"
           + " " +
          '}');
      }
      else if(top.getNext() == null) {
        stackString.append("Stack = {top --" +
          top.getData() + "-- null" +
          '}');
      }
      else {
        Node current = top;
        stackString.append("Stack ={top --");
        while (current != null)
        {
          stackString.append(
            current.getData() +"--");
          current = current.getNext();
        }
        stackString.append("null}");
      }
    } catch (Exception exception)
    {
      exception.getMessage();
    }

    return stackString.toString();
  }
}
