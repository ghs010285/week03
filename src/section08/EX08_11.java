package section08;

public class EX08_11 {
	void introduce(String name, int age) { //리턴값 없음, 메소드명 introduce, 매개변수 문자열 name과 정수형 age
		System.out.println("제 이름은 "+name+"이고, 나이는 "+age+"세 입니다."); //넘겨받은 값 할당 후 출력
	}
	void hello() { //리턴값 없음, 메소드명 hello, 매개변수 없음
		System.out.println("안뇽하세요"); //인사해주기
	}

	public static void main(String[] args) {
		EX08_11 ex08 = new EX08_11(); //클래스 EX08_11를 불러와 ex08로 지정
		ex08.introduce("홍길동", 20); //메소드에 값 넘겨주고 호출
		ex08.hello(); //넘겨주는값이 없기에 그냥 호출
	}

}
