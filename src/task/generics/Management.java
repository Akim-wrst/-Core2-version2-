package task.generics;

import task.models.BigBox;

import java.util.List;

public class Management<T extends BigBox> {

    public void checkBox(T t, List<T> Producer) {
        int counter = 0;
        for (T a : Producer) {
            if (a.equals(t)) {
                System.out.println("Коробка есть в списке!");
            } else {
                counter++;
            }
        }
        if (counter == Producer.size()) {
            System.out.println("Коробки нет в списке");
        }
    }

    public void addNewBox(T t, List<T> Consumer) {
        Consumer.add(t);
        System.out.println("В список была добавленна коробка " + t.toString());
    }

    public void printBox(List<T> Producer) {
        for (T t : Producer) {
            System.out.print(t.toString() + " ");
        }
    }

    public void copyingBox(List<T> Producer, List<T> Consumer) {
        Producer.addAll(Consumer);
    }

}
