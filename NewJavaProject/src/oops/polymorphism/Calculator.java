package oops.polymorphism;

public class Calculator {
	int sum(int a, int b) {return a+b;};
	int sum(int a, int b, int c) {return a+b+c;};
	
	Calculator(){
		System.out.println("Hello Calc");
	}
	
	Calculator(int a){
		System.out.println("Hello from constructor "+a);
	}
}
