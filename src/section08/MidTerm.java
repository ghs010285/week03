package section08;

public class MidTerm {

	public int score(int[] scores) { //리턴값 정수형 있음, 메소드명 score, 매개변수 정수형 배열
		int result = 0; //정수형 result변수에 초기값 0 할당
		for(int i=0; i<scores.length; i++) { //i가 scores배열의 길이보다 작으면 i증감
			result += scores[i]; //reslut에 scores의 i번째 값 넣기 
		}
		return result; //리턴값은 reslut로
	}

}
