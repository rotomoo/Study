package etc;

import java.util.ArrayList;

public class Lv1_4 {
    public static void main(String[] args) {
        for (int game = 0; game < 5; game++) {
            ArrayList<Integer> answer = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                int num = ((int)(Math.random() * 45) + 1);
                answer.add(num);
            }
            System.out.println(answer);
        }
    }
}
