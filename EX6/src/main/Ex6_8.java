package main;

public class Ex6_8 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	static void firstMethod() {
	System.out.println("firstMethod()이 시작되었음.");
	secondMethod();
	System.out.println("firstMEthod()이 끝났음.");
	}
	static void secondMethod() {
	System.out.println("secodnMethod()이 시작되었음.");
	System.out.println("secodnMethod()이 끝났음.");
	}
}
