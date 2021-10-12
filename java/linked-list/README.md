# Data Structure
# Linked List
## `Challenge-05` Linked List Implementation
A linked list is a sequence of data structures, which are connected together via links. Linked List is a sequence of links which contains items.
* ### Classes
- #### Node
   Node class that has properties for the value stored in the Node, and a pointer to the next Node.
- #### Linked List
  Linked List class, include a head property. Upon instantiation, an empty Linked List should be created.
    - ##### Features
      - ###### insert
        Void function to add a new node with that value to the head of the list with an O(1) Time performance.
        O(1) time and O(1) space
      - ###### includes
        Boolean function to indicate whether that value exists as a Node’s value somewhere within the list.
        O(n) time and O(1) space
      - ###### to string
         Function return a string for representing all the values in the Linked List, formatted as:
        "{ a } -> { b } -> { c } -> NULL"
      - O(n) time and O(1) space
## `Challenge-06` linked-list-insertions
# Challenge Summary
create three functions for Linked list class :
* 1- append(value) :function to append value in end of any given Linked List that return the same Linked List with new value in the end and increase the size of linked list by 1
* 2- insertBefor(data,value):function to insert new value any given Linked List before a given value found in Linked list that return the same Linked List with new value before given value and increase the size of linked list by 1
* 3- insertAfter(data,value) : function to insert new value any given Linked List after a given value found in Linked list that return the same Linked List with new value after given value and increase the size of linked list by 1
## Whiteboard Process
* ##### append function
![append function](./resources/append-linked-list.png)

* ##### insertBefor
![insertBefor function](resources/inser-befor-Linkedlist.png)
* ##### insertAfter
![insertBefor function](./resources/inser-after-linkedlist.png)

## Approach & Efficiency
* ##### append function
1 - create method return void  with one string data prameter
2- check if Linked List is empty to give dtat to head node
3- declare current pointer indicate to head of linked list
5- loop while current.next pointer doesent indacte to null value
5- create new node with data
6 - let current.Next indicate to new node
7- lncrese the size of linked List by 1
8-Big O : time --> O(n)
space --> O(1)


* ##### insertBefor

1 - create method return void  with two strings  data prameter
2- check if Linked List is empty if yes print the List is empty massage
3- check if data of linked list head is equal the first prameter then caled insert function with second prameter
4- create two new pointers first one the search about node the we need to add befor it called (Befor) and second one is current
5- inslize current with head and Befor with head.next
6- create boolean flage with false value mean the Befor data not exist in list
5- loop while Befor is not equal null
6- inside loop check if data of Befor Node equal BeforValue
7- if yes  1- create new node with value of second prameter 2-let current.Next equal node then equal Befor node 3- incress size of Linked 4- let flag equal true 5- break the loop
8- if no : let currnt equal current.next and Befor equal Befor.next
9 - check if flag equal false print message 'The Value of insertion before it is not exist'
10-Big O : time --> O(n)
space --> O(1)
* ##### insertAfter
1 - create method return void  with two strings  data prameter
2- check if Linked List is empty if yes print the List is empty massage
3- check if data of linked list head is equal the first prameter then caled append function with second prameter
4- create two new pointers first one the search about node the we need to add after it called (After) and second one is current
5- inslize current with head.next  and After with head
6- create boolean flage with false value mean the After data not exist in list
5- loop while After.next is not equal null
6- inside loop check if data of After Node equal first function prameter
7- if yes  1- create new node with value of second prameter 2-let After.Next equal node then equal After node 3- incress size of Linked 4- let flag equal true 5- break the loop
8- if no : let currnt equal current.next and After equal After.next
9 - check if flag equal false print message 'The Value of insertion after it is not exist'
10-Big O : time --> O(n)
space --> O(1)

## `Challenge-07` linked-list-kth
# Challenge Summary
we need to write function return the value of node that is in given index from the end of linked list

## Whiteboard Process
![kth from end](resources/kthfromEnd-linkedlist.png)

## Approach & Efficiency
1 - create method return string with integer index prameter
2- check if Linked List is empty or index less than 0 or index greater than linked list size to throw the excption
3- declare current pointer indicate to head of linked list
4- loop from 0 to (size - index)
5- inside the loop let current = current.next
6- return the data insid the current

Big O : time --> O(n)
space --> O(1)

## `Challenge-08` linked-list-zip
# Challenge Summary
we need to write function called listzip take two listedlists
as prameters and return Linked List that Zip the
two linked lists together into one so that the
nodes alternate between the two lists and return
a reference to the head of the zipped list.
## Whiteboard Process
![kth from end](resources/zip-linked-list.png)

## Approach & Efficiency
1 - create method return linked list with two linked lists data prameter
2- check if two linked lists are empth then return empty linked list
3- check if one of them is empty then return the filling one
4- create current1 Node and let it equal list1.head and create current2 Node and let it equal list2.head
5- creat next1 Node and let it equal current1.next and creat next2 Node and let it equal current2.next
6- check if size of one them is greater than the second one
7 - looping while the next pointer  of small array not equal null
8- inside loop let 1- current2.next equal next1 2-  current1.next =current2  3- current1 =next1 4-current2 = next2 5-  next1 = next1.Next 6-   next2 = next2.Next
9- outside loop let current1.Next =current2 and current2.next = next1
10 - retun list1

