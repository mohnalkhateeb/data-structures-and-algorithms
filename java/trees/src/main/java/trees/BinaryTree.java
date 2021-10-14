package trees;

public class BinaryTree <T extends Comparable<T>> extends BinarySearchTree{
  private String inOrderTrav = "";
  private String preOrderTrav = "";
  private String postOrderTrav = "";
  public String  inorderTraversal() {
    if (isEmpty()) {
      return "Tree is Empty";
    }

    return traverseInorder(getRoot());
  }

  private String traverseInorder(BinaryNode<T> root) {
    if (root.getLeftNode() != null) { // traverse left
      traverseInorder(root.getLeftNode());
    }

    // visit / print the root of the tree (root could be a sub-tree)
    inOrderTrav += root.getData() + " -> ";

    if (root.getRightNode() != null) { // traverse right
      traverseInorder(root.getRightNode());
    }
    return inOrderTrav;
  }
  public String  preOrderTraversal() {
    if (isEmpty()) {
      return "Tree is Empty";
    }

    return traversePreOrder(getRoot());
  }

  private String traversePreOrder(BinaryNode<T> root) {

    // visit / print the root of the tree (root could be a sub-tree)
    preOrderTrav += root.getData() + " -> ";
    if (root.getLeftNode() != null) { // traverse left
      traversePreOrder(root.getLeftNode());
    }
    if (root.getRightNode() != null) { // traverse right
      traversePreOrder(root.getRightNode());
    }
    return preOrderTrav;
  }

  public String  postOrderTraversal() {
    if (isEmpty()) {
      return "Tree is Empty";
    }

    return traversePostOrder(getRoot());
  }

  private String traversePostOrder(BinaryNode<T> root) {

    if (root.getLeftNode() != null) { // traverse left
      traversePostOrder(root.getLeftNode());
    }
    if (root.getRightNode() != null) { // traverse right
      traversePostOrder(root.getRightNode());

    }
    // visit / print the root of the tree (root could be a sub-tree)
    postOrderTrav += root.getData() + " -> ";
  return postOrderTrav;
  }


}
