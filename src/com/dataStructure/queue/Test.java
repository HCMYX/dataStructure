package com.dataStructure.queue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Method method=new Method();
		Model data=new Model();
		int len;
		
		Scanner input =new Scanner(System.in);
		SQType sq=method.init();
		System.out.println("入队列操作：");
		System.out.println("请输入姓名 年龄");
		do {
			Model d =new Model();
			d.setName(input.next());
			d.setAge(input.next());
			if (d.getName().equals("0")) {
				break;
			}else {
				method.in(sq, d);
				len=method.len(sq);
				System.out.println("当前队列长度为："+len);
			}
		} while (true);
		
		String temp="1";
		System.out.println("出队列操作：按任意非0键操作");
		temp=input.next();
		while (!temp.equals("0")) {
			data=method.out(sq);
			System.out.printf("出队列的数据为%s,%s\n",data.getName(),data.getAge());
			len=method.len(sq);
			System.out.println("当前队列长度为："+len);
		}
		System.out.println("测试结束");
	}
}









