package programers.lv0_18_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 전국대회선발고사Class {

    static class Student implements Comparable<Student> {
        int rank;
        int index;

        public Student(int rank, int index) {
            this.rank = rank;
            this.index = index;
        }

        @Override
        public int compareTo(Student s) {
            return this.rank - s.rank;
        }                   // 학생의 랭크 비교, 현재는 내림차순, s.rank를 앞으로 보내면 오름차순
    }

    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                students.add(new Student(rank[i], i));
            }
        }                   // 참석 가능한 학생

        Collections.sort(students);

        int sum = 0;
        for (int i = 0; i < 3; i++ ) {
            sum = students.get(i).index * 10000 / ((int) Math.pow(100, i));
            answer += sum;
        }

        return answer;
    }
}
