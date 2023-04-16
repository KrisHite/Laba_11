package Tasks;

import java.util.Scanner;

public class Task_1 {
    private static String result = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для преобразования: ");
        int num = in.nextInt();
        Transformation(num);
        System.out.println("Исходное число: " + num + "\nПреобразованное число: " +
                new StringBuilder(result).reverse().toString());//Разворачиваю строку
    }

    public static void Transformation(int num){
        if(num == 1){
            result = result + "1";
            return;
        }else if(num == 0){
            result = result + "0";
            return;
        }
        if(num % 2 == 1){
            result = result + "1";
        }else result = result + "0";
        Transformation(num/2);//Рекурсия
    }
}
//2. Создать приложение с использованием рекурсии
//для перевода целого числа, введенного с клавиатуры,
//в двоичную систему счисления.
