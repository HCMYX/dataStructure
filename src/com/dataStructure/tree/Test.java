package com.dataStructure.tree;

import java.util.Scanner;

public class Test {
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		Node node=null;
		int menusel;
		Method m=new Method();
		//设置二叉树的根节点
		System.out.println("请输入二叉树的初始节点：");
		node=m.initTree(input.next());
		//添加节点
		do {
			System.out.println("请选择菜单：");
			System.out.println("0.退出。");
			System.out.println("1.添加节点");
			menusel=input.nextInt();
			switch (menusel) {
			case 1:
				m.addNode(node);
				break;
			case 0:
				break;
			default:
				break;
			}
		} while (menusel!=0);
		
		do {
			System.out.println("请选择遍历二叉树的方式：");
			System.out.println("1.先序遍历。");
			System.out.println("2.中序遍历。");
			System.out.println("3.后序遍历。");
			System.out.println("4.按层遍历。");
			menusel=input.nextInt();

			switch (menusel) {
			case 1:
				System.out.println("先序遍历结果：");
				m.dLRTree(node);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("中序遍历结果：");
				m.lDRTree(node);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("后序遍历结果：");
				m.lRDTree(node);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("按层遍历结果：");
				m.levelTree(node);
				System.out.println("\n");
				break;

			default:
				break;
			}

		} while (menusel!=0);
		
		//深度
		System.out.println("\n二叉树深度："+m.treeDepth(node));
	}
}
