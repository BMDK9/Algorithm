package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < time; i++) {
            String order = br.readLine();
            StringTokenizer st = new StringTokenizer(order);
            int A = Integer.parseInt(st.nextToken());

            if (A == 1) {
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            }

            if (A == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.pop()).append("\n");
            }

            if (A == 3) {
                sb.append(stack.size()).append("\n");
            }

            if (A == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                    continue;
                }
                sb.append(0).append("\n");
            }

            if (A == 5) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
