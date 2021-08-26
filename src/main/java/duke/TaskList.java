package duke;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents the list of tasks tracked by Duke.
 */
public class TaskList implements Serializable {
    private final ArrayList<Task> tasks;

    /**
     * Class constructor which initialises a blank TaskList.
     */
    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a task to the list.
     *
     * @param task Task to be added
     */
    public void add(Task task) {
        this.tasks.add(task);
    }

    /**
     * Deletes the task at the specified index from the list, and returns the deleted task.
     *
     * @param index Index of the task in the list of tasks
     * @return The task that has been deleted
     */
    public Task delete(int index) {
        return this.tasks.remove(index);
    }

    /**
     * Returns the number of tasks in the task list.
     *
     * @return Number of tasks in list
     */
    public int size() {
        return this.tasks.size();
    }

    /**
     * Returns the task stored at a particular index in the list.
     *
     * @param index Index of the task in the list of tasks
     * @return Task found at that index in the list
     */
    public Task get(int index) {
        return this.tasks.get(index);
    }
}
