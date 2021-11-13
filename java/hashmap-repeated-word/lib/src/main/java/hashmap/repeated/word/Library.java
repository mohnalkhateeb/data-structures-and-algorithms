/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.repeated.word;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library {

  public static void main(String[] args) {
    System.out.println(repeatedWord("It was a queer, sultry summer," +
      " the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));

}


  public static String repeatedWord(String word) {

    String[] splitInput = word.split(" ");
    Set<String> uniqueWords = new HashSet<>();
    for(String inputWord : splitInput) {
      if(!uniqueWords.add(inputWord.toLowerCase().replaceAll("([a-z]+)[?:!.,;']*", "$1"))) {
        return inputWord;
      }
    }
    return null;
  }
}
