package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class 듣보잡 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int noHearCnt = Integer.parseInt(st.nextToken());
    int noSeeCnt = Integer.parseInt(st.nextToken());

    HashMap<String, Boolean> answerDir = new HashMap<>();
    for (int i = 0; i < noHearCnt; i++) {
      String name = br.readLine();
      answerDir.put(name, true);
    }

    int answerCnt = 0;
    List<String> answerNames = new ArrayList<>();
    for (int i = 0; i < noSeeCnt; i++) {
      String name = br.readLine();
      boolean isNoHear = answerDir.getOrDefault(name, false);

      if (isNoHear) {
        answerNames.add(name);
        answerCnt++;
      }
    }

    Collections.sort(answerNames);
    System.out.println(answerCnt);
    for (String name : answerNames) {
      System.out.println(name);
    }
  }
}