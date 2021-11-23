package programmers;

public class MakePrime {
    static int answer=0;
    static int[] ch;

    public static boolean isCheck(int v) {
        if (v==1) return false;
        for (int i=2; i<v; i++) {
            if (v%i==0) return false;
        }
        return true;
    }

    public static void DFS(int L,int s, int[] nums, int sum) {
        if (L==3) {
            if (isCheck(sum)) answer++;
        }
        else {
            for (int i=s; i<nums.length; i++) {
                DFS(L+1,i+1,nums,sum+nums[i]);
            }
        }
    }

    public int solution(int[] nums) {
        answer = 0;
        ch=new int[nums.length];
        DFS(0,0,nums,0);
        return answer;
    }

    public static void main(String[] args) {
        MakePrime T = new MakePrime();
        int[] priorities={1,2,7,6,4};
        System.out.println(T.solution(priorities));
    }
}
