
class Ex_InnerClass {
    int iv = 100;              // 인스턴스 변수
    static int cv = 100;       // 정적 변수
    final static int CONST = 100;  // 정적 상수 final은 상수이기 때문에 가능

    static class StaticInner {
        int iv = 200;          // 인스턴스 변수
        static int cv = 200;   // 정적 변수
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;      // 인스턴스 변수
            // static int cv = 300; // 정적 변수는 지역 내부 클래스에서 허용되지 않음
            final static int CONST = 300; // 정적 상수
        }

        // 예제 사용
        LocalInner localInner = new LocalInner();
        System.out.println("LocalInner iv: " + localInner.iv);
        System.out.println("LocalInner CONST: " + LocalInner.CONST);
    }
}
