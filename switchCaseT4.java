public class switchCaseT4 {
    public static void main(String[] args) {
        char ch = 'A';
        if (ch>=65 && ch<=90){
            switch (ch){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Character is vowel");
                    break;
                default:
                    System.out.println("character is consonant");
            }
        }else {
            System.out.println("Invalid Alphabet");
        }

        String browser = "firefox";
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
