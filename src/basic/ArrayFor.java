package basic;

public class ArrayFor {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};

        days[0] = "일";

        for (int i = 0; i<days.length; i++){
            System.out.println(days[i] + "요일");
        }
    }
}
