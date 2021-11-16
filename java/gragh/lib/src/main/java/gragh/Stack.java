package gragh;

public class Stack<T> {

  Node<T> top;

  public void push(Node<T> node){
    node.next = top;
    top = node;
  }

  public Node<T> pop() {
    try {
      Node<T> temp = top;
      top = top.next;
      temp.next = null;
      return temp;
    } catch (NullPointerException e) {
      e.printStackTrace();
      System.out.println("The List is empty");
      return null;
    }
  }

  public boolean isEmpty(){
    if (top == null) return true;
    return false;
  }

  @Override
  public String toString() {
    if (top == null) return "null";
    String outList = "Top = ";
    Node<T> current = top;
    while (current != null){
      outList += current.value+ " -> ";
      current = current.next;
    }
    outList += "Null";
    return outList;
  }
}
