package section08;

public class EX08_01 {

	public static void main(String[] args) {
		printHello(); //메소드 printHello 호출

	}
	static void printHello() { //static이기 때문에 클래스 객체 안해도 됨
		System.out.println("안녕하세요"); //출력
		System.out.println("만나서 반갑습니다");
	}

}
