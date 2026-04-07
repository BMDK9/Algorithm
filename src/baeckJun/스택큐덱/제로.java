package baeckJun.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();

    int cnt = Integer.parseInt(br.readLine());
    for (int i = 0; i < cnt; i++) {
      int num = Integer.parseInt(br.readLine());
      if (num > 0) {
        stack.add(num);
      } else {
        if (!stack.isEmpty()) { stack.pop(); }
      }
    }

    int answer = 0;
    for (Integer num : stack) {
      answer += num;
    }

    System.out.println(answer);
  }
}
