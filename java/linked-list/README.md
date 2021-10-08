# Data Structure
#Linked List
## `Lab-05` Linked List Implementation
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
