package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 문자열집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sSize = Integer.parseInt(st.nextToken());
        int mCount = Integer.parseInt(st.nextToken());
        Set<String> s = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < sSize; i++) {
            s.add(br.readLine());
        }

        for (int i = 0; i < mCount; i++) {
            if (s.contains(br.readLine())) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
