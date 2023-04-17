package Tasks;

public class Task_4 {
    public static void main(String[] args) {
    //добавление эллементов "наращиванием головы"
        Node head = null;//Начальная ссылка на голову отсутствует
        for (int i = 9; i >= 0; i--){
            head = new Node(i, head);
        }
        //вывод эллементов на экран
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

