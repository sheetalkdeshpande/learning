package bank;

import bank.Task;

public class Teller {

  String id;
  Queue queue;

  public Teller(String id, Queue queue) {
    this.id = id;
    this.queue = queue;
  }

  boolean lock = false;
  public void consume() throws InterruptedException {
    if(!lock){
     lock = true;
     queue.pop().perform();

    }

  }
}
