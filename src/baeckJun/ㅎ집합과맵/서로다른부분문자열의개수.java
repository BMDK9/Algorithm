package baeckJun.ㅎ집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 서로다른부분문자열의개수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String question = br.readLine();

    HashSet<String> answer = new HashSet<>();
    for (int i = 0; i < question.length(); i++) {
      for (int j = i+1; j < question.length()+1; j++) {
        answer.add(question.substring(i, j));
      }
    }

    System.out.println(answer.size());
  }
}