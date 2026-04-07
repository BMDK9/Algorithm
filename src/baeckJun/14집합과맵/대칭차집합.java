package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 대칭차집합 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    HashMap<Integer, Integer> answerMap = new HashMap<>();

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(st.nextToken());
      answerMap.put(num, (answerMap.getOrDefault(num, 0) + 1));
    }

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int num = Integer.parseInt(st.nextToken());
      answerMap.put(num, (answerMap.getOrDefault(num, 0) + 1));
    }

    int answerCnt = 0;
    for (int num : answerMap.values()) {
      if (num == 1) { answerCnt++; }
    }

    System.out.println(answerCnt);
  }
}