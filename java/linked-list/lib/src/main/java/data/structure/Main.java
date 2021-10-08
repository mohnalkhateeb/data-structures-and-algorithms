package data.structure;

public class Main {
  public static void main(String[] args) {
    linkedListCall();
//      stackCall();
//      queueCall();
  }
  private static void linkedListCall()
  {
    System.out.println("----------------------------------------------------------------");
    System.out.println("\nLinked List Demo \n");

    LinkedList linkedList = new LinkedList();
    LinkedList list2 = new LinkedList();
    System.out.println(linkedList.toString());
    System.out.println(linkedList.kthFromEnd(4));
    linkedList.append("J");
    linkedList.append("A");
    linkedList.append("S");
    linkedList.append("O");
    linkedList.append("N");
    linkedList.append("5");
    linkedList.insert("A");
    linkedList.insert("V");
    linkedList.insert("A");
    linkedList.insert("J");
    System.out.println(linkedList.toString());
//    System.out.println(linkedList.kthFromEnd(3));
//    System.out.println(linkedList.kthFromEnd(0));
//    list2.append("3");
//    list2.insert("M");
//    list2.insertAfter("3","W");
//    System.out.println(list2.toString());

//    System.out.println("The List is => " + linkedList.size());
//    System.out.println(linkedList.include("S"));
//    System.out.println(linkedList.include("F"));
//    System.out.println(linkedList.include("N"));
//    System.out.println(linkedList.include("M"));
//    System.out.println(LinkedList.zipLists(linkedList,list2));
//    list2.insertBefore("M","1");
//    linkedList.insertBefore("I","7");
//    System.out.println(linkedList.toString());
//    linkedList.insertBefore("J","1");
////    System.out.println(linkedList.toString());
//    linkedList.insertBefore("10","4");
    linkedList.insertAfter("V","11");
    System.out.println(linkedList.toString());
    linkedList.insertAfter("KK","LL");
    linkedList.insertAfter("5","12");
    System.out.println(linkedList.toString());
    System.out.println(linkedList.kthFromEnd(8));
    try {
      System.out.println("The deleted node was => " + linkedList.remove(-3));;
    } catch (IndexOutOfBoundsException exception) {
      System.out.println(exception.getMessage());
    }

//    System.out.println(linkedList.toString());;

    System.out.println("\n----------------------------------------------------------------");
    LinkedList list4 = new LinkedList();
    LinkedList list5 = new LinkedList();
    list4.append("1");
    list4.append("3");
    list4.append("1");
//    list4.append("5");
    list5.append("4");
    list5.append("2");
    list5.append("3");
    list5.append("7");
    System.out.println(LinkedList.palindrome(list4));
    System.out.println(LinkedList.palindrome(list5));
//    LinkedList.reverse(list4);
//    LinkedList.reverse(list5);
  }
  private static void stackCall()
  {
    Stack stack = new Stack();
    String S = stack.toString();
    System.out.println(S);
    System.out.println(stack.isEmpty());
    stack.push("K");
    stack.push("L");
    stack.push("M");
    stack.push("W");
    String S1 = stack.toString();
    System.out.println(S1);

    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    stack.pop();
    System.out.println(stack.pop());
    System.out.println(stack.toString());
    System.out.println(stack.peek());
    System.out.println(stack.isEmpty());


  }
  private static void queueCall()
  {
    Queue queue = new Queue();
    String S = queue.toString();
    System.out.println(S);
    System.out.println(queue.isEmpty());
    queue.enqueue("K");
    queue.enqueue("L");
    queue.enqueue("M");
    queue.enqueue("W");
    String S1 = queue.toString();
    System.out.println(S1);

    System.out.println(queue.peek());
    System.out.println(queue.isEmpty());
    queue.dequeue();
    System.out.println(queue.dequeue());
    System.out.println(queue.toString());
    System.out.println(queue.peek());
    System.out.println(queue.isEmpty());

  }
}
