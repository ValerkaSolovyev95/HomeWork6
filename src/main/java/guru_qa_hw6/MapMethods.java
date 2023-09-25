package guru_qa_hw6;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    private static Map<String,String> stringMap;

    public static void addElementInMap(Map<String,String> stringMap, String key, String value) {
        stringMap.put(key, value);
    }

    public static void removeElementByKey(Map<String,String> stringMap, String key) {
        stringMap.remove(key);
    }

    public static String getEntry(Map<String,String> stringMap, String key) {
        for (Map.Entry<String, String> entry:
             stringMap.entrySet()) {
            if (entry.getKey().equals(key)) return String.format("%s %s",entry.getKey() ,entry.getValue());
        }
        return "None elements";
    }

    public static void main(String[] args) {
        // создаем map
        stringMap = new HashMap<>();
        // добавляем элементы
        addElementInMap(stringMap, "cat", "Boris");
        addElementInMap(stringMap, "dog", "Vasya");
        System.out.println(stringMap);
        // получаем пары ключ/значение
        System.out.println(getEntry(stringMap, "cat"));
        // удалим элемент
        removeElementByKey(stringMap, "dog");
        System.out.println(stringMap);

    }
}
