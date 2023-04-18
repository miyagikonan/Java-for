public class ForPractice04 {
    public static void main(String[] args) {

        for (var i = 0; i < 5; i++) {
            for (var j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
