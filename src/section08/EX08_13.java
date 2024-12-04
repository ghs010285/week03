package section08;

public class EX08_13 {

	public static void main(String[] args) {
		int nums[] = {100, 200}; //배열 nums생성 후 1차원배열의 값 100과 200 2개지정
		Calc calc = new Calc(); //Calc클래스 불러와서 calc로 지정
		calc.sum1(nums); //Calc클래스의 sum1메소드에 nums라는 배열 값 넘겨주고 호출
	}

}
