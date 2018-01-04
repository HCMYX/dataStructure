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
		for (i = 0; i < gm.vertexNum; i++) {
			System.out.printf("第%d个顶点：", i + 1);
			String vertex = input.next().toString();
			if ("end".equals(vertex)) {
				break;
			}
			gm.vertex[i] = vertex;
		}
		System.out.println("输入构成各顶点的边及权值");
		for (i = 0; i < gm.edegNum; i++) {
			System.out.printf("第%d个顶点：",i+1);
			EstarV=input.next().toString();
			EendV=input.next().toString();
			weight=input.nextInt();
			for (i = 0; EstarV!=gm.vertex[i];i++);
			for (j = 0; EendV!=gm.vertex[j]; j++);
			gm.edgeWeight[i][j]=weight;
			if (gm.graphType==0) {
				gm.edgeWeight[j][i]=weight;
			}
		}
	}
	
	//清空图
	public void clearGraph(GraphMatrix gm){
		int i,j;
		for (i = 0; i <gm.vertexNum; i++) {
			for (j = 0; j <gm.vertexNum; j++) {
				gm.edgeWeight[i][j]=GraphMatrix.MaxNum;
			}
		}
	}
	
	//显示图
	public void outGraph(GraphMatrix gm){
		int i,j;
		for (i = 0; i <gm.vertexNum; i++) {
			System.out.printf("\t%c",gm.vertex[i]);
		}
		System.out.println("");
		for (j = 0; j <gm.vertexNum; j++) {
			System.out.printf("%c",gm.vertex[i]);
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
}










