package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class 숫자카드2 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      br.readLine();
      String[] CardNumbers = br.readLine().split(" ");
      br.readLine();
      String[] reqNumbers = br.readLine().split(" ");

      
      LinkedHashMap<String, Integer> answer = new LinkedHashMap<>();
      for (String reqNumber : reqNumbers) {
        answer.put(reqNumber, 0);
        for (String cardNumber : CardNumbers) {
          if (reqNumber.equals(cardNumber)) {
            answer.put(reqNumber, answer.get(reqNumber) + 1);
          }
        }
      }

      StringBuilder sb = new StringBuilder();
      for (Integer value : answer.values()) {
          sb.append(value).append(" ");
      }

      System.out.println(sb.toString().trim());
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
}
