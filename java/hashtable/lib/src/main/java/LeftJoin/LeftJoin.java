package LeftJoin;

import hashtable.HashNode;
import hashtable.HashTable;

import java.util.ArrayList;

public class LeftJoin {

  public static ArrayList leftJoin(HashTable table1, HashTable table2) {
    ArrayList<ArrayList<String>> arrToReturn = new ArrayList<>();
    for (Object oneHash : table1.getBucketArray()) {
      if (oneHash!= null) {
        HashNode curr = (HashNode) oneHash;
//        while (curr != null) {
          ArrayList<String> oneArr = new ArrayList();
          oneArr.add((String) curr.getKey());
          oneArr.add((String) curr.getValue());
//          if (table2.contains(curr.getKey())) oneArr.add((String) table2.get(curr.key));
          if (table2.contains(curr.getKey())) {
            for (Object oneHash2 : table2.getBucketArray())
              if (oneHash2 != null) {
                HashNode curr2 = (HashNode) oneHash2;
                if (table1.contains(curr2.getKey()) && oneArr.size()<3) oneArr.add((String) curr2.getValue());
              }
          }
          else oneArr.add("NULL");
          arrToReturn.add(oneArr);
        }
      }
    return arrToReturn;
  }
}
