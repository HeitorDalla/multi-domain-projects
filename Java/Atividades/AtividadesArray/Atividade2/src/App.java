import java.text.NumberFormat.Style;

public class App {
    public static void main(String[] args) throws Exception {
        // int nums[][] = new int[3][4];
        // int contPar = 0;
        // int contImpar = 0;

        // for (int i=0; i<3; i++) {
        //     for (int j=0; j<4; j++) {
        //         nums[i][j] = (int)(Math.random() * 100);
        //     }
        // }

        // for (int i=0; i<3; i++) {
        //     for (int j=0; j<4; j++) {
        //         if (nums[i][j] % 2 == 0) {
        //             contPar ++;
        //         } else {
        //             contImpar ++;
        //         }

        //         System.out.println(nums[i][j]);
        //     }
        // }

        // System.out.println("Contagem de valores pares: " + contPar);
        // System.out.println("Contagem de valores impares: " + contImpar);


        // Enchanced for loop
        int nums2[][] = new int[4][4];

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                nums2[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int linha[] : nums2) {
            for (int num : linha) {
                System.out.println(num);
            }
            System.out.println();
        }
    }
}