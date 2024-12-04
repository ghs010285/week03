package section08;

public class EX08_17 {

	public static void main(String[] args) {
		int[] studentA = {97, 53}; //배열 studentA생성 후 1차원배열의 값 97과 53 2개지정
		int[] studentB = {95, 66}; //배열 studentB생성 후 1차원배열의 값 95과 66 2개지정
		 
		MidTerm mid = new MidTerm(); //MidTerm클래스 불러와서 mid 이름 지정
		int sumA = mid.score(studentA); //정수형 sumA변수 생성 후 MidTerm의 score메소드에 studentA값 할당 후 호출
		int sumB = mid.score(studentB); //정수형 sumB변수 생성 후 MidTerm의 score메소드에 studentB값 할당 후 호출
		
		if(sumA > sumB) { //만약 sumA가 sumB보다 크면
			System.out.println("A학생의 중간고사 총점이 더 높습니다."); //출력
		} else if(sumA < sumB) { //그게 아니고 만약 sumA가 sumB보다 작으면
			System.out.println("B학생의 중간고사 총점이 더 높습니다."); //출력
		} else { //sumA와 sumB의 값이 같으면
			System.out.println("두 학생의 중간고사 총점이 같습니다"); //출력
		}
	}

}
