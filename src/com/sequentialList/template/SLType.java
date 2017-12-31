package com.sequentialList.template;

public class SLType {
	static final int MAXLEN=100;
    DATA[] ListData=new DATA[MAXLEN+1];	//保存顺序表的结构数组 
    int ListLen;              		//顺序表已存结点的数量 
    
    void SLInit(SLType SL) 			//初始化顺序表
    {
        SL.ListLen=0;    			//初始化为空表
    }

    int SLLength(SLType SL)  		
    {
        return (SL.ListLen);    		//返回顺序表的元素数量
    }

    int SLInsert(SLType SL,int n,DATA data)
    {
        int i;
        if(SL.ListLen>=MAXLEN)   	//顺序表结点数量已超过最大数量 
        {
            System.out.print("顺序表已满，不能插入结点!\n");
            return 0;             	//返回0表示插入不成功 
        }
        if(n<1 || n>SL.ListLen-1)  	//插入结点序号不正确
        {
            System.out.print("插入元素序号错误，不能插入元素！\n");
            return 0;              	//返回0，表示插入不成功 
        } 
        for(i=SL.ListLen;i>=n;i--)  	//将顺序表中的数据向后移动 
    	{
            SL.ListData[i+1]=SL.ListData[i]; 
    	}
        SL.ListData[n]=data;        	//插入结点 
        SL.ListLen++;               //顺序表结点数量增加1 
        return 1;            		//成功插入，返回1
    }

    int SLAdd(SLType SL,DATA data)  //增加元素到顺序表尾部
    {
        if(SL.ListLen>=MAXLEN)  	//顺序表已满 
        {
            System.out.print("顺序表已满，不能再添加结点了！\n");
            return 0;    
        }
        SL.ListData[++SL.ListLen]=data;
        return 1;
    }

    int SLDelete(SLType SL,int n)  	//删除顺序表中的数据元素 
    {
        int i;
        if(n<1 || n>SL.ListLen+1)  	//删除结点序号不正确
        {
            System.out.print("删除结点序号错误，不能删除结点！\n");
            return 0;              	//删除不成功，返回0
        } 
        for(i=n;i<SL.ListLen;i++)  	//将顺序表中的数据向前移动 
    	{
            SL.ListData[i]=SL.ListData[i+1]; 
    	}
        SL.ListLen--;               	//顺序表元素数量减1 
        return 1;                   	//成功删除，返回1
    }

    DATA SLFindByNum(SLType SL,int n)  //根据序号返回数据元素
    {
        if(n<1 || n>SL.ListLen+1)  		//元素序号不正确
        {
            System.out.print("结点序号错误，不能返回结点！\n");
            return null;              	//不成功，则返回0
        } 
        return SL.ListData[n];
    }

    int SLFindByCont(SLType SL,String key)  		//按关键字查询结点 
    {
        int i;
        for(i=1;i<=SL.ListLen;i++)
    	{
            if(SL.ListData[i].key.compareTo(key)==0)  	//如果找到所需结点 
    		{
                return i;        					//返回结点序号 
    		}
    	}
        return 0;  								//搜索整个表后仍没有找到，则返回0 
    }

    int SLAll(SLType SL)  						//显示顺序表中的所有结点 
    {
        int i;
        for(i=1;i<=SL.ListLen;i++)
    	{
            System.out.printf("(%s,%s,%d)\n",SL.ListData[i].key,SL.ListData[i].name,SL.ListData[i].age);
    	}
    	return 0;
    }
}
