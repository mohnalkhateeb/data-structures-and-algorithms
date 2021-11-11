/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import TreeIntersection.BinaryTree;
import TreeIntersection.TreeIntersection;

import java.util.ArrayList;

public class Library {
  public static void main(String[] args) {

    HashTable<String, Integer> studentAllowances = new HashTable<>();
    studentAllowances.add("John", 300);
    studentAllowances.add("Sally", 400);
    studentAllowances.add("Tom", 200);
    studentAllowances.add("Jade", 100);
    studentAllowances.add("Doa", 600);
    studentAllowances.add("Farah", 700);
    studentAllowances.add("Jason", 90000);
    studentAllowances.add("Morgan", 800);
    studentAllowances.add("Naim", 1000);
    studentAllowances.add("Qusai", 1500);
    studentAllowances.add("Deyaa", 10000);

    System.out.println("The size is => " + studentAllowances.getSize());
    System.out.println("Index Of Jade => " + studentAllowances.hash("Jade"));
    System.out.println("The Sally allowance is => " + studentAllowances.get("Sally"));
    System.out.println("The size is => " + studentAllowances.getSize());
    System.out.println("if Morgan is exit => " + studentAllowances.contains("Morgan"));
    System.out.println("if Morgan is exit => " + studentAllowances.contains("KKKKK"));

    BinaryTree<String,Integer> binaryTreeOne = new BinaryTree<>(new HashNode<>("A",100,5));
    HashNode<String,Integer> node1 = new HashNode<>("B",200,3);
    HashNode<String,Integer> node2 = new HashNode<>("C",300,6);
    HashNode<String,Integer> node3 = new HashNode<>("D",160, node1, node2,7);
    HashNode<String,Integer> node5 = new HashNode<>("E",180,7);
    HashNode<String,Integer> node4 = new HashNode<>("F",120, node5, null,5);
    binaryTreeOne.root.rightChild = node4;
    binaryTreeOne.root.leftChild = node3;

    BinaryTree<String,Integer> binaryTreeTwo = new BinaryTree<>(new HashNode<>("G",45,5));
    HashNode<String,Integer> node6 = new HashNode<>("H",200,3);
    HashNode<String,Integer> node7 = new HashNode<>("I",150,3);
    HashNode<String,Integer> node8 = new HashNode<>("J",160, node6, node7,3);
    HashNode<String,Integer> node9 = new HashNode<>("K",120,3);
    HashNode<String,Integer> node10 = new HashNode<>("L",80, node9, null,4);
    binaryTreeTwo.root.rightChild = node10;
    binaryTreeTwo.root.leftChild = node8;

//    TreeIntersection.treeIntersection(binaryTreeOne,binaryTreeTwo);
    System.out.println(TreeIntersection.treeIntersection(binaryTreeOne,binaryTreeTwo));
  }
}
