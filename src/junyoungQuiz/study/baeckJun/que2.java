package junyoungQuiz.study.baeckJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class que2 {
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());

        while (time-- > 0) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            switch (st.nextToken()) {
                case "push" -> push(st.nextToken());
                case "pop" -> sb.append(pop()).append("\n");
                case "size" -> sb.append(size()).append("\n");
                case "empty" -> sb.append(empty()).append("\n");
                case "front" -> sb.append(front()).append("\n");
                case "back" -> sb.append(back()).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static Integer back() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getLast();

    }

    private static Integer front() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getFirst();
    }

    private static Integer empty() {
        if (deque.isEmpty()) {
            return 1;
        }
        return 0;
    }

    private static Integer size() {
        return deque.size();
    }

    private static Integer pop() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.pop();

    }

    private static void push(String value) {
        int x = Integer.parseInt(value);
        deque.addLast(x);
    }
}
