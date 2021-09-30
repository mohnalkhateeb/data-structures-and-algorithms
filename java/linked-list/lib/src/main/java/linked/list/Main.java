package linked.list;

public class Main {
  public static void main(String[] args) {
    System.out.println("----------------------------------------------------------------");
    System.out.println("\nLinked List Demo \n");

    LinkedList linkedList = new LinkedList();
    System.out.println(linkedList.toString());;
    linkedList.add("J");
    linkedList.add("A");
    linkedList.add("S");
    linkedList.add("O");
    linkedList.add("N");
    linkedList.insert("A");
    linkedList.insert("V");
    linkedList.insert("A");
    linkedList.insert("J");
    System.out.println(linkedList.toString());;
    System.out.println("The List is => " + linkedList.size());
    System.out.println(linkedList.include("S"));
    System.out.println(linkedList.include("F"));
    System.out.println(linkedList.include("N"));
    System.out.println(linkedList.include("M"));


    try {
      System.out.println("The deleted node was => " + linkedList.remove(-3));;
    } catch (IndexOutOfBoundsException exception) {
      System.out.println(exception.getMessage());
    }

    System.out.println(linkedList.toString());;

    System.out.println("\n----------------------------------------------------------------");
  }
}
