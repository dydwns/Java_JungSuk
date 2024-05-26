class TestClass {
	int iv;
	static int cv;

	void instanceMethod() { // 인스턴스 메서드
		System.out.println(iv); // 인스턴스 변수를 사용할 수 있다
		System.out.println(cv); // 클래스 변수를 사용할 수 있다.

	}

	static void staticMethod() { // static 메서드
		// System.out.println(iv); //인스턴수 변수 사용 불가 이유: 인스턴스 변수가 붙어있기 때문
		System.out.println(cv); // 클래스 변수는 사용가능
	}
}
