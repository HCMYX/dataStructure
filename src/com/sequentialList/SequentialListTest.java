package com.sequentialList;

import java.util.Scanner;

public class SequentialListTest {

	public static void main(String[] args) {
//		int i;
		SequentialList sList=new SequentialList();
//		Data pdData=new Data();
//		String key;
		System.out.println("顺序表操作开始：");
		sList.init();//初始化
		System.out.println("长度："+sList.listlen);
		Scanner input=new Scanner(System.in);

		do {
			System.out.print("输入添加的节点（学号  姓名  年龄）：");
			Data data=new Data();
			data.setKey(input.next());
			data.setName(input.next());
			data.setAge(input.nextInt());
			
			if (data.getAge()!=0) {
				if (sList.slAdd(data)==0) {
					break;
				}
			}else {
				break;
			}
		} while (true);
		System.out.println("\n顺序表中节点顺序为：");
		sList.slAll();
		//插入节点
		System.out.print("输入需要插入的节点数据（学号  姓名  年龄）：");
		Data data=new Data();
		data.setKey(input.next());
		data.setName(input.next());
		data.setAge(input.nextInt());
		System.out.println("输入插入到那个节点（从0开始）:");
		int n=input.nextInt();
		if (sList.sLInsert(n, data)==1) {
			System.out.println("\n顺序表中节点顺序为：");
			sList.slAll();
		}else {
			System.out.println("插入失败");
		}
		//删除节点
		System.out.println("请输入需要删除的节点：");
		n=input.nextInt();
		if (sList.slDelete(n)==1) {
			System.out.println("删除成功");
			System.out.println("\n顺序表中节点顺序为：");
			sList.slAll();
		}else {
			System.out.println("删除失败");
		}

	}
}
