
package trees;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
  BinaryTree<String> tree = new BinaryTree();
  @Test
  public void inOrderPreOrderPostOrderTraversalNonEmptyTest() {


    tree.add("M");
    tree.add("O");
    tree.add("H");
    tree.add("A");
    tree.add("M");
    tree.add("M");
    tree.add("A");
    tree.add("D");

    assertEquals("A -> D -> H -> M -> O -> ", tree.inorderTraversal());
    assertEquals("M -> H -> A -> D -> O -> ", tree.preOrderTraversal());
    assertEquals("D -> A -> H -> O -> M -> ", tree.postOrderTraversal());
  }
  @Test
  public void inorderPreOrderPostOrderTraversalEmptyTest() {

    assertEquals("Tree is Empty", tree.inorderTraversal());
    assertEquals("Tree is Empty", tree.inorderTraversal());
    assertEquals("Tree is Empty", tree.inorderTraversal());
  }
  @Test
  public void leftRighteNodeTest()
  {
    tree.add("15");
    tree.add("10");
    tree.add("25");
    assertEquals("15", tree.getRoot().toString());
    assertEquals("10", tree.getRoot().getLeftNode().toString());
    assertEquals("25", tree.getRoot().getRightNode().toString());
  }
  @Test
  public void numberMaxValueTest() throws Exception
  {
    BinaryTree<Double> tree = new BinaryTree();
    tree.add(15.5);
    tree.add(10.0);
    tree.add(25.0);
    tree.add(80.88);
    tree.add(50.0);
    assertEquals(80.88, tree.maxValue(tree.getRoot()));

  }

  @Test
  public void emptyOrNotNumberTreeMaxValueTest() throws Exception
  {
    BinaryTree<Double> tree2 = new BinaryTree();
    tree.add("M");
    tree.add("O");
    tree.add("H");
    tree.add("A");
    tree.add("M");
    tree.add("M");
    tree.add("A");
    tree.add("D");
    assertEquals(0, tree2.maxValue(tree.getRoot()),"tree is empty");
    assertEquals(0, tree.maxValue(tree.getRoot()),"tree is empty");

  }
  @Test
  public void breadthFirstOrderTreeTest()
  {
    BinaryTree<Double> tree2 = new BinaryTree();
    tree.add(50);
    tree.add(10);
    tree.add(100);
    tree.add(5);
    tree.add(20);
    tree.add(55);
//    tree.add(70);
//    tree.add("D");
    assertEquals("50->10->100->5->20->55->", tree.breadthFirst());


  }

}
