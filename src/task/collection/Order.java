package task.collection;

import java.util.ArrayList;
import java.util.List;

// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

public class Order {
    int id;
    String customer;
    int totalAmount;

    Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public static void maxOrder(List<Order> list) {
        int maxSum = 0;
        for (Order ord : list) {
            if (maxSum < ord.totalAmount) {
                maxSum += ord.totalAmount;
            }
        }
        for (Order ord : list) {
            if (maxSum == ord.totalAmount) {
                System.out.println(ord);
            }
        }
    }

    public static int amountOfOrders(List<Order> list) {
        int sum = 0;
        for (Order ord : list) {
            sum += ord.totalAmount;
        }
        return sum;
    }

    public static void main(String[] args) {
        Order customer = new Order(23, "Akim", 8998);
        Order customer2 = new Order(565, "Zelensky", 1023);
        Order customer3 = new Order(3434, "Putin", 5453);
        Order customer4 = new Order(23, "Tramp", 6342);
        List<Order> list = new ArrayList<>();
        list.add(customer);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);

        Order.maxOrder(list);
        System.out.println("----------------------------------------------------");
        System.out.println(Order.amountOfOrders(list));
    }
}
