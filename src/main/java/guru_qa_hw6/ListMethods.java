package guru_qa_hw6;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    private static List<String> strList;

    public static String getElement(List<String> strList, String nameElement) {
        for (String element:
             strList) {
            if (element.equals(nameElement)) return element;
        }
        return "No found";
    }

    public static void addElement(List<String> strList, String nameElement) {
        strList.add(nameElement);
    }

    public static void removeElement(List<String> strList, String nameElement) {
        strList.remove(nameElement);
    }
    public static void main(String[] args) {
        // создадим список
        strList = new ArrayList<String>();
        // добавим два элемента
        addElement(strList, "cat");
        addElement(strList, "dog");
        // проверим, что добавлены
        System.out.println(strList);
        // найдем элемент
        System.out.println(getElement(strList, "cat"));
        // удалим элемент
        removeElement(strList, "dog");
        System.out.println(strList);
    }
}
