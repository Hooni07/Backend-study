public class StringExample {

    public static void main(String[] args) {

        // String => 문자열 객체
        // 객체 => heap 메모리 영역
        // 변수 => heap 메모리 영역의 주소
        // new String() : 생성자

        // 동일한 리터럴이 있는경우 별도로 생성하지 않고, 기존의 값을 바탕으로 구성

        // str.equals(str2) : str이 str2와 같은지 비교

        // 문자열 병합
        // 1. '+' 연산자 사용
        // 2. StringBuilder 활용
        StringBuilder strBdr_1 = new StringBuilder("Hello,");
        strBdr_1.append("World!");
        // 이후 toString()을 통해 String 형태로 만들어준다
        System.out.println(strBdr_1.toString());

        // 문자열 슬라이스
        // indexOf()로 index 찾기 -> substring()로 나누기

        // 문자열 대소문자 변환
        // toUpperCase(), toLowerCase()

        // 공백 제거
        // 1. 양쪽 끝 공백
        // trim();
        // 2. 문자열 중간 공백
        // replace([1], [2]) :[1]target, [2]replacement


    }
}
