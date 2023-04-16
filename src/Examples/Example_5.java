package Examples;

public class Example_5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        } else {
            System.out.print((n - 1) + (n - 2) + " -> ");
            return fact(n - 1) + fact(n - 2);
        }
    }
}
