public class ForPractice09 {
    public static void main(String[] args) {
        for (var i = 1800; i <= 2000; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println("閏年：" + i);
            }
        }
    }
}

