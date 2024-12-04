package section08;

public class EX08_19 {

	public static void main(String[] args) {
		int money = 10000; //정수형 money변수 생성 후 10000값 할당
		
		Bus bus = new Bus(); //Bus클래스를 bus이름으로 지정
		bus.take(money); //Bus클래스의 take메소드에 money값 넘겨주고 호출
	}

}
