# Trees
## `Challenge-15` Binary Trees Implementation
A binary tree is a tree-type non-linear data structure with a maximum of two children for each parent. Every node in a binary tree has a left and right reference along with the data element. The node at the top of the hierarchy of a tree is called the root node. The nodes that hold other sub-nodes are the parent nodes.
* ### Classes
  - #### BinaryNode
    class that has properties for the value stored in the node, the left child node, and the right child node
    - #### BinarySearchTree
      Binary Search Tree class : This class should be a sub-class (or your languages equivalent) of the Binary Tree
      - ##### Features
        - ###### Add
          Return  nothing and Adds a new node with that value in the correct location in the binary search tree.
        - ###### Contains
           Returns boolean and indicating whether or not the value is in the tree at least once.

    - #### BinaryTree
      a Binary Tree class
      Define a method for each of the depth first traversals which returns an array of the values, ordered appropriately.
      - ##### Features
        - ###### pre order
          root-left-right
        - ###### in order
         left-root-right
        - ###### post order
         left-right-root 
