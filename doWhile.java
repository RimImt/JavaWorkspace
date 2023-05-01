public class doWhile {
    public static void main(String[] args) {
        //Execute atleast 1 time or first time Entry controll beofore meets the condition
        int a = 0;
        do {
            System.out.println(a);
            a--;
        }while (a>1); //once the value of a 0 is prints first before comes here

        int ab = 1;
        do {
            System.out.println(ab);
            ab--;
        }while (ab>0); //once the value of a 0 is prints first before comes here
    }
}
