import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字");
        int num = input.nextInt();
        int num2 = (int)(Math.random()*10);
        if(num == num2){
            System.out.println(num + "等于" + num2);
        }
        else if(num < num2){
            System.out.println(num + "小于" + num2);
        }
        else{
            System.out.println(num + "大于" + num2);
        }
    }
}
//使用Math.random()获取0-1的随机double值