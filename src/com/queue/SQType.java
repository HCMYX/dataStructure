package com.queue;


/**
 * 队列数据结构
 * @author mwb
 *
 */
public class SQType {
	public static final int QUEUELEN=15;
	public Model[] data=new Model[QUEUELEN];//队列数组
	public int head;//队头
	public int tail;//队尾
}
