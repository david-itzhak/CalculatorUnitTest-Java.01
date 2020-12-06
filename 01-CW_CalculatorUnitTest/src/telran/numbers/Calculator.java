package telran.numbers;

public class Calculator {
public static int sum (int n1, int n2) {
	return n1 + n2;
}
public static int subtract(int n1, int n2) {
	return n1 - n2;
}
public static int divide(int n1, int n2) {
	return n1 / n2;
}
public static int multiply(int n1, int n2) {
	return n1 * n2;
}
public static int digits(int number) {
	String num = "" + number;
	return num.length();
}
public static int pow(int a, int b) {
	int res = a;
	for(int i = 1; i < b; i++) {
		res *= a;
	}
	return res;
}
}
