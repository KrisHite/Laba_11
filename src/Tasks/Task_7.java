package Tasks;

import java.util.Arrays;

public class Task_7 {
    /**
     *Создаю методы только для int
     * Необходимо все перенести в класс Node!
     * Поскольку там все можно сделать "КРАСИВО!"
     */
    public static void main(String[] args) {
        //Пример наращивания списка с головы
        Node list1 = createHead(5);//Создание головы(Ссылка на голову)
        //Пример наращивания списка с хвоста
        Node list2 = createTail(7);//Создание хвоста
        //Пример вывода списка
//        System.out.println(toString(list1));
//        System.out.println(toString(list2));
//        //Проверяю добавление вначало листа
//        System.out.println(toString(AddFirst(50, list1)));
//        System.out.println(toString(AddLast(666, list2)));
        //Проверяю вставку эллемента по номеру
//        Insert(351, list2, 3);
//        System.out.println(toString(list2));
        //Проверяю удаление сначала строки
//        list2 = RemoveFirst(list2);
//        System.out.println(toString(list2));
        //Проверяю удаление с хвоста
//        list2 = RemoveLast(list2);
//        System.out.println(toString(list2));
        //Проверяю удаление по номеру
//        list2 = Remove(list2, 3);
//        System.out.println(toString(list2));
        //Проверяю добавление с головы с рекурсией и вывод с рекурсией
//        list2 = CreateHeadRec(list2, 55, 66, 73);
//        System.out.println(toStringRec(list2));
        //Проверяю добавление с хвосты с рекурсией
        list2 = CreateTailRec(list2, 666);
        System.out.println(toStringRec(list2));


    }
    public static Node createHead(int quantity){//Наращивание с головы,Возвращаем адресс головы
        Node head = new Node(0, null);
        Node ref = head;//Вспомогательная переменная
        for(int i = 1; i < quantity; i++){
            while(ref.next != null){
                ref = ref.next;
            }
            ref.next = new Node(i, null);
        }
        return head;//Возвращаем адресс головы
    }
    public static Node createTail(int quantity){//Наращивание с хвоста, Возвращаем адресс головы
        Node head = null;
        for(int i = 0; i < quantity; i++){
            head = new Node(i, head);
        }
        return head;//Тут всегда создается голова
    }
    public static String toString(Node head){//Выводит строку из эллементов списка
        String result = "(";
        while (head.next != null) {
            result += head.value;
            head = head.next;
            if(head.next != null){
                result += ", ";
            }else {
                result += ", " + head.value + ")";
            }
        }
        return result;
    }
    public static Node AddFirst(int data, Node head){//Добавление вначало списка(Возвращаю ссылку на голову)
        head = new Node(data, head);
        return head;
    }

    public static Node AddLast(int data, Node head){//Добавление вконец списка(Возвращаю ссылку на голову)
        Node ref = head;
        while (ref.next != null) {//Мотаем вниз
            ref = ref.next;
        }
        Node newNode = new Node(data, null);//Создаем эллемент
        ref.next = newNode;//И добавляем
        return head;
    }
    public static Node Insert(int data, Node head, int number){//Вставки эллемента по номеру(Возвращаю ссылку на голову)
        Node ref = head;
        if(number == 0){
            Node result = new Node(data, head);
            return result;//Становится головой
        }
        int i = 0;
        while (i != number - 1){
            ref = ref.next;
            i++;
        }
        Node newNode = new Node(data, ref.next);
        ref.next = newNode;
        return head;
    }

    public static Node RemoveFirst(Node head){//Удаление эллемента сначала списка, Возвращаю ссылку на голову
        head = head.next;//Следующий эллемент становится головой
        return head;
    }
    public static Node RemoveLast(Node head){//Удаление эллемента вконце списка, Возвращаю ссылку на голову
        Node ref = head;
        Node buffer = null;//Сохраняю предыдущий
        while(ref.next != null){
            buffer = ref;
            ref = ref.next;
        }
        buffer.next = null;
        return head;
    }
    public static Node Remove(Node head, int num){//Удаляю эллемент списка с указанным номером
        Node ref = head;
        if(num == 0){
            Node result = RemoveFirst(head);
            return result;
        }
        for(int i = 0; i < (num - 1); i++){
            ref = ref.next;
        }
        Node buffer = ref;
        ref = ref.next;
        buffer.next = ref.next;
        return head;
    }

    public static Node CreateHeadRec(Node head, int... quantity){//(С РЕКУРСИЕЙ)Добавляю эллемент вначело и возвращаю ссылку на голову
        if(quantity.length == 1){//Если остался один
            Node newHead = new Node(quantity[0], head);
            return newHead;
        }
        int[] refArray = Arrays.copyOfRange(quantity, 1, quantity.length);//Копирую без первого эллемента
        Node newElement = new Node(quantity[0], head);
        head = CreateHeadRec(newElement, refArray);
        return head;
    }
    public static Node CreateTailRec(Node head, int quantity){//(С РЕКУРСИЕЙ)Добавляю эллемент в конец
        Node ref = head;
        if(ref.next == null){
            Node newElement = new Node(quantity, null);
            ref.next = newElement;
        }else {
            CreateTailRec(ref.next, quantity);
        }
        return head;
    }
    public static String toStringRec(Node head){//Вывод списка с рекурсией
        if(head.next != null) {
            System.out.print(head.value + ", ");
            head = head.next;
            toStringRec(head);
        }else{
            System.out.print(head.value);
        }
        return " ";
    }
}


