import java.util.Locale;
import java.util.Scanner;

public class scannertest5 {
    public static void main(String[] args) {
        //scanner class waiting for a input in complier
        Scanner scanner = new Scanner(System.in);
        String browser = "firefox";
        browser = scanner.next();
        browser = browser.toLowerCase(Locale.ROOT);


        switch (browser){
            case "chrome":
                System.out.println("Chrome started");
                break;
            case "firefox":
                System.out.println("Firefox started");
                break;
        }
    }
}
