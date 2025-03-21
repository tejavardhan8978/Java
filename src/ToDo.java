import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private List<String> tasks;
    private Storage storage;

    public ToDo() {
        storage = new Storage();
        tasks = storage.loadTasks();
    }

    public void addTask(String task) {
        tasks.add(task);
        storage.saveTasks(tasks);
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void removeTask(int index) {
        if (index > 0 && index <= tasks.size()) {
            tasks.remove(index - 1);
            storage.saveTasks(tasks);
        } else {
            System.out.println("Invalid index.");
        }
    }
}