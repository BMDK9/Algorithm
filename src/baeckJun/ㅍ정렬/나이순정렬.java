package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputTime = Integer.parseInt(br.readLine());
        // 2인 이유는 '이름'과 '나이' 두 가지 정보만 받음
        String[][] answer = new String[inputTime][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < answer.length; i++) {   // 이중배열을 맵처럼
            StringTokenizer st = new StringTokenizer(br.readLine());
            answer[i][0] = st.nextToken();  // 나이
            answer[i][1] = st.nextToken();  // 이름
        }

        Arrays.sort(answer, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int age1 = Integer.parseInt(o1[0]);
                int age2 = Integer.parseInt(o2[0]);

                return Integer.compare(age1, age2);
            }
        });

        for (String[] strings : answer) {
            sb.append(strings[0]).append(" ").append(strings[1]).append("\n");
        }

        System.out.println(sb);
    }
}
