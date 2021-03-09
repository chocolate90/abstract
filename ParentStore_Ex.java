package abs.good;

public abstract class ParentStore_Ex {

	/*
	 *  1. 메서드에 abstract 키워드를 붙이면 추상메서드가 된다. (이 메서드는 상속을 통해서 반드시 오버라이딩 되야 한다.)
	 *  2. 추상메서드는 {} 가 없는 메서드의 선언이다.
	 *  3. 추상메서드는 일반 클래스에 선언할 수 없다. (추상메서드를 사용하려면 클래스도 추상클래스여야 한다.)
	 *  4. 추상클래스는 일반 메서드, 일반 멤버변수, 생성자 모두 사용 가능.
	 */
	
	// 멤버변수
	private String StoreName = "호식이 세마리 치킨";
	
	// 생성자
	public ParentStore_Ex() {
		System.out.println("추상클래스의 생성자 호출");
	}
	
	public String getStoreName() {
		return StoreName;
	}
	
	// 메서드 
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	
	public final void mango() { // 오버라이딩 금지
		System.out.println("망고는 전 지점 1000원 입니다.");
	}
}
