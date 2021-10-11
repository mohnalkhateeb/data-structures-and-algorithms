package data.structure;

public class LinkedList<T> {
  private Node<T> head;
  private int size;

  public LinkedList() {
  }

  public void append(T data) {

    if (head == null) {
      Node<T> node = new Node<>(data);
      head = node;
      size++;
    } else {
      // else traverse the list and get to the end
      // make last node point to the new node
      Node<T> current;
      current = head;
      while (current.getNext() != null) {
        // moves the current reference along the list
        current = current.getNext();
      }

      Node<T> node = new Node<>(data);
      current.setNext(node);
      size++;
    }
  }

  public void insertBefore(T before , T data) {
    try {
      if (head == null) {
        System.out.println("list Not found , Use append method ");
      }
        else if(head.toString()==before.toString())
      {
        this.insert(data);
      }
      else {
        boolean flag = false;
        Node<T> beforeNode ;
        Node<T> current;
        current = head;
        beforeNode = head.getNext();
        while ( beforeNode !=null) {
          if(beforeNode.toString() == before.toString())
          {
            Node<T> node = new Node(data);
            current.setNext(node);
            current = current.getNext();
            current.setNext(beforeNode);
            size++;
            flag = true;
            break;
          }
          else {
            current = current.getNext();
            beforeNode = beforeNode.getNext();
          }

        }
        if (flag == false)
        {
          System.out.println("The Value of insertion before it is not exist ");
        }
      }
    }catch (Exception exception)
    {
      System.out.println(exception.getMessage());
    }

  }
  public void insertAfter(T after , T data) {
    try {
      if (head == null) {
        System.out.println("list Not found , Use append method ");
      }
      else {
        boolean flag = false;
        Node<T> afterNode ;
        Node<T> current;
        current = head.getNext();
        afterNode = head;
        while (afterNode.getNext() != null) {
          if(afterNode.toString() == after.toString())
          {
            Node node = new Node(data);
            afterNode.setNext(node);
            afterNode = afterNode.getNext();
            afterNode.setNext(current);
            flag = true;
            size++;
            break;

          }else {
            current = current.getNext();
            afterNode = afterNode.getNext();
          }

        }
        if(afterNode.toString() == after.toString())
        {
          Node<T> node = new Node<>(data);
          afterNode.setNext(node);
          flag = true;
          size ++;
        }
        if (flag == false)
        {
          System.out.println("The Value of insertion after it is not exist ");
        }

      }
    }catch (Exception exception)
    {
      System.out.println(exception.getMessage());
    }

  }
  public String kthFromEnd( int kth) {
      try{
      if (head == null) {
        return  "list Not found , Use append method ";
      }
      else if (kth <0) {
        return  "Index out of Bound";
      }
        else {
        Node<T> current;
        if (size -1 < kth) {
          return "Index out of bound";
        } else {
          current = head;
          for (int i = 0; i < (size - kth-1); i++) {
            current = current.getNext();
          }
          return current.toString();
        }
      }
    }catch (IndexOutOfBoundsException exception)
    {
      System.out.println(exception.getMessage());
      return "Index out of bound ";
    }
  }

  public T remove(int index) throws IndexOutOfBoundsException {
    T deletedNode = null;
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

      Node<T> previous = null;
      Node<T> current = head;

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

  public void insert(T data) {
    Node<T> node = new Node<>(data);
    if (head == null) {
      head = node;
    } else {


      node.setNext(head);
      head = node;
    }
    size++;
  }
  public static boolean palindrome(LinkedList list) {
    boolean flag = true;
    if (list.head == null) {
      flag = false;
    } else if (list.size == 1) {
      flag =true;
    } else {
      String[] plind = new String[list.size];
      Node current = list.head;
      int index = 0;
      while (current != null) {
        plind[index] = current.toString();
        index ++ ;
        current = current.getNext();
      }
      String min;
      String max;
      for(int i = 0 ; i< plind.length/2 ; i++)
      {
        if(plind[i] != plind[plind.length-1-i])
        {
          flag = false;
          break;
        }
      }

    }
    return flag;
  }
  public static void reverse(LinkedList list)
  {
    if(list.head == null){
      System.out.println("List is empty");
    }
    else if(list.size==1)
    {
      System.out.println(list.toString());
    }
    else {
      String[] temp = new String[list.size];
      Node head2 = null;
      Node current = list.head;
      int index = 0;
      while (current != null) {
        temp[index] = current.toString();
        current = current.getNext();
        index ++;
      }
      while (current != null) {
        current = current.getNext();
      }
      current = list.head;
      head2 = current;
      for(int i= temp.length-1 ; i >= 0 ; i--)
      {
        current.setData(temp[i]);
        current = current.getNext();
      }

      System.out.println(list.toString());
    }
  }
  public boolean include(T data) {
    boolean flag = false;
    Node<T> current;
    current = head;
    while (current != null) {
      if (current.toString() == data.toString() ) {
        flag = true;
      System.out.println("List has" + " " +data.toString());

      }

      current = current.getNext();
    }
    if(flag == false)  System.out.println("List doesn't have" + " " + data.toString());
    return flag;
  }
  public  static LinkedList zipLists(LinkedList list1, LinkedList list2)
  {
    try {
      if(list1.head == null && list2.head == null)
      {
        return list1;
      }
      else if (list1.head == null)
      {
        return list2;
      }
      else if (list2.head == null)
      {
        return  list1;
      }
      else {
        Node current1 = list1.head;
        Node current2 = list2.head;
        Node next1 = list1.head.getNext();
        Node next2 = list2.head.getNext();
        if(list1.size >= list2.size)
        {
          while (next2 != null)
          {
            current2.setNext(next1);
            current1.setNext(current2);
            current1 =next1;
            current2 = next2;
            next1 = next1.getNext();
            next2 = next2.getNext();
          }
          current1.setNext(current2);
          current2.setNext(next1);
        }
        else {
          while (next1 != null)
          {
            current2.setNext(next1);
            current1.setNext(current2);
            current1 =next1;
            current2 = next2;
            next1 = next1.getNext();
            next2 = next2.getNext();
          }
          current1.setNext(current2);
          current2.setNext(next1);
        }
        list1.size += list2.size;
        list2.size = list1.size-1;
        return list1;
      }
    }catch (OutOfMemoryError error)
    {
      System.out.println(error.toString());
    }
    return list1;
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

