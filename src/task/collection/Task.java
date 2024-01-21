package task.collection;

import java.util.ArrayList;
import java.util.List;

// TODO: Управление задачами:
//  Создайте класс Task с полями id, title и completed.
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.
public class Task {
    int id;
    String title;
    boolean completed;

    Task(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    public static void taskCompleted(List<Task> list) {
        for (Task task : list) {
            if (!task.completed) {
                System.out.println(task);
            }
        }
    }

    public static void titleSearch(List<Task> list, String title) {
        for (Task task : list) {
            if (title.equals(task.title)) {
                System.out.println(task);
            }
        }
    }

    public static void main(String[] args) {
        Task task = new Task(1, "Задача 1", true);
        Task task2 = new Task(2, "Задача 2", false);
        Task task3 = new Task(3, "Задача 3", true);
        Task task4 = new Task(4, "Задача 4", false);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);

        Task.taskCompleted(tasks);
        System.out.println("----------------------------------------");
        Task.titleSearch(tasks, "Задача 3");
    }
}
