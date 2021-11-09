package trees;

public class BinaryTree <T extends Comparable<T>> {
  private String inOrderTrav = "";
  private String preOrderTrav = "";
  private String postOrderTrav = "";
  private String levelOrderTrav = "";
  private  int hightLeft = 0;
  private  int hightRight = 0;

  private BinaryNode<T> root;

  public BinaryNode<T> getRoot() {
    return root;
  }

  public boolean isEmpty() {
    return root == null;
  }
  public void setRoot(BinaryNode<T> root) {
    this.root = root;
  }
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
  public  int treeHight(BinaryNode<T> root)
  {
    if(root.getLeftNode() != null)
    {
      hightLeft++;
      treeHight(root.getLeftNode());
    }
    if(root.getRightNode() != null)
    {
      hightRight++;
      treeHight(root.getRightNode());
    }
    return Math.max(hightLeft,hightRight);
  }
  public int treeHight()
  {
    if (isEmpty()) {
      return 0;
    }
    else  return treeHight(getRoot());
  }
  public String breadthFirst(){
    int height = treeHight();
    for(int i = 0; i <= height; i++){
     levelOrderTrav += breadthFirstTraversal(getRoot(), i);
    }
    return levelOrderTrav;
  }

  // Method for breadth first search
  public String breadthFirstTraversal(BinaryNode<T> root, int level){
    String levelTrav = "";
    if(root == null){
      return levelTrav;
    }
    if(level == 0){
      levelTrav = root.getData().toString() + "->";
    }else{
      levelTrav = breadthFirstTraversal(root.getLeftNode(), level-1)+breadthFirstTraversal(root.getRightNode(), level-1);
//      if(root.getLeftNode() != null){return ;};
//      if(root.getRightNode() != null){return };
    }
    return levelTrav;
  }
  public Number maxValue(BinaryNode<T> root) {
    try {
      if (root.getData() == null)
      {
        System.out.println("tree is empty");
        return 0;
      }
      if (root.getRightNode() != null) {
        return maxValue(root.getRightNode());
      }
      return (Number) root.getData();
    }catch (Exception e)
    {
      System.out.println(e.getMessage()+e.hashCode());
      return 0;
    }
  }
  public static BinaryTree<String> treeFizzBuzz(BinaryTree binaryTree){

    return fizzBuzzTreeHelper(binaryTree,binaryTree.getRoot());
  }

  private static BinaryTree<String> fizzBuzzTreeHelper(BinaryTree root, BinaryNode node){
    if(node == null) return root;

    BinaryTree root0 = new BinaryTree();
    root0.setRoot(root.getRoot());
    if(((Integer) node.getData() % 15) == 0) root.getRoot().setData("FizzBuzz");
    else if(((Integer) node.getData()) % 3 == 0) root.getRoot().setData("Fizz");
    else if(((Integer) node.getData()) % 5 == 0) root.getRoot().setData("Buzz");
    else root.getRoot().setData(node.getData().toString());
    BinaryTree root1 = new BinaryTree();
    root1.setRoot(root.getRoot().getLeftNode());
    BinaryTree root2 = new BinaryTree();
    root2.setRoot(root.getRoot().getRightNode());

    fizzBuzzTreeHelper(root1, node.getLeftNode());

    fizzBuzzTreeHelper(root2, node.getRightNode());

    return root0;
  }


}
