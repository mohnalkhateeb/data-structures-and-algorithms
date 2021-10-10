package data.structure;

public class PseudoQueue {
  private Stack inbox = new Stack();
  private Stack outbox = new Stack();
  public void enqueue(String S) {inbox.push(S);}
  public String dequeue() {
    String pop = "";
    if(inbox.isEmpty()){pop = "PseudoQueue is Empty";}
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
