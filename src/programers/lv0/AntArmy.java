package programers.lv0;


public class AntArmy {
    public int solution(int hp) {
        int answer = 0;                             // 개미들의 공격 횟수

        while (hp != 0) {                           // hp가 남아있을 때
            if (hp - 5 >= 0) {                      // 장군 개미의 공격
                hp -= 5;
                answer += 1;
            } else if (hp - 3 >= 0) {               // 병정 개미의 공격
                hp -= 3;
                answer += 1;
            } else {                                // 일 개미의 공격
                hp -= 1;
                answer += 1;
            }
        }
        return answer;
    }
}
//        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;        맘에 드는 코드

