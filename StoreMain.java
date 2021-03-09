package abs.bad;

public class StoreMain {

	public static void main(String[] args) {
		
		// 재정의를 빼먹는다면, 잘못된 메서드의 실행결과로 이어질 수도 있다는 뜻이다.
		
		Store1 st = new Store1();
		
		st.apple();
		st.grape();
		st.orange();
	}
}
