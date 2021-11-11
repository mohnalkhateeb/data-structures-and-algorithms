package TreeIntersection;

import hashtable.HashNode;

import java.util.ArrayList;

public class BinaryTree<K,V> {
  public ArrayList<V> preOrderList = new ArrayList<>();
  public HashNode<K,V> root;

  public BinaryTree() {}

  public BinaryTree(HashNode<K,V> root) {
    this.root = root;
  }

  public ArrayList<V> preOrder(HashNode<K,V> root) {
    try {
      preOrderList.add(root.getValue());
      if (root.leftChild != null) preOrder(root.leftChild);
      if (root.rightChild != null) preOrder(root.rightChild);
    } catch (NullPointerException exception) {
      System.out.println(exception.getMessage());
    }
    return preOrderList;
  }

  @Override
  public String toString() {
    if (preOrderList.isEmpty()) return "Empty List";
    return "preOrderList=" + preOrderList;
  }
}
