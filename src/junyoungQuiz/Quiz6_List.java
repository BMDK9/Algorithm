package junyoungQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz6_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> team = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("팀원 : ");
            team.add(sc.nextLine());
        }
        for (int i = 0; i < team.size(); i++) {
            System.out.print("팀원 : "+ team.get(i)+"\n");
        }
            System.out.println("배열의 길이는 : " + team.size());
    }
}
