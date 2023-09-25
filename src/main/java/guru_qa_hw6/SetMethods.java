package guru_qa_hw6;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    private static Set<String> stringSet;

    public static void addElementInSet(Set<String> stringSet, String nameElement) {
        stringSet.add(nameElement);
    }

    public static String getElement(Set<String> stringSet, String nameElement) {
        for (String element:
             stringSet) {
            if (element.equals(nameElement)) return element;
        }
        return "No found";
    }

    public static void removeElement(Set<String> stringSet, String nameElement) {
        stringSet.remove(nameElement);
    }

    public static void main(String[] args) {
        // создадим set
        stringSet = new HashSet<>();
        // добавим элемент
        addElementInSet(stringSet, "cat");
        addElementInSet(stringSet, "dog");
        System.out.println(stringSet);
        // найдем элемент
        System.out.println(getElement(stringSet, "cat"));
        // удалим элемент
        removeElement(stringSet, "dog");
        System.out.println(stringSet);



    }
}
