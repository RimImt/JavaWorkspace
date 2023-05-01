public class switchCaseT3 {
    public static void main(String args[]){
        int a = 10;
        int b = 65;
        final int x = 20;

        switch (b){
            case 10 :
                int a1 = 50;
                System.out.println(a1);
                System.out.println("ten");break;
            case 20:
                System.out.println("twenty");break;
            case 'A': //character char and integer
                char A ;
                System.out.println('A');break;
            case 10+20:
                System.out.println("constant expression");break;
            default:
                System.out.println("default");

        }
        System.out.println("END");

    }
}
