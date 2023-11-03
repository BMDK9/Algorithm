package programers.lv0;


public class AntArmy {
    public int solution(int hp) {
        int answer = 0;

        while (hp != 0) {
            if (hp - 5 >= 0) {
                hp -= 5;
                answer += 1;
            } else if (hp - 3 >= 0) {
                hp -= 3;
                answer += 1;
            } else {
                hp -= 1;
                answer += 1;
            }
        }
        return answer;
    }
}
//        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;        맘에 드는 코드

