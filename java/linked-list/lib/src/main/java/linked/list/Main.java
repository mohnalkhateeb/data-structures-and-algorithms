package linked.list;

public class Main {
  public static void main(String[] args) {
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
    System.out.println(linkedList.kthFromEnd(3));
    System.out.println(linkedList.kthFromEnd(0));
    list2.append("3");
    list2.insert("M");
    list2.insertAfter("3","W");
    System.out.println(list2.toString());

//    System.out.println("The List is => " + linkedList.size());
    System.out.println(linkedList.include("S"));
    System.out.println(linkedList.include("F"));
    System.out.println(linkedList.include("N"));
    System.out.println(linkedList.include("M"));
    System.out.println(LinkedList.zipLists(linkedList,list2));
//    list2.insertBefore("M","1");
    linkedList.insertBefore("O","7");
//    System.out.println(linkedList.toString());
    linkedList.insertBefore("J","1");
//    System.out.println(linkedList.toString());
    linkedList.insertBefore("10","4");
    linkedList.insertAfter("V","11");
//    System.out.println(linkedList.toString());
    linkedList.insertAfter("5","12");
    System.out.println(linkedList.toString());
//    System.out.println(linkedList.kthFromEnd(8));
    try {
      System.out.println("The deleted node was => " + linkedList.remove(-3));;
    } catch (IndexOutOfBoundsException exception) {
      System.out.println(exception.getMessage());
    }

//    System.out.println(linkedList.toString());;

    System.out.println("\n----------------------------------------------------------------");

  }
}
