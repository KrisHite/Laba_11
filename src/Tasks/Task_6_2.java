package Tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = in.nextInt();
        LinkedList<Integer> mans = new LinkedList<>();//Создал  LinkedList из N Эллементов

        for(Integer i = 0; i < N; i++){//Заполнил LinkedList числами
            mans.add(i);
        }
        long startTime = System.nanoTime();//Время начала счета
        while(mans.size() != 1){
            mans.add(mans.size(), mans.get(0));//Закидываю первый эллемкнт в конец
            mans.remove(0);//Удаляю первый эллемент
            mans.remove(0);//Удаляю второй эллемент
        }
        long finishTime = System.nanoTime();//время окончания счета
        System.out.println("Оставшийся эллемент: " + mans.get(0));
        System.out.println("Это заняло: " + (finishTime - startTime) + " ns.");

    }
}
//7. В кругу стоят N человек, пронумерованных от 1 до N.
//        При ведении счета по кругу вычеркивается каждый второй человек, пока не останется один.
//        Составить две программы, моделирующие процесс.
//        Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
//        Какая из двух программ работает быстрее? Почему? (1374800/3851800)

