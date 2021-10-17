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
## `Challenge-16` Max-Tree
# Challenge Summary
 function Find the maximum value stored in the tree. with assuming that the values stored in the Binary Tree will be numeric.
## Whiteboard Process
![tree-max](resources/tree-max.png)

## Approach & Efficiency
- 1 - create method return number with binryNode is root of binary tree
- 2- check if root is empty then return 0 and print massegr tree is empty
- 3- check if right of root is not null called the function as recurcive with right of root as new root
- 4- when the right of root become null then return the data of root
- 5- if type of data is not numeric then return 0 and throw Expetion
- `Big O`
  time -> best `O(1)`->worst `O(n/2)` -> avarege `O(logn)` space -> `O(1)`

