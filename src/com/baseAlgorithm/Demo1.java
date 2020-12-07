package com.baseAlgorithm;

//递推算法
//兔子产仔问题
//第一个月 1对兔子
//第二个月 1对兔子
//第三个月 2对兔子
//第四个月 3对兔子
//第五个月 5对兔子
//
// 第n月 有多少个兔子
public class Demo1 {

	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			int t1 = fibonacci(n - 1);
			int t2 = fibonacci(n - 2);
			return t1 + t2;
		}
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.fibonacci(5));
	}
}
