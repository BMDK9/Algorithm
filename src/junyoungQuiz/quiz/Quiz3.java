package junyoungQuiz.quiz;

public class Quiz3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {               // i = 행
            for (int j = 0; j < 5; j++) {           // j = 열
                System.out.print(i+j+1+" ");
            }
            System.out.println();
        }
    }
}
