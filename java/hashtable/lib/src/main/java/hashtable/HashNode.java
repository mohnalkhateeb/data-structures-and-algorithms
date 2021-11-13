package hashtable;

public class HashNode<K, V> {
  K key;
  V value;
  public HashNode<K,V> leftChild;
  public HashNode<K,V> rightChild;
  final int hashCode;

  HashNode<K, V> next;

  public HashNode(K key, V value, int hashCode) {
    this.key = key;
    this.value = value;
    this.hashCode = hashCode;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public HashNode(K key, V value, HashNode<K,V> leftChild, HashNode<K,V> rightChild, int hashCode) {
    this.key = key;
    this.value = value;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
    this.hashCode = hashCode;
  }
}
