package programers.lv1;

public class 하샤드의수 {
    public boolean solution(int x) {
        boolean answer = true;
        int xx = x;
        int hNum = 0;
        while (xx != 0) {
            hNum += xx % 10;
            xx /= 10;
        }
        if (x % hNum != 0) {
            answer = false;
        }
        return answer;
    }
}
