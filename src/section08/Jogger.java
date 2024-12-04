package section08;

public class Jogger {
	String name; //문자열 변수 name 생성
	void run() { //리턴값이 없기에 void, 메소드 이름은 run
		System.out.println("run run run!"); //뛰어라 
	}
	void sayName() {//리턴값이 없기에 void, 메소드 이름은 sayName
		System.out.println("제 이름은 "+name+"입니다."); //변수 name으로 하여 붙여서 출력
	}
	public static void main(String[] args) { //메인 메소드
		Jogger jogger = new Jogger(); //클래스 객체 생성 후 객체이름은 jogger
		jogger.run(); //jogger이름의 객체의 run 메소드 불러오기
	}

}
