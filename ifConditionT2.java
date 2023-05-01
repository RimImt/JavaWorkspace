public class ifConditionT2 {
  public static void main(String args[]){

      //3 input pseudo logic
        int a = 10;
        int b = 20;
        int c = 30;
        int max = 0;
       // int min = 0;

        if(a > b && a > c)
            max = a;

        else if (b > a && b > c)
            max = b;
            else
                max = c;

      System.out.println("Max is "+max);

  }

}
