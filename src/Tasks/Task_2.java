package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    private static String stringOfNumbersArray;//Массив чисел в формате строки
    private static int count = 0;//Счетчик для вывода массива
    private static int countTwo = 0;//Счетчик для вывода массива
    public static void main(String[] args) {
        System.out.println("Для заполнения массива целых чисел вводите их через enter,\n" +
                "для завершения введите пустую строку: ");
        //метод для ввода
        int[] nums = ArrayIn();
        nums = ReverseArray(nums);
        System.out.println("Введенный массив: ");
        //Метод для вывода массива
        DisplayToArray(nums);
    }

    private static int[] ArrayIn(){//Метод для ввода массива
        Scanner in = new Scanner(System.in);

        if(stringOfNumbersArray == null){
            stringOfNumbersArray = in.nextLine() + " ";
            if(stringOfNumbersArray == ""){
                System.out.println("Вы не ввели ничего!");
                System.exit(0);//Если ничего не ввели сразу то программа завершается
            }
        }
        String numberOfString = in.nextLine();
        if(numberOfString != ""){
            stringOfNumbersArray = stringOfNumbersArray + numberOfString + " ";
            count++;
            ArrayIn();//Рекурсия
        }
        int[] numbers = Arrays.stream(stringOfNumbersArray.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        return numbers;
    }

    private static void DisplayToArray(int[] nums){//Метод для вывода массива
        if(count < 0){
            return;
        }else {
            System.out.println(nums[count]);
            count--;
            DisplayToArray(nums);
        }
    }
    private static int[] ReverseArray(int[] numbers){//Переворачиваю массив для корректного вывода
        int[] result = new int[numbers.length];
        for(int i = 0,k = numbers.length - 1; i < numbers.length; i++, k--){
            result[i] = numbers[k];
        }
        return result;
    }

}
//3. Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
//        Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.