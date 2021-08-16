import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        switch (year % 12){
            case 0 :
                System.out.println("mokey");
                break;
            case 1 :
                System.out.println("rooster");
                break;
            case 2 :
                System.out.println("dog");
                break;
        }
    }
}
