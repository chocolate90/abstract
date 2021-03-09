package abs.good;

public class StoreEx01 extends ParentStore_Ex{

	@Override
	public void apple() {
		System.out.println("부산지점의 사과는 300원");
		
	}

	@Override
	public void grape() {
		System.out.println("부산지점의 포도는 540원");
		
	}

	@Override
	public void orange() {
		System.out.println("부산지점의 오렌지는 200원");
		
	}

}
