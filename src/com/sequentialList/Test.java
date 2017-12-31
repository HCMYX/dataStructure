package com.sequentialList;

public class Test {
	public static void main(String[] args) {
		Data d=new Data();
		d.setAge(1);
		d.setKey("1");
		d.setName("nihao");
		System.out.println(d.getName());
		aa(d);
		System.out.println(d.getName());
	}
	
	public static void aa(Data data){
		Data data2=data;
		data.setName("hhhhhhh");
		data2.setName("222222");
	}
}
