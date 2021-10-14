package trees;

public class Main {
  public static void main(String[] args) {
    BinaryTree<Integer> binarySearchTree = new BinaryTree<>();
    binarySearchTree.add(50);
    binarySearchTree.add(10);
    binarySearchTree.add(60);
    binarySearchTree.add(5);
    binarySearchTree.add(20);
    binarySearchTree.add(55);
    binarySearchTree.add(70);

    BinaryTree<String> mohammad = new BinaryTree<>();
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

  }
}
