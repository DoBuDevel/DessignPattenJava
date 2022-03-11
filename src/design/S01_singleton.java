package design;

/*
 * Singleton - 하나의 객체를 아무곳에서나 접근 할 수 있다.
 * 
 * - 인스턴스가 1개만 생긴다.
 * - private 때문에 상속이 되지 않는다.
 * - private 는 외부에서의 직접호출을 통한 생성을 막는 것과 상속을 막는 두가지 기능을 수행합니다. 둘 다 
 *   "인스턴스 " 한개라는 원칙을 지킨다.
 * 
 * - Factory 패턴과 사용법이 유사함
 * - Singleton 은 Factory 의 특이 케이스.
 * - Factory 는 매번 객체를 만들어서 리턴, Singleton 은 한개만 만들어서 요청이 들어올때 마다 하나만 리턴
 * - 일반적으로 Factory 는 create 메소드,  Singleton 은 getInstance 메쏘드를 사용
 * - 
 * 
 */
class SingletonCounter {
	private static SingletonCounter singleton = new SingletonCounter();
	private int cnt = 0;
	private SingletonCounter() {
	}
	static SingletonCounter getInstance() {
		return singleton;
	}
	public int getNextInt() {
		return ++cnt;
	}
}

public class S01_singleton {
	public static void main(String[] args) {
		S01_singleton t = new S01_singleton();
		t.Amethod();
		t.Bmethod();
	}
	
	public void Amethod() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("A method 카운터 호출 "+sc.getNextInt());
	}
	
	public void Bmethod() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("B method 카운터 호출 "+sc.getNextInt());
	}
}
