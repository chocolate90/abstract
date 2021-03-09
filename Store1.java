package abs.bad;

public class Store1 extends ParentStore {

	@Override
	public void apple() {
		System.out.println("서울 지점 사과는 500원 입니다.");
	}

	@Override
	public void grape() {
		System.out.println("서울 지점 포도는 600원 입니다.");
	}
	
	// 프로그래머가 실수로 orange의 오버라이딩을 뺴먹었다면?


	
}