Big O : time --> O(n)
space --> O(1)

# Challenge-10` stack-and-queue
* ### Classes
- #### Node
  Node class that has properties for the value stored in the Node, and a pointer to the next Node.
- #### Stack
Stack class that has a top property. It creates an empty Stack when instantiated
- ##### Features
    - ###### push
      adds a new node with that value to the top of the stack with an O(1) Time performance.
    - ###### pop()
      Returns the value from node from the top of the stack Removes the node from the top of the stack
      and Should raise exception when called on empty stack
    - ###### peek
      Returns Value of the node located at the top of the stack and Should raise exception when called on empty stack
    - ###### isEmpty
      Returns: Boolean indicating whether or not the stack is empty.

- #### Queue
Queue class that has a front property. It creates an empty Queue when instantiated.
  - ##### Features
    - ###### enqueue
      adds a new node with that value to the back of the queue with an O(1) Time performance.
    - ###### dequeue
      Returns  the value from node from the front of the queue and removes the node from the front of the queue and Should raise exception when called on empty queue
    - ###### peek
      Returns Value of the node located at the front of the queue and Should raise exception when called on empty queue
    - ###### isEmpty
      Returns: Boolean indicating whether or not the queue is empty.

## `Challenge-11` stack-queue-pseudo
# Challenge Summary
we need to create class clalled pseudo queue this class work as queue but using two Stack instans and it contains two functions (enque and deque)
- enque : function with value prameter Inserts value into the PseudoQueue, using a first-in, first-out approach
- dequeue :Extracts a value from the PseudoQueue, using a first-in, first-out approach.h
## Whiteboard Process
![stack-queue-pseudo](resources/pesudo queue.png)

## Approach & Efficiency
1 - create class called PesudoQueue with two stacks variables (inbox and outbox) and work as queue job
2- to enqueue we just push the new value in inbox stack
3 - to deque
3.1 - if inbox is empty return null
3.2 - if inbox is not empty check if outbox is empty
3.3 - if outbox is empty loop while the inbox is not empty
3.4 - inside loop push the value inbox pop into outbox stack
3.5 - pop from outbox stack

- Big O enqueue : time --> O(1) space --> O(1)
- Big O dequeue : time --> O(n) space --> O(n)

## `Challenge-12` stack-queue-pseudo
# Challenge Summary
we need to create class clalled AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.
Implement the following methods:
- enque : function with value prameter of type Animal Inserts value into the PseudoQueue, using a first-in, first-out approach
- dequeue :Extracts a value from the PseudoQueue, using a first-in, first-out approach.h and return data if are of cat or dog , if value is not "dog" or "cat" then return null.
## Whiteboard Process
![stack-queue-pseudo](resources/AnimalShetter.png)

## Approach & Efficiency

1 - create class called Animal with name and type variables
2- creat cat and Dog classes extended from animal class
3- let type of Cat = Cat and type of Dog = Dog
4 - create  class clalled AnimalShelter with queue of Animales vareaible
5- to enque to Animal shelter just enque new animal in AnimalShelter Queue
6 - to deque
6.1 - if AnimalShelter is empty return null
6.2 - if type of dequeue from AnimalShelter is Cat or Dog then return AnimalShelter.dequeue
6.3 - else return null

- Big O enqueue : time --> O(1) space --> O(1)
- Big O dequeue : time --> O(n) space --> O(n)

## `Challenge-12` stack-queue-pseudo
# Challenge Summary
we need to create function called validate brackets with string prameters
and  boolean Return value using stack and queue data structur
## Whiteboard Process
![stack-queue-pseudo](resources/stack-queue-brackets.png)

## Approach & Efficiency
1 - create function with string prametrers and boolean return
2- create stack and queue objects
3- defined two counters on for open brackets and second for closed
4 - check if empty string return false
5- else create string array sArr using split the string
6 - loop about sArr and inside loop
6.1 check if (sArr[i].equals("{")) or( sArr[i].equals("[") or sArr[i].equals("(") ) then push sArr[i] in stack and increse openPrackes counters
6.2check if (sArr[i].equals("}")) or( sArr[i].equals("]") or sArr[i].equals(")")  then push sArr[i] in stack and increse closedPrackes counters
7- check if counClose != countOpen return false
8- else looping while stack is not empty and enqueue stack.pop() in side queue
9- inside loop check if (queue.peek().equals("]")  && (stack.peek().equals("(")  or stack.peek().equals("{") )) or
(queue.peek().equals(")")  && (stack.peek().equals("[")  or stack.peek().equals("{") ))or
(queue.peek().equals("}")  && (stack.peek().equals("(")  or stack.peek().equals("[") )))
then return false
10 - else dequeue fron queue
- Big O  : time --> best O(1) worst O(n)
- Big O : space --> O(1)






