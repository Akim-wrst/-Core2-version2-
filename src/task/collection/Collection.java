package task.collection;

import java.util.*;

public class Collection {
    public static void maxElement(List<Integer> list) {
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
    }

    public static List<Integer> deleteDuplicate(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public static List<Integer> duplicate(List<Integer> list, List<Integer> list2) {
        List<Integer> listResult = new ArrayList<>();
        for (int i : list2) {
            if (list.contains(i)) {
                listResult.add(i);
            }
        }
        return listResult;
    }

    public static void main(String[] args) {
        // TODO: Реализуйте функциональность согласно описанию
        // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(1);
        list2.add(3);
        list2.add(1);
        list2.add(5);
        list2.add(8);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zxzx");
        map.put(2, "sdsd");
        map.put(3, "fgfg");
        map.put(4, "sdsd");

        // TODO: Найти наибольший элемент в списке.
        Collection.maxElement(list);

        // TODO: Удалить все дубликаты из списка.
        System.out.println(Collection.deleteDuplicate(list));

        // TODO: Отсортировать список в порядке убывания.
        Collections.sort(list);
        System.out.println(list);

        // TODO: Проверить, содержит ли множество определенный элемент.
        System.out.println(list.contains(4));

        // TODO: Найти пересечение двух множеств.
        System.out.println(Collection.duplicate(list, list2));

        // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
        list.removeAll(list2);
        System.out.println(list);

        // TODO: Проверить, содержит ли карта определенный ключ.
        System.out.println(map.containsKey(3));

        // TODO: Получить все значения, связанные с определенным ключом.
        System.out.println(map.get(2));

        // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
        map.values().removeAll(Collections.singleton("sdsd"));

        // TODO: Добавить элемент в очередь.
        Queue<String> queue = new LinkedList<>();
        queue.offer("Akim");

        // TODO: Получить и удалить первый элемент из очереди.
        System.out.println(queue.element());
        queue.remove();

        // TODO: Проверить, пуста ли очередь.
        System.out.println(queue.poll());
    }
}