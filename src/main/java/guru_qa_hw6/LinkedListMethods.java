package guru_qa_hw6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    private static List<String> linkedList;

    public static void addElementInLinkedList(List<String> linkedList, String element) {
        linkedList.add(element);
    }

    private static String getElementLinkedList(List<String> linkedList, String nameElement) {
        for (String element:
                linkedList) {
            if (element.equals(nameElement)) return element;
        }
        return "No found";
    }

    private static void removeElementLinkedList(List<String> linkedList, String elementName) {
        linkedList.remove(elementName);
    }

    public static void main(String[] args) {
        // создадим список
        linkedList = new LinkedList<>();
        // добавим два элемента
        addElementInLinkedList(linkedList, "cat");
        addElementInLinkedList(linkedList, "dog");
        // проверим, что добавлены
        System.out.println(linkedList);
        // найдем элемент
        System.out.println(getElementLinkedList(linkedList, "cat"));
        // удалим элемент
        removeElementLinkedList(linkedList,"dog");
        System.out.println(linkedList);

    }

}
