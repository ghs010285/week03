package section08;

public class EX08_15 {

	public static void main(String[] args) {
		int[] nums = {500, 200}; //배열 nums생성 후 1차원배열의 값 500과 200 2개지정
		Calc calc = new Calc(); //Calc클래스 불러와서 calc이름으로 지정 
		
		System.out.println("숫자들의 합은 "+calc.sum2(nums)+"입니다."); //calc클래스의 sum2메소드에 배열 nums값 넘겨주고 호출
	}

}
