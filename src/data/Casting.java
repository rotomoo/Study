package data;

public class Casting {

    public static void main(String[] args) {

        /*- 크기가 작은 데이터 타입을 크기가 큰 데이터 타입으로 변환할 때는
        캐스트 연산자를 사용하지 않아도
        컴파일러에 의해 자동으로 형 변환이 일어납니다.(자동 형 변환: Promotion)*/

        byte a = 1;
        short b = a;     // byte  => short
        int c = b;         // short => int
        long d = c;      // int   => long
        float e = d;     // long  => float
        double f = e;     // float => double

        /*- 크기가 큰 데이터 타입을 크기가 작은 데이터 타입으로 변환할 때는
        반드시 캐스트 연산자를 사용하여 변환할 데이터 타입을 명시해야 합니다.
        (강제 형 변환: Type Casting). 그렇지 않으면 컴파일시 오류가 발생합니다.*/

        float g = (float) f;    // double => float
        long h = (long) g;         // float  => long
        int i = (int)h;            // long   => int
        short j = (short) i;    // int      => short
        byte k = (byte) j;        // short  => byte
    }
}
