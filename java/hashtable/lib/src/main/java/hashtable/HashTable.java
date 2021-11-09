package hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable<K, V> {
  private ArrayList<HashNode<K, V>> bucketArray;
  private int numBuckets;
  private int size;

  public ArrayList<HashNode<K, V>> getBucketArray() {
    return bucketArray;
  }

  public HashTable() {
    bucketArray = new ArrayList<>();
    numBuckets = 10;
    size = 0;
    for (int index = 0; index < numBuckets; index++) {
      bucketArray.add(null);
    }
  }

  /**
   * hashes the key using the built in java hash function,
   * however you can build your own
   *
   * @param key any object
   * @return hashcode of the key
   */
  private int hashCode(K key) {
    return Objects.hashCode(key);
  }

  /**
   * Gets the index of where the value is located in the bucket array
   *
   * @param key any object
   * @return bucket index
   */
  public int hash(K key) {
    int hashCode = hashCode(key);
    int index = hashCode % numBuckets;
    index = index < 0 ? index * -1 : index;
    return index;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }

  /**
   *
   * @param key
   * @param value
   */
  public void add(K key, V value) {
    int bucketIndex = hash(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        head.value = value;
        return;
      }
      head = head.next;
    }
    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);
    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;
      for (int index = 0; index < numBuckets; index++) {
        bucketArray.add(null);
      }
      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }

  /**
   *
   * @param key
   * @return
   */

  /**
   *
   * @param key
   * @return
   */
  public V get(K key) {
    int bucketIndex = hash(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        return head.value;
      }

      head = head.next;
    }
    return null;
  }

  public boolean contains(K key)
  {
    if(get(key) != null)
      return true;
    else
      return false;
  }
}
