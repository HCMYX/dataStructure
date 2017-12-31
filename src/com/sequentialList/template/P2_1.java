package com.sequentialList.template;

import java.util.Scanner;

public class P2_1 {
	public static void main(String[] args) {
		int i;
	    SLType SL=new SLType();         		//定义顺序表变量 
//	    DATA data=new DATA();       			//定义结点保存数据类型变量
		DATA pdata;				//定义结点保存指针变量 
	    String key;           		//保存关键字
		
		System.out.print("顺序表操作演示!\n"); 
		
	    SL.SLInit(SL);       			//初始化顺序表 
		System.out.print("初始化顺序表完成!\n");
		
		Scanner input=new Scanner(System.in);

	    do 
		{                   		//循环添加结点数据 
	        System.out.print("输入添加的结点(学号 姓名 年龄)："); 
	        DATA data=new DATA();  
	        data.key=input.next();
	        data.name=input.next();
	        data.age=input.nextInt();
	        
	        if(data.age!=0)               //若年龄不为0 
	        {
	            if(SL.SLAdd(SL,data)==0)   //若添加结点失败 
				{
	                break;            //退出死循环 
				}
	        }
		   else   				//若年龄为0 
		   {
	            break;          		//退出死循环
		   }
	    }while(true);
	    System.out.print("\n顺序表中的结点顺序为：\n");
	    SL.SLAll(SL);                  //显示所有结点数据 
	    
	    
	    System.out.print("\n要取出结点的序号：");
	    i=input.nextInt();               //输入结占点序号    
	    pdata=SL.SLFindByNum(SL,i);  //按序号查找结点 
	    if(pdata!=null)        			//若返回的结点指针不为NULL
		{ 
	        System.out.printf("第%d个结点为：(%s,%s,%d)\n",i,pdata.key,pdata.name,pdata.age);
		}
	    
	   
	    System.out.print("\n要查找结点的关键字：");
	    key=input.next();  			//输入关键字     
	    i=SL.SLFindByCont(SL,key);     //按关键字查找 ，返回结点序号 
	    pdata=SL.SLFindByNum(SL,i);   //按序号查询，返回结点指针 
	    if(pdata!=null)                     //若结点指针不为NULL 
		{
	        System.out.printf("第%d个结点为：(%s,%s,%d)\n",i,pdata.key,pdata.name,pdata.age);  
		}
	  	

	}
}
