package programmers2;

class answer2 {
    public int solution(int[] arr) {
        int answer=0;
        return answer;
    }

    public static void main(String[] args) {
        answer2 T = new answer2();
    }
}


    SELECT A.CART_ID, IF(SUM(PRICE) >= B.MINIMUM_REQUIREMENT, 0, 1) AS ABUSED FROM CART_PRODUCTS A
        LEFT JOIN COUPONS B
        ON A.CART_ID = B.CART_ID
        WHERE B.CART_ID IS NOT NULL
        GROUP BY A.CART_ID
        ORDER BY A.CART_ID;