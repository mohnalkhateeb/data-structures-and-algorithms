package linked.list;

public class LinkedList<flag> {
  private Node head;
  private int size;

  public LinkedList() {
  }

  public void append(String data) {

    if (head == null) {
      Node node = new Node(data);
      head = node;
      size++;
    } else {
      // else traverse the list and get to the end
      // make last node point to the new node
      Node current;
      current = head;
      while (current.getNext() != null) {
        // moves the current reference along the list
        current = current.getNext();
      }

      Node node = new Node(data);
      current.setNext(node);
      size++;
    }
  }
  public void insertBefore(String before , String data) {
    try {
      if (head == null) {
        System.out.println("list Not found , Use append method ");
      }else if(head.toString()==before)
      {
        this.insert(data);
      }
      else {
        Node beforeNode ;
        Node current;
        current = head;
        beforeNode = head.getNext();
        while (beforeNode.toString() != before) {
          // moves the current reference along the list
          current = current.getNext();
          beforeNode = beforeNode.getNext();
        }

        Node node = new Node(data);
        current.setNext(node);
        current = current.getNext();
        current.setNext(beforeNode);
        size++;
      }
    }catch (Exception exception)
    {
      System.out.println(exception.getMessage());
    }

  }
  public void insertAfter(String after , String data) {
    try {
      if (head == null) {
        System.out.println("list Not found , Use append method ");
      }
      else {
        Node afterNode ;
        Node current;
        current = head.getNext();
        afterNode = head;
        while (afterNode.toString() != after) {
          // moves the current reference along the list
          current = current.getNext();
          afterNode = afterNode.getNext();
        }

        Node node = new Node(data);
        afterNode.setNext(node);
        afterNode = afterNode.getNext();
        afterNode.setNext(current);
        size++;
      }
    }catch (Exception exception)
    {
      System.out.println(exception.getMessage());
    }

  }


  public String remove(int index) throws IndexOutOfBoundsException {
    String deletedNode = "";
    if (head == null) {
      System.out.println("List is empty");
    } else {
      if (index > size || index < 0) {
        throw new IndexOutOfBoundsException("Index out of bounds");
      }

      // if deleting first node
      if (index == 0) {
        deletedNode = head.getData();
        head = head.getNext();
        size--;
        return deletedNode;
      }

      int counter = 0;

      Node previous = null;
      Node current = head;

      while (counter != index) {
        previous = current;
        current = current.getNext();
        counter++;
      }

      previous.setNext(current.getNext());
      current.setNext(null);
      deletedNode = current.getData();
      size--;
    }

    return deletedNode;
  }
  // ***********************************************************
  // ***********************************************************
  // ***********************************************************

  public void insert(String data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
    } else {


      node.setNext(head);
      head = node;
    }
    size++;
  }

  public boolean include(String data) {
    boolean flag = false;
    Node current;
    current = head;
    while (current != null) {
      if (current.toString() == data ) {
        flag = true;
      System.out.println("List has" + " " +data);

      }

      current = current.getNext();
    }
    if(flag == false)  System.out.println("List doesn't have" + " " + data);
    return flag;
  }

  @Override
  public String toString() {

    StringBuilder listPrint = new StringBuilder();



    if (head == null) {
      listPrint.append("List is empty")  ;
    } else {

      Node current = head;

      listPrint.append("\"");

      while (current != null) {
        // moves the current reference along the list
        listPrint.append("{").append(current.toString()).append("}").append("->");
        current = current.getNext();
      }

      listPrint.append("null").append("\"");
   }
    return listPrint.toString();
  }

  // ***********************************************************
  // ***********************************************************
  // ***********************************************************

  public int size() {
    return size;
  }
}

