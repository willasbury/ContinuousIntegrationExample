package io.github.joaomlneto.travis_ci_tutorial_java;

// code from https://github.com/joaomlneto/travis-ci-tutorial-java
public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public static final void main(String[] args) {
		System.out.println("Testing Continuous Integration");
	}
}
