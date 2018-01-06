package com.graph;

import java.util.Scanner;

public class GraphTools {
	// 创建矩阵图
	public static void CreateGraph(GraphMatrix gm) {
		int i,j,k;
		//权
		int weight;
		// 边的起始顶点
		String EstarV;
		// 边的终端顶点
		String EendV;
		Scanner input = new Scanner(System.in);
		System.out.println("输入图中各顶点信息:");
		for (i = 0; i < gm.MaxNum; i++) {
			System.out.printf("第%d个顶点：", i + 1);
			String vertex = input.next().toString();
			if ("end".equals(vertex)) {
				break;
			}
			gm.vertex[i] = vertex;
			gm.vertexNum++;
		}
		System.out.println("输入构成各顶点的边及权值");
		for (i = 0; i < gm.MaxEdegNum; i++) {
			System.out.printf("第%d个边的起点：",i+1);
			EstarV=input.next().toString();
			System.out.printf("第%d个边的终点：",i+1);
			EendV=input.next().toString();
			System.out.printf("第%d个边的权：",i+1);
			weight=input.nextInt();
			if ("end".equals(EstarV)) {
				break;
			}
			for (i = 0; !EstarV.equals(gm.vertex[i]);i++);
			for (j = 0; !EendV.equals(gm.vertex[j]); j++);
			gm.edgeWeight[i][j]=weight;
			gm.edegNum++;
			if (gm.graphType==0) {
				gm.edgeWeight[j][i]=weight;
			}
		}
	}
	
	//清空图
	public static void clearGraph(GraphMatrix gm){
		int i,j;
		for (i = 0; i <gm.vertexNum; i++) {
			for (j = 0; j <gm.vertexNum; j++) {
				gm.edgeWeight[i][j]=GraphMatrix.MaxNum;
			}
		}
	}
	
	//显示图
	public static void outGraph(GraphMatrix gm){
		int i,j;
		for (i = 0; i <gm.vertexNum; i++) {
			System.out.printf("\t"+gm.vertex[i]+"");
		}
		System.out.println("");
		for (i = 0; i <gm.vertexNum; i++) {
			System.out.printf(""+gm.vertex[i]+"");
			for (j = 0; j < gm.vertexNum; j++) {
				if (gm.edgeWeight[i][j]==GraphMatrix.MaxNum) {
					System.out.println("\tZ");
				}else {
					System.out.printf("\t%d",gm.edgeWeight[i][j]);
				}
			}
			System.out.println("");
		}
	}
	
	//遍历图
	public static void deepTraOne(GraphMatrix gm,int n){
		//从第n个节点开始遍历
		int i;
		//标记改顶点
		gm.isTrav[n]=1;
		//输出节点数据
		System.out.printf("->"+gm.vertex[n]+"");
		for (i = 0; i < gm.vertexNum; i++) {
			if (gm.edgeWeight[n][i]!=gm.MaxValue && gm.isTrav[n]==0) {
				deepTraOne(gm, i);
			}
		}
	}
	public static void deepTraGraph(GraphMatrix gm){
		//深度优先遍历
		int i;
		for ( i = 0; i <gm.vertexNum; i++) {
			gm.isTrav[i]=0;
		}
		System.out.println("深度优先遍历节点");
		for (i = 0; i < gm.vertexNum; i++) {
			if (gm.isTrav[i]==0) {
				deepTraOne(gm, i);
			}
		}
		System.out.println("\n");
	}
}










