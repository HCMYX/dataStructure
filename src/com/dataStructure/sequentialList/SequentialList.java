package com.dataStructure.sequentialList;


public class SequentialList {
//顺序表
//按照顺序存储方式存储的线性表
	
	static final int MAXLEN=100;
	//定义一个顺序表
	public Data[] listData=new Data[MAXLEN];
	//顺序表已存节点数量
	public int listlen;

	//初始化顺序表
	public void init(){
		this.listlen=0;
	};
	
	/**
	 * 向顺序表中插入节点
	 * @param this 顺序表
	 * @param n 插入那个节点
	 * @param data 需要插入的数据
	 * @return
	 */
	public int sLInsert(int n,Data data){
		int i;
		if(this.listlen>=SequentialList.MAXLEN){
			System.out.println("顺序表已满，不能插入节点");
			return 0;
		}
		if (n<1||n>this.listlen) {
			System.out.println("插入序号错误，不能插入节点");
			return 0;
		}
		for (i=this.listlen;i>=n;i--) {
			//顺序表数据后移
			this.listData[i+1]=this.listData[i];
		}
		this.listData[n]=data;//插入节点
		this.listlen++;//顺序表节点+1
		return 1;
	}
	
	//往顺序表中追加节点
	public int slAdd(Data data){
		if (this.listlen>=MAXLEN) {
			System.out.println("顺序表已满，不能添加节点");
			return 0;
		}
		this.listData[this.listlen++]=data;
		return 1;
	}
	
	//删除节点 删除顺序表中第n个节点
	// 0 1 2 3 4 5 6
	//[2,4,5,6,4,7,2]
	public int slDelete(int n){
		if (n>this.listlen||n<0) {
			System.out.println("删除的节点序号不正确");
			return 0;
		}
		for (int i = n; i < this.listlen; i++) {
			this.listData[i]=this.listData[i+1];
		}
		this.listlen--;
		return 1;
	}
	
	//查找节点
	public Data slFindByNum(int n){
		if (n<1||n>this.listlen) {
			System.out.println("节点错误，不能返回节点");
			return null;
		}
		return this.listData[n];
	}
	
	//按照关键字查找节点
	 public Data slFindByCont(String key){
		 for (int i = 0; i < this.listlen; i++) {
			if (this.listData[i].getKey().compareTo(key)==0) {
				return this.listData[i];
			}
		}
		 return null;
	 }
	 
	 //展示所有节点
	 public int slAll(){
		 for (int i = 0; i < this.listlen; i++) {
			System.out.printf("(<%d>%s,%s,%d)\n",i,this.listData[i].getKey(),this.listData[i].getName(),this.listData[i].getAge());
		 }
		 return 0;
	 }
}







