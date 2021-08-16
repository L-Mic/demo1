import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字");
        int num = input.nextInt();
        if(num == 9){
            System.out.println(num + "等于9");
        }
        else if(num < 9){
            System.out.println(num + "小于9");
        }
        else{
            System.out.println(num + "大于9");
        }
    }
}
