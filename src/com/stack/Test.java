package com.stack;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Method method=new Method();
		Stack stack=new Stack();

		StackType st=method.stackInit();
		Scanner input =new Scanner(System.in);
		System.out.println("入栈操作:");
		System.out.println("请输入姓名 年龄进行入栈操作：");
		do {
			Stack s=new Stack();
			s.name=input.next();
			if (s.name.equals("0")) {
				break;
			}else {
				s.age=input.next();
				method.pushStack(st, s);
			}
		} while (true);
		String temp="1";
		System.out.println("出栈操作：输入数字进行出栈操作");
		temp=input.next();
		while(!temp.equals("0")){
			stack=method.popStack(st);
			System.out.printf("出栈的数据为(%s,%s)\n",stack.name,stack.age);
			temp=input.next();
		}
		System.out.println("测试结束");
		method.stackFree(st);
	}

}
