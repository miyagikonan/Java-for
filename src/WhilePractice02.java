import java.util.Scanner;

public class WhilePractice02 {
    public static void main(String[] args) {
        var sum = 0;
        while(true) {
            System.out.print("入力値：");
            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            var num = Integer.parseInt(s1);

            if (num != 0) {
                sum += num;
            } else {
                sc.close();
                break;
            }
        }
        System.out.print("入力値の合計："+ sum);
    }
}
