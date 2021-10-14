
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

}
