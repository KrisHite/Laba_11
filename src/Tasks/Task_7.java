package Tasks;

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

        //Описать примеры работы методов

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
    public static Node AddFirst(int data,Node head){//Добавление вначало списка(Возвращаю ссылку на голову)
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

    public static Node RemoveFirst(Node head){//(ПРОВЕРИТЬ!)Удаление эллемента сначала списка, Возвращаю ссылку на голову
        head = head.next;//Следующий эллемент становится головой
        return head;
    }
    public static Node RemoveLast(Node head){//(ПРОВЕРИТЬ!)Удаление эллемента вконце списка, Возвращаю ссылку на голову
        Node ref = head;
        Node buffer = null;//Сохраняю предыдущий
        while(ref.next != null){
            buffer = ref;
            ref = ref.next;
        }
        buffer.next = null;
        return head;
    }
    public static Node Remove(Node head, int num){//(ПРОВЕРИТЬ!)Удаляю эллемент списка с указанным номером
        Node ref = head;
        if(num == 0){
            Node result = RemoveFirst(head);
            return result;
        }
        for(int i = 0; i <= num; i++){
            ref = ref.next;
        }
        Node buffer = ref;
        ref = ref.next;
        buffer.next = ref;
        return head;
    }

    public static Node CreateHeadRec(int quantity){//(С РЕКУРСИЕЙ)Добавляю эллемент вначело и возвращаю ссылку на голову
        if(quantity != 0){
            Node head = new Node(quantity, CreateHeadRec(quantity - 1));
            return head;
        }
        return null;
    }
    public static Node CreateTailRec(int quantity){//(С РЕКУРСИЕЙ)Добавляю эллемент вконец
        if(quantity != 0) {
        Node head = new Node(quantity, null);
        CreateTailRec(quantity - 1);
        }else {
            return new Node(quantity, null);
        }
        return null;
    }
    public static String toStringRec(Node head){
        if(head.next != null) {
            System.out.print(head.value);
        }
        return null;//Не нуль! доделать!
    }
}


