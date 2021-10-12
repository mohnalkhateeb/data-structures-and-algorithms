package data.structure;

public class Main {
  public static void main(String[] args) {
//    linkedListCall();
//    stackCall();
//    queueCall();
//    pusdoQueueCall();
//    animalCall();
    String s1 = "{(})";
    boolean f = StackQueueBrackets.stackQueueBrackets(s1);
    System.out.println(f);
  }
  private static void linkedListCall()
  {
    System.out.println("----------------------------------------------------------------");
    System.out.println("\nLinked List Demo \n");

    LinkedList linkedList = new LinkedList();
    LinkedList list2 = new LinkedList();
    System.out.println(linkedList.toString());
    System.out.println("value of index -->" + linkedList.kthFromEnd(4));
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
    System.out.println("value of index -->" + linkedList.kthFromEnd(3));
    System.out.println("value of index -->" + linkedList.kthFromEnd(0));
    linkedList.kthFromEnd(15);
    System.out.println("value of index -->" + linkedList.kthFromEnd(15));
    System.out.println("value of index -->" + linkedList.kthFromEnd(-1));
    list2.append("3");
    list2.insert("M");
    list2.insertAfter("3","W");
    System.out.println("List2 is "+list2.toString());
    System.out.println("List is "+linkedList.toString());
    LinkedList list3 = LinkedList.zipLists(linkedList,list2);
    System.out.println("List3 is "+linkedList.toString());


    linkedList.insertAfter("V","11");
//    System.out.println(linkedList.toString());
    linkedList.insertAfter("KK","LL");
    linkedList.insertAfter("5","12");
//    System.out.println(linkedList.toString());
    System.out.println("value of index -->" + linkedList.kthFromEnd(8));


//    System.out.println(linkedList.toString());;

//    System.out.println("\n----------------------------------------------------------------");
    LinkedList list4 = new LinkedList();
    LinkedList list5 = new LinkedList();
    list4.append("1");
    list4.append("3");
    list4.append("1");
    list4.append("3");
    list5.append("4");
    list5.append("2");
    list5.append("4");
    list5.append("7");
    list5.append("10");
    list5.append("P");
    System.out.println("list4 = "+list4.toString());
    System.out.println("list5 = "+list5.toString());
    System.out.println(LinkedList.zipLists(list4,list5));
    System.out.println("list4 = "+list4.toString());
    System.out.println("list5 = "+list5.toString());
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
  private static void pusdoQueueCall()
  {
    PseudoQueue pseudoQueue = new PseudoQueue();
    System.out.println(pseudoQueue.toString());
    pseudoQueue.enqueue("P");
    pseudoQueue.enqueue("8");
    pseudoQueue.enqueue("J");
    pseudoQueue.enqueue("U");
    System.out.println(pseudoQueue.toString());
    System.out.println(pseudoQueue.dequeue());
    System.out.println(pseudoQueue.toString());
    System.out.println(pseudoQueue.dequeue());
    System.out.println(pseudoQueue.dequeue());
    System.out.println(pseudoQueue.dequeue());
    System.out.println(pseudoQueue.dequeue());


  }
  private static void animalCall()
  {
    System.out.println(AnimalShelter.getAnimalQueue());
    System.out.println(AnimalShelter.dequeue());
    Animal cat = new Cat("foo");
    Animal dog = new Dog("doo");
    Animal animal = new Animal("an");
    AnimalShelter.enqueue(cat);
    AnimalShelter.enqueue(dog);
    AnimalShelter.enqueue(animal);
    System.out.println(AnimalShelter.getAnimalQueue().toString());
    System.out.println(AnimalShelter.dequeue().getName());
    System.out.println(AnimalShelter.dequeue().getName());
    try {
      System.out.println(AnimalShelter.dequeue().getName());
    }catch (Exception exception)
    {
      System.out.println(exception.getMessage());
    }
  }

}

