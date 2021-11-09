package trees;

public class BinarySearchTree <T extends Comparable<T>> extends BinaryTree{







  public void add(T data) {
    if (isEmpty()) { // tree empty
      this.setRoot(new BinaryNode<>(data))  ;
    } else {
      addHelper(data, this.getRoot());
    }
  }

  private void addHelper(T data, BinaryNode<T> root) {
    BinaryNode<T> binaryNode = new BinaryNode<>(data);
    if (data.compareTo(root.getData()) < 0) {
      if (root.getLeftNode() == null) {
        root.setLeftNode(binaryNode);
      } else {
        addHelper(data, root.getLeftNode());
      }
    } else if(data.compareTo(root.getData()) > 0) {
      if (root.getRightNode() == null) {
        root.setRightNode(binaryNode);
      } else {
        addHelper(data, root.getRightNode());
      }
    }
  }
  public boolean contains(T item)
  {
    BinaryNode<T> node = this.getRoot();
    return containsHelp(node , item);
  }



  private boolean containsHelp(BinaryNode<T> node, T item)
  {
    if(node == null) return false;
    if (node.getData() == item)
    {
      return true;//return 0 if found
    }
    else
    {
      if (item.compareTo(node.getData()) > 0)
      {
        //root = node.Left;
        return(containsHelp(node.getRightNode(), item));
      }
      else
      {
        if (item.compareTo(node.getData()) < 0)
        {
          return(containsHelp(node.getLeftNode(), item));
        }
        else
        {
          return false;//return 1 if not found
        }
      }
    }
  }




}


