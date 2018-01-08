 package com.dataStructure.graph;

public class GraphMatrix {

	//图最大顶点数
	public static final int MaxNum=20;
	//最大边数量
	public static final int MaxEdegNum=2000;
	//最大值
	public static final int MaxValue=65535;
	//保存顶点信息
	String[] vertex=new String[MaxNum];
	//图结构类型  0无向图  1有向图
	int graphType=0;
	//顶点的个数
	int vertexNum=0;
	//边的数量
	int edegNum=0;
	//保存边的权
	int[][] edgeWeight=new int[MaxNum][MaxNum];
	//遍历标志
	int[] isTrav=new int[MaxNum];
	
	
}
