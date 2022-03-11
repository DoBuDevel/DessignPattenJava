package design;

/*
 * Factory 패턴 (공장패턴)
 * 
 * - 객체를 찍어냄
 * - Abstract class 나 인터페이스에 다양한 하위 구현체가 있을 경우에 사용하면 좋음.
 * - Factory.create 형식으로 만듬. 
 * - 호출시 new 를 사용하지 않고 .Create() 로 호출하는것이 일반적인 방법과의 차이.
 * 
 */

interface Animal {
	public void printDescriptin();
}

class Test01 {
	public static Animal create(String animalName) {
		if (animalName == null) {
			throw new IllegalArgumentException("null 안됨 ");
		}
		
		if(animalName.equals("cow")) {
			return new Cow();
		}else if(animalName.equals("cat")) {
			return new Cat();
		}else if(animalName.equals("dog")) {
			return new Dog();
		}else {
			return null;
		}
	}
}

class Cow implements Animal{
	@Override
	public void printDescriptin() {
		System.out.println("milk and meat");
	}
}

class Cat implements Animal {
	@Override
	public void printDescriptin() {
		System.out.println("take mouse");
	}
}
class Dog implements Animal {
	@Override
	public void printDescriptin() {
		System.out.println("save home");
		
	}
}


public class S02_factory {
	public static void main(String[] args) {
		Animal a1 = Test01.create("cow");
		a1.printDescriptin();
		Animal a2 = Test01.create("cat");
		a2.printDescriptin();
		Animal a3 = Test01.create("dog");
		a3.printDescriptin();
	}
}
