package javaTest;
// 스태틱 초기화 블록, 인스턴스 초기화 블록

class MyClass{
	static int a = 3;
	
	static {
		//이 클래스가 사용되면 메모리에 클래스 정보가 올라가게 되고
		//메모리에 클래스가 올라가게 되면 스태틱 초기화 블록이 실행된다
		//그러므로 프로그램 실행 후 딱 한번만 실행된다
		System.out.println("스태틱 초기화 블록");
	}
	
	{
		//인스턴스를 생성하게 되면 실행되는 영역이다
		//인스턴스를 생성할 때 마다 실행된다
		System.out.println("인스턴스 초기화 블록");
	}
}

public class Test {
	public static void main(String[] args) {
//		System.out.println("test");
		MyClass.a=5;	//인스턴스를 만들지 않고 클래스 사용
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		MyClass.a=5;
	}
}
