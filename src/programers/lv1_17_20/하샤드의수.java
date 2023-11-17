package programers.lv1_17_20;

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

//    public boolean chatGPT(int x) {
//        if (x == 0) {
//            return true; // 0 is divisible by any number
//        }
//
//        int originalX = x;
//        int digitSum = 0;
//
//        while (x > 0) {
//            digitSum += x % 10;
//            x /= 10;
//        }
//
//        return originalX % digitSum == 0;
//    }

}
