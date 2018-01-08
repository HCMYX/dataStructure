package com.dataStructure.stack;


/**
 * 操作方法
 * @author mwb
 *
 */
public class Method {
	/**
	 * 初始化
	 */
//	public static void main(String[] args) {
//		
//	}
	
	public StackType stackInit(){
		StackType p = new StackType();
		p.top=0;
		return p;
	}
	
	/**
	 * 判断空栈
	 */
	boolean stackIsEmpty(StackType s){
		boolean t;
		t=(s.top==0);
		return t;
	}
	
	/**
	 * 判断满栈
	 */
	boolean stackIsFull(StackType s){
		boolean t;
		t=(s.top==StackType.MAXLEN);
		return t;
	}
	
	/**
	 * 清空栈
	 */
	public void stackClear(StackType s){
		s.top=0;
	}
	
	/**
	 * 释放空间
	 */
	public void stackFree(StackType s){
		if (s!=null){
			s=null;
		}
	}
	
	/**
	 * 入栈
	 */
	public int pushStack(StackType s,Stack stack){
		if ((s.top+1)>StackType.MAXLEN) {
			System.out.println("栈溢出");
		}
		s.stack[++s.top]=stack;
		return 1;
	}
	
	/**
	 * 出栈
	 */
	public Stack popStack(StackType s){
		if (s.top==0) {
			System.out.println("栈为空");
			System.exit(0);
		}
		return (s.stack[s.top--]);
	}
	
	/**
	 * 读取栈顶端的数据
	 */
	public Stack peekStack(StackType s){
		if (s.top==0) {
			System.out.println("栈为空");
			System.exit(0);
		}
		return s.stack[s.top];
	}
}










