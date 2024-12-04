package section08;

public class Bus {

	void take(int m) { //리턴값 없음, 메소드 이름 take, 매개변수 정수형 m
		while(true) { //반복문인데 true가 false될때까지
			if(m < 3000) { //m이 3000보다 작으면
				System.out.println("교통카드를 충전하러 갑니다."); //돈 충전
				return; //리턴값이 없는건 메소드 종료 뜻
			}
			System.out.println("버스를 타러 갑니다."); //if문 ture의 반대값(False → 돈이 충분할때) 출력 후
			m -= 1250; //m에 1250뺀 값을 할당
		}
	}

}
