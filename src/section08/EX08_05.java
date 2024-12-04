package section08;

public class EX08_05 {

	public static void main(String[] args) {
		Jogger jogger = new Jogger(); //jogger 클래스 불러와서 객체이름을 jogger로 지정
		jogger.name = "김나비"; //jogger클래스의 name을 찾아서 String 김나비 할당(괄호가 없기에 변수 유추)
		jogger.sayName(); //sayName 메소드 호출
		jogger.run(); //run메소드 호출
	}

}
