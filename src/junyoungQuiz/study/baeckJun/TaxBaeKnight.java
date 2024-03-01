package junyoungQuiz.study.baeckJun;

import java.util.Scanner;

public class TaxBaeKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taxBea = sc.nextInt();
        int visitHome = 0;
        boolean[] inputHome = new boolean[101];

        for (int i = 0; i < taxBea; i++) {
            int home = sc.nextInt();
            if (!inputHome[home]) {
                inputHome[home] =true;
                visitHome++;
            }
        }
        System.out.println(visitHome);
    }
}
