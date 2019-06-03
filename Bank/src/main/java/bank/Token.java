package bank;

public class Token {

  Queue queue;

  public Token(Queue queue) {
    this.queue = queue;
  }

  public void push(Task task){
    queue.push(task);
  }
}
