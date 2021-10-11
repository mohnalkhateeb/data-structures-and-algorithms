package data.structure;

public class PseudoQueue<T> {
  private Stack<T>inbox = new Stack();
  private Stack<T> outbox = new Stack();
  public void enqueue(T S) {inbox.push(S);}
  public T dequeue() {
    T pop = null;
    if(inbox.isEmpty()){return (T) "PseudoQueue is Empty";}
    else {
      try {
        if (outbox.isEmpty()) {
          while (!inbox.isEmpty()) {
            outbox.push(inbox.pop());
          }
          pop = outbox.pop();
          while (!outbox.isEmpty()) {
            inbox.push(outbox.pop());
          }
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return pop;
  }
  public int size()
  {
    return inbox.size();
  }

  @Override
  public String toString() {

    return "PseudoQueue{" + inbox.toString().split("p")[1] + '}';
  }
}
