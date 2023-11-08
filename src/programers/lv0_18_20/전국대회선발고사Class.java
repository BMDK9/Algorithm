package programers.lv0_18_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 전국대회선발고사Class {

    static class Student implements Comparable<Student> {       // compareTo를 쓰기 위한 인터페이스 Comparable
        int rank;
        int index;

        public Student(int rank, int index) {
            this.rank = rank;
            this.index = index;
        }                       //  Student 생성자

        @Override
        public int compareTo(Student s) {
            return this.rank - s.rank;
        }                   // 학생의 랭크 비교 메서드, 현재는 내림차순, s.rank를 앞으로 보내면 오름차순
    }

    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                students.add(new Student(rank[i], i));
            }
        }                   // 참석 가능한 학생을 구해서 Student 클래스 형태의 리스트에 랭크와 등록번호를 저장

        Collections.sort(students);         // 랭크 순으로 정렬, Student클래스 내부의 랭크 비교 메서드와 함께 쓰임.


        for (int i = 0; i < 3; i++) {
            answer += students.get(i).index * 10000 / ((int) Math.pow(100, i));
        }

        return answer;
    }
}
