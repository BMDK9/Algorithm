package baeckJun.ㅂ심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 너의평점은 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalMulti = 0;
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String title = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double score = 0;
            sum += point;

            switch (grade) {
                case "A+" -> score = 4.5;
                case "A0" -> score = 4.0;
                case "B0" -> score = 3.0;
                case "B+" -> score = 3.5;
                case "C+" -> score = 2.5;
                case "C0" -> score = 2.0;
                case "D+" -> score = 1.5;
                case "D0" -> score = 1.0;
                case "F" -> score = 0;
                case "P" -> sum -= point;
            }
            double multi = point * score;
            totalMulti += multi;
        }
        System.out.println(totalMulti / sum);
    }
}
