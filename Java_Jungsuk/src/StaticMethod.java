
class StaticMethod {
 long a, b;
 
 long add () {  //인스턴스 메서드
	 return a+b;
 }
 static long add(long a, long b) {//클래스메서드 (static 메서드)
	 return a+b;
 }
}
