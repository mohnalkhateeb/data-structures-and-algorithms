package TreeIntersection;

public class TreeIntersection {

  public static ArrayList treeIntersection(BinaryTree tree1, BinaryTree tree2) {
    if (tree1.root == null || tree2.root == null) return null;
    HashTable<String> storeTable = new HashTable<>();
    ArrayList<Object> arr = new ArrayList<>();
    for (Object oneItem : tree1.preOrder(tree1.root)) {
      storeTable.add(oneItem.toString(), null);
    }
    for (Object oneItem : tree2.preOrder(tree2.root)) {
      if (storeTable.contains(oneItem.toString()) && !arr.contains(oneItem)) arr.add(oneItem);
    }
    return arr;
  }
}
