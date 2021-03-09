package abs.good;

public class StoreExMain {

	public static void main(String[] args) {
		
		/*
		 * 1. 추상메서드를 사용하면 오버라이딩이 강제화 되기 때문에
		 * 프로그래머의 (오버라이딩) 실수를 줄일 수 있다.
		 * 
		 */
		
		// 서울지점
		StoreEx s = new StoreEx();

		System.out.println(s.getStoreName());
		s.apple();
		s.grape();
		s.orange();
		s.mango();
		
		System.out.println("-----------------------");
		
		// 부산지점
		ParentStore_Ex s1 = new StoreEx01();
		
		System.out.println(s1.getStoreName());
		s1.apple();
		s1.grape();
		s1.orange();
		s1.mango();
	}
}
