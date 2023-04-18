public class WhilePractice01 {
    public static void main(String[] args) {
        var i = 0;
        while(i < 10) {
            System.out.print(i);
            i++; // これがないと無限ループになって処理が終わらなくなるので注意。
        }
    }
}
