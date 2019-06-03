package bank;

import java.util.ArrayList;
import java.util.List;

public class Queue {
  List<Task> tasks;

  public Queue() {
    this.tasks = new ArrayList<>();
  }

  public Task pop(){

    Task task = new Task();

    if(tasks.size() > 0){
      task = tasks.get(0);
      tasks.remove(0);
    }
    return task;
  }

  public void push(Task task){
    tasks.add(task);
  }
}
