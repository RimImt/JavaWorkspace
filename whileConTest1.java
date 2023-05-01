public class whileConTest1 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){ // Exit condition
            System.out.println(i);
            i++;
        }
        int a = 0;
        while (a++ < 10){
            System.out.println(a);
        }
        int b = 1;
        while (++b < 10){ // Exit condition with increment
            System.out.println(b);
        }

    }
}
