package junyoungQuiz.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz6_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> team = new ArrayList<>();         // ArrayList를 생성한다.

        for (int i = 0; i < 4; i++) {                       // 4명의 팀원을 ArrayList에 입력하고자 한다.
            System.out.print("팀원 : ");
            team.add(sc.nextLine());                        // ArrayList에 값을 입력한다.
        }
        for (int i = 0; i < team.size(); i++) {
            System.out.print("팀원 : "+ team.get(i)+"\n");    // ArrayList에 입력된 값들을 출력한다.
        }
            System.out.println("배열의 길이는 : " + team.size()); // ArrayList의 길이를 출력한다.
    }
}
