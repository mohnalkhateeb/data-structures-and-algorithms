package trees;


public class Main {
  public static void main(String[] args) {

    BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
    binarySearchTree.add(50);
    binarySearchTree.add(10);
    binarySearchTree.add(100);
    binarySearchTree.add(5);
    binarySearchTree.add(20);
    binarySearchTree.add(11);
    binarySearchTree.add(55);
    binarySearchTree.add(70);
    binarySearchTree.add(18);
    binarySearchTree.add(90);

    BinarySearchTree<String> mohammad = new BinarySearchTree<>();
    mohammad.add("M");
    mohammad.add("O");
    mohammad.add("H");
    mohammad.add("A");
    mohammad.add("M");
    mohammad.add("M");
    mohammad.add("A");
    mohammad.add("D");

//        System.out.println("Inorder traversal");
//        binarySearchTree.inorderTraversal();

    System.out.println("Inorder traversal of Mohammad");
    System.out.println(mohammad.inorderTraversal());
    System.out.println("\nPreOrder traversal of Mohammad");
    System.out.println(mohammad.preOrderTraversal());

    System.out.println("\nPostOrder traversal of Mohammad");
    System.out.println(mohammad.postOrderTraversal());
    System.out.println("   ");
    System.out.println(mohammad.contains("H"));
    System.out.println(mohammad.contains("w"));

    System.out.println(binarySearchTree.contains(50));
    System.out.println(binarySearchTree.contains(100));
    System.out.println(binarySearchTree.contains(5));
    System.out.println(binarySearchTree.contains(18));
    System.out.println(binarySearchTree.maxValue(binarySearchTree.getRoot()));
//    System.out.println(binarySearchTree.maxValue(mohammad.getRoot()));
    System.out.println(mohammad.treeHight());
    System.out.println(binarySearchTree.treeHight());
    System.out.println(mohammad.breadthFirst());
    System.out.println(binarySearchTree.breadthFirst());

    BinaryTree<String> binaryTree = new BinaryTree<>();
      binaryTree.setRoot(new BinaryNode("J"));
      binaryTree.getRoot().setLeftNode(new BinaryNode("A"));
      binaryTree.getRoot().setRightNode(new BinaryNode("S"));
      binaryTree.getRoot().getLeftNode().setLeftNode(new BinaryNode("O"));
      binaryTree.getRoot().getLeftNode().setRightNode(new BinaryNode("N"));

    System.out.println(binaryTree.breadthFirst());
    System.out.println("\n");

    System.out.println(BinaryTree.treeFizzBuzz(binarySearchTree).breadthFirst());




  }

}
