import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Task> tasks = new ArrayList<Task>();

    public void execTask(Task task){
        this.tasks.add(task);
        task.execute();
    }

    public void cancelLastTask(){
        if(tasks.size() != 0){
            Task task = this.tasks.get(this.tasks.size() - 1);
            task.cancel();
            this.tasks.remove(this.tasks.size() - 1);
        }
    }
}
