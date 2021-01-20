package java8;

import java.util.Stack;
import java.util.stream.Stream;

public class Recursion {

	static void doWork() {
		System.out.println(" ");
	}


	static Stack<Integer> stack() {
		Stack<Integer> stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		return stack;
	}

	public static void foo(int n) {
		if(n<1) {
			return;
		}else {
			System.out.println(n);
			foo(n-1);
			System.out.println(n);
		}
	}



	public static void main(String args[]) {

		foo(3);
		doWork();
		for (Integer stack:stack()) {
			System.out.println(stack);
		}
		doWork();
		stack().stream().forEach(System.out::println);
		doWork();
		Stream.of(stack().toArray()).forEach((System.out::println));
		doWork();
		stack().forEach(System.out::println);
	}

}
