package section08;

public class Calc {

	void sum(int num1, int num2) { //리턴값 없음, 메소드명 sum, 매개변수 정수형 num1, num2
		System.out.println("두 수의 합은 "+(num1 + num2)+"입니다"); //넘겨받은 값 할당 후 출력
	}
	void sum1(int[] nums) { //리턴값 없음, 메소드명 sum1, 매개변수 정수형 배열 nums
		int result = 0; //result의 변수 초기값은 0
		for(int i=0; i<nums.length; i++) { //i가 nums의 길이보다 클때까지 길이만큼 반복하기
			result += nums[i]; //result에 nums의 값들을 다 더해주고 할당
		}
		System.out.println("숫자들의 합은 "+result+"입니다."); //변수 불러와서 출력
	}
	public int sum2(int[] nums) { //리턴값 정수형, 메소드명 sum2, 매개변수 정수형 배열 nums
		int result = 0; //result의 변수 초기값은 0
		for(int i=0; i<nums.length; i++) {//i가 nums의 길이보다 클때까지 길이만큼 반복하기
			result += nums[i];//result에 nums의 값들을 다 더해주고 할당
		}
		return result; //result값 반환
	}

}
