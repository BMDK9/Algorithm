package junyoungQuiz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quiz8_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();      // 큐 생성
        Scanner sc = new Scanner(System.in);        // 값 받기

        System.out.print("카드의 개수는 ");
        int cards = sc.nextInt();
        for (int i = 1; i < cards + 1; i++) {       // 카드 1부터 i까지 카드 설정
            q.add(i);
        }

        System.out.print("몇번 섞으시겠습니까?");
        int shuffle = sc. nextInt();
        for (int i = 0; i<shuffle; i++) {           // i번 밑장 빼기.
            q.add(q.poll());                        // 밑장을 빼면 다시 제일 위로 올라간다.
        }
        System.out.println(q.peek());               // 밑장은 무슨 숫자일까?
    }
}
