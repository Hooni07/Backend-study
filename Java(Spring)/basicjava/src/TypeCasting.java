public class TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // byte < short < int < long <(정수-실수)< float < double
        // 연산은 큰 범위를 기준으로 따라간다

        // 강제 형변환
        int a = 128;
        short b = (short)a;
        byte c = (byte)a; // overflow 발생(-128로 출력)

        // 자동 형변환
        short x = 10;
        int y = x;  // error X, int가 범위가 더 크므로 short 데이터 대입 가능, 자동으로 형 변환 가능


    }
}
