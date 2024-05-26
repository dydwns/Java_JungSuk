
class TestClass_1 {
	void instanceMethod() {
	}  //인스턴스 메서드

	static void staticMethod() {
	}//스태틱 메서드

	void instanceMethod2() { //인스턴스 메서드
		instanceMethod();//다른 인스턴스메서드 호출
		staticMethod();//static메서드를 호출한다.
	}

	static void staticMethod2() { //static메서드
		//instanceMethod();  //인스턴스 메서드를 호출 불가
		staticMethod(); //스태틱메서드는 호출 가능
	}

}
