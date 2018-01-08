package com.dataStructure.linkedList;

import java.util.Scanner;

/**
 * 链表操作测试
 * @author mwb
 *
 */
public class Test {
	public static void main(String[] args) {
		ClType node=null;
		ClType head=null;
		Method method=new Method();
		String key,findkey;
		Scanner input = new Scanner(System.in);
		
		System.out.println("链表测试。先输入链表中的数据：关键字(关键字为0时结束录入) 姓名 年龄 ");
		//添加数据（链表中追加节点）
		do{
			Data nodeData=new Data();
			nodeData.setKey(input.next());
			if (nodeData.getKey().equals("0")) {
				break;
			}
			nodeData.setName(input.next());
			nodeData.setAge(input.nextInt());
			head=method.add(head, nodeData);
		}while(true);
		//显示所有节点
		method.ClAllNode(head);
		
		//插入节点
		System.out.println("插入节点，输入插入位置的关键字：");
		findkey=input.next();
		System.out.println("输入要插入的节点内容：关键字  姓名 年龄");
		Data nodeData=new Data();
		nodeData.setKey(input.next());
		nodeData.setName(input.next());
		nodeData.setAge(input.nextInt());
		head=method.ClInsertNode(head, findkey, nodeData);
		method.ClAllNode(head);
		
		//删除节点
		System.out.println("删除节点，输入要删除的节点的关键字：");
		key=input.next();
		method.ClDelete(head, key);
		method.ClAllNode(head);
		
		//查找节点
		System.out.println("查找节点，输入需要查找节点的关键字：");
		key=input.next();
		node=method.find(head, key);
		if (node!=null) {
			nodeData=node.nodeData;
			System.out.printf("节点(%s,%s,%d)\n",nodeData.getKey(),nodeData.getName(),nodeData.getAge());
		}else {
			System.out.println("没有找到");
		}

	}
}
