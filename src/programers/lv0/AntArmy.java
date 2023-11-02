package programers.lv0;


public class AntArmy {
    public int solution(int hp) {
        int boss = 0;        int soldier = 0;        int slave = 0;

        while (hp != 0) {
            if (hp - 5 >= 0) {
                hp -= 5;
                boss += 1;
            } else if (hp - 3 >= 0) {
                hp -= 3;
                soldier += 1;
            } else {
                hp -= 1;
                slave += 1;
            }
        }
        int answer = boss + soldier + slave;
        return answer;
    }
}
//    public int solution(int hp) {
//        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
//    }

