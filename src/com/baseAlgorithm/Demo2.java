package com.baseAlgorithm;

//概率算法
//1、将问题转化为相应的几何图形S，S的面积容易计算，问题的结果往往对应几何图形中某一部分S1的面积
//2、向几何图形内随机撒点
//3、统计几何图形S和S1中的点数。根据S和S1的面积的关系及各图形中的点数来计算得到结果。
//4、判断上述结果是否在需要的精度之内，如果未达到精度则执行步骤2，如果达到精度，输出结果
//概率算法四种形式：数值概率算法；蒙特卡罗算法；拉斯维加斯算法；；舍伍德算法；

public class Demo2 {
	//蒙特卡罗算法
	//计算圆周率 π
	// S=π*r²
	public double montePI(int n) {
		double PI;
		double x,y;
		int i,sum = 0;
		for (i = 0; i <n; i++) {
			x=Math.random();
			y=Math.random();
			if ((x*x+y*y)<=1) {
				sum++;  
			}
		}
		PI=4.0*sum/n;
		return PI;
	}
	
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println(d.montePI(50000000));
	}
}
