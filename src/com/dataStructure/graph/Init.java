package com.dataStructure.graph;

import java.util.Scanner;

/**
 * 初始化
 * @author mwb
 *
 */
public class Init {
	
	public static void main(String[] args) {
		GraphMatrix gm=new GraphMatrix();
		Scanner input=new Scanner(System.in);
		System.out.println("输入图结构类型 0.无向图   1.有向图");
		gm.graphType=input.nextInt();
		//插入节点
		GraphTools.CreateGraph(gm);
		//输出
		GraphTools.outGraph(gm);
	}
}
