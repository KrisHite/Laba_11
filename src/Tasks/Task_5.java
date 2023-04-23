package Tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //Заполняю HashMap
        map.put(0, "red");
        map.put(1, "blue");
        map.put(2, "orange");
        map.put(3, "pink");
        map.put(4, "car");
        map.put(5, "book");
        map.put(6, "family");
        map.put(7, "basket");
        map.put(8, "bicycle");
        map.put(9, "weather");

        System.out.println("Строка с ключем = 0: " + map.get(0));
        System.out.print("Строки с ключем > 5: ");
        for(int i = 6; i < 10; i++){
            System.out.print(map.get(i));
            if(i!=9){
                System.out.print(", ");
            }
        }

        int result = 0;//Результат перемножения ключей HashMap
        System.out.print("\nСтроки у которых длинна строки > 5 :");
        for(int i = 0; i < 10; i++){
            if(map.get(i).length() > 5){//Проверяю строку на длинну
                if(result != 0){
                    System.out.print(", ");
                }
                System.out.print(map.get(i));//Вывожу строку в консоль
                if(result == 0){//Если строка > 5, но result = 0, то result приравнивается к длинне строки
                    result = i;
                }else {
                    result = result * i;
                }
            }
        }
        System.out.print("\nПроизведение ключей этих строк = " + result);
    }
}
//6. Заполнить HashMap 10 объектами <Integer, String>.
//        Найти строки у которых ключ> 5.
//        Если ключ = 0, вывести строки через запятую.
//        Перемножить все ключи, где длина строки>5.
