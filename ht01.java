/** Есть тест. Нужно извлечь из него все слова и отсортировать по длине */

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ht01{

    public static void main(String[] args){

    
        System.out.println("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"); 
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";        
        collectStats(text);
        
    }
    static void collectStats(String text) {
        Map<Integer, String> stats = new HashMap<>();
        
        String[] textarray = text.split(" ");
        Arrays.sort(textarray, Comparator.comparing(String::length)); // на этом этапе, по - сути
                                                                      // все уже отсортировано. Но, 
                                                                      // представим, что мы сортировали 
                                                                      // сами через цикл
        for (Integer index = 0; index < textarray.length; index++) {
            stats.put(index, textarray[index]);
        }
        for (int index = 0; index < textarray.length; index++) {
            System.out.println(stats.get(index));
            
        }
    }
}    