package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 숫자카드2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    br.readLine();
    String[] cardNumbers = br.readLine().split(" ");
    br.readLine();
    String[] reqNumbers = br.readLine().split(" ");

    Map<Integer, Integer> cardCnt = new HashMap<>();
    for (String num : cardNumbers) {
      int n = Integer.parseInt(num);
      cardCnt.put(n, cardCnt.getOrDefault(n, 0) + 1);
    }

    StringBuilder sb = new StringBuilder();
    for (String req : reqNumbers) {
      int n = Integer.parseInt(req);
      sb.append(cardCnt.getOrDefault(n, 0)).append(" ");
    }

    System.out.println(sb.toString().trim());
  }
}