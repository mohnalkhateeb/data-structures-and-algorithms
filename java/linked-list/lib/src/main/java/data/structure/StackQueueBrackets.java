package data.structure;

public class StackQueueBrackets {

  public static boolean stackQueueBrackets(String s){
    String[] sArr = s.split("");
    Stack<String> stack= new Stack();
    Queue<String> queue = new Queue();
    int countOpen = 0;
    int counClose = 0;
    boolean flag = true;
    for(int i=0 ; i< sArr.length ; i++)
    {
      if ((sArr[i].equals("{")) ||( sArr[i].equals("[")  || sArr[i].equals("(") ))
      {
        countOpen++;
        stack.push(sArr[i]);
      }
      if((sArr[i].equals("}")) ||( sArr[i].equals("]")  || sArr[i].equals(")") ))
      {
        counClose++;
        stack.push(sArr[i]);
      }
    }
    if(counClose != countOpen || (counClose == 0 && countOpen == 0))
    {
      flag = false;
    } else{
      while (!stack.isEmpty()){
        queue.enqueue(stack.pop());
        if((queue.peek().equals("]")  && (stack.peek().equals("(")  || stack.peek().equals("{") )) ||
          (queue.peek().equals(")")  && (stack.peek().equals("[")  || stack.peek().equals("{") ))||
          (queue.peek().equals("}")  && (stack.peek().equals("(")  || stack.peek().equals("[") ))){
          flag = false;
        }else {
          queue.dequeue();
        }
      }

    }
    return  flag;
  }
}
