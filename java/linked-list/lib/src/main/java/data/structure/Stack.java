package data.structure;

public class Stack<T> {
  private Node<T> top;
  private Node<T> topMax;
  private int size;
  public Stack() {
  }

  public void push(T data) {
    if (isEmpty()) {
      Node<T> node = new Node(data);
      top = node;
    } else {
      Node<T> node = new Node(data);
      node.setNext(top);
      top = node;

    }
    size++;
  }
  public T pop() {

      if (isEmpty()) {
        return null;
      } else {
        try{
        T data = top.getData();
        top = top.getNext();

        size--;
        return data;
      }catch (Exception e)
        {
          return (T) e;
        }}
  }

  public String peek() {
    try{
      if (isEmpty()) {
        return "The stack is empty";
      } else {
        return top.getData().toString();
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
