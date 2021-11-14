/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gragh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {

    }
  @Test
  public void testGraph() {
    Graph myGraph = new Graph();
    assertNull(myGraph.toString());
    myGraph.addNode("8");
    assertEquals("[8]", myGraph.getNodes().toString());
    myGraph.addEdge("8", "8");
    assertEquals("[8]", myGraph.getNeighbors("8").toString());
    assertEquals("{8=[8]}", myGraph.nodeList.toString());
    myGraph.addNode("5");
    myGraph.addEdge("8", "5");
    assertEquals("[8, 5]", myGraph.getNeighbors("8").toString());
    assertEquals("[8]", myGraph.getNeighbors("5").toString());
    assertEquals("[5, 8]", myGraph.getNodes().toString());
    assertEquals("{5=[8], 8=[8, 5]}", myGraph.nodeList.toString());
    assertEquals(2, myGraph.size());

  }

  @Test
  public void graphBreadthFirst() {
    Graph myGraph = new Graph();
    assertNull(myGraph.breadthFirst(null));
    myGraph.addNode("8");
    assertEquals("[8]", myGraph.breadthFirst("8").toString());
    myGraph.addEdge("8", "8");
    assertEquals("[8]", myGraph.breadthFirst("8").toString());
    myGraph.addNode("2");
    myGraph.addNode("1");
    myGraph.addNode("9");
    myGraph.addNode("7");
    myGraph.addNode("5");
    myGraph.addEdge("8" , "9");
    myGraph.addEdge("8" , "2");
    myGraph.addEdge("8" , "1");
    myGraph.addEdge("5" , "1");
    myGraph.addEdge("7" , "5");
    assertEquals("[8, 9, 2, 1, 5, 7]", myGraph.breadthFirst("8").toString());
  }
}
