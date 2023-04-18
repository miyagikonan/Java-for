public class ForPractice07 {
    public static void main(String[] args) {

        for (var i = 0; i < 9; i++) {
            for (var k = 0; k < 5; k++) {
                if (i < 5) {
                    for (var j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    for (var j = 0; j < Math.abs(8 - i * 2); j++) {
                        System.out.print(" ");
                    }
                    for (var j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (var j = 0; j < 9 - i; j++) {
                        System.out.print("*");
                    }
                    for (var j = 0; j < Math.abs(8 - i * 2); j++) {
                        System.out.print(" ");
                    }
                    for (var j = 0; j < 9 - i; j++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println("");

        }
    }
}
