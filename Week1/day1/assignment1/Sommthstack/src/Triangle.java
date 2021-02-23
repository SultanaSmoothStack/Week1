public class Triangle {
    public static void main(String[] args) {
        reverseRightTriangle();
        System.out.println(" ");
        System.out.println("........................... ");
        System.out.println("........................... ");
        rightTriangle();
        System.out.println(" ");
        System.out.println("........................... ");
        System.out.println("........................... ");
        pyramid();
        System.out.println(" ");
        System.out.println("........................... ");
        System.out.println("........................... ");
        reversePyramid();
    }

    private static void pyramid() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(" ");
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(" * ");
            }
        }
    }
    private static void reversePyramid() {
        for (int i = 5+1; i >=1; i--) {
            for (int j = i-1 ; j < 5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<= (i -1); j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void rightTriangle() {
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if(j<=i)
                    System.out.print((" * "));
            }
            System.out.println();
        }

    }

    public static void reverseRightTriangle() {
        for (int i = 5; i > 0 ; i--) {
            for (int j = 5; j > 0 ; j-- ) {
                if(j<=i)
                    System.out.print((" * "));
            }
            System.out.println();
        }
    }
}

