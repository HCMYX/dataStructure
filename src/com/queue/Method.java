package com.queue;

public class Method {

	/**
	 * 初始化一个队列
	 */
	public SQType init(){
		SQType q=new SQType();
		q.head=0;
		q.tail=0;
		return q;
	}
	
	/**
	 * 判断一个队列是否为空
	 */
	public int isEmpty(SQType q){
		int temp=0;
		if (q.head==q.tail) {
			temp=1;
		}
		return temp;
	}
	
	/**
	 * 判断满队列
	 */
	public int isFull(SQType q){
		int temp=0;
		if (q.tail==SQType.QUEUELEN) {
			temp=1;
		}
		return temp;
	}
	
	/**
	 * 清空一个队列
	 */
	public void clear(SQType q){
		q.head=0;
		q.tail=0;
	}
	
	/**
	 * 释放空间
	 */
	public void free(SQType q){
		if (q!=null) {
			q=null;
		}
	}
	
	/**
	 * 入队列
	 */
	public int in(SQType q,Model data){
		if (q.tail==SQType.QUEUELEN) {
			System.out.println("当前队列已满");
			return (0);
		}else {
			q.data[q.tail++]=data;
			return (1);
		}
	}
	
	/**
	 * 出队列
	 */
	public Model out(SQType q){
		if (q.head==q.tail) {
			System.out.println("当前队列为空");
			System.exit(0);
		}else {
			return q.data[q.head++];
		}
		return null;
	}
	
	/**
	 * 读取节点数据
	 */
	public Model peek(SQType q){
		if (isEmpty(q)==1) {
			System.out.println("队列为空");
			return null;
		}else {
			return q.data[q.head];
		}
	}
	
	/**
	 * 计算队列长度
	 */
	public int len(SQType q){
		int temp;
		temp=q.tail-q.head;
		return temp;
	}
}









