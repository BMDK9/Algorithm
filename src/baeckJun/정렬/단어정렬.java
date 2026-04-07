package baeckJun.ㅍ정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class 단어정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputTime = Integer.parseInt(br.readLine());    // 받는 횟수
        Set<String> inputSet = new HashSet<>(); // 중복 제거 자료구조 Set

        for (int i = 0; i < inputTime; i++) {   // 중복 제거
            inputSet.add(br.readLine());
        }

        ArrayList<String> answerList = new ArrayList<>(inputSet);   // 중복 제거 옮겨 담기

        Collections.sort(answerList, new Comparator<String>() { // 비교 시작
            @Override
            public int compare(String o1, String o2) {  // 단어 길이 비교
                int s1 = o1.length();
                int s2 = o2.length();

                if (s1 > s2) {  // compare 메소드는
                    return 1;   // 양수면 자리 바꿈
                }
                if (s1 < s2) {
                    return -1;  // 음수와 0이면 자리 바꾸지 않음
                }
                return o1.compareTo(o2);    // 0일 시 단어 사전 순 정렬
            }
        });

        StringBuilder sb = new StringBuilder(); //  효율적 출력을 위한 SB

        for (String s : answerList) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
