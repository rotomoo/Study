package programmers;

class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int tmp = 0;
            for (int j = i + 1; j < prices.length; j++) {
                tmp ++;
                if (prices[i] > prices[j]) break;
            }
            answer[i] = tmp;
        }
        return answer;
    }
}