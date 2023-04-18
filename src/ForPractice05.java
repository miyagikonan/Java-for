public class ForPractice05 {
    public static void main(String[] args) {

        for (var i = 0; i < 10; i++) {


            if (i < 5) {
                for (var j = 0; j <= i; j++) {
                    System.out.print("*");
                }

            }else {
                for (var j = 0; j < 9-i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }


        }

    }
