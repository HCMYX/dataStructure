 package com.dataStructure.tree;

import java.util.Scanner;

public class Method {
	
	static final int MAXLen=100;
	char[] SeqBinTree=new char[MAXLen];
	
	//初始化二叉树的根
	public Node initTree(String data){
		Node node=new Node();
		node.data=data; 
		node.left=null;
		node.right=null;
		return node;
	}
	
	//添加节点
	public void addNode(Node node){
		Node pNode=new Node();
		Node parent=new Node();
		String data;
		int menusel;
		
		Scanner input =new Scanner(System.in);
		System.out.println("请输入二叉树的节点数据：\n");
		pNode.data=input.next();
		pNode.left=null;
		pNode.right=null;
		
		System.out.println("请输入该节点的父级节点数据：\n");
		data=input.next();
		parent=findNode(node, data);
		if (parent==null) {
			System.out.println("未找到父级节点\n");
			pNode=null;
			return ;
		}
		System.out.println("1.添加该节点到左子树\n2.添加该节点到右子树\n");
			menusel=input.nextInt(); 
			if (menusel==1||menusel==2) {
				switch (menusel) {
				case 1:
					if (parent.left!=null) {
						System.out.println("左子树节点不为空");
					}else {
						parent.left=pNode;
					}
					break;
				case 2:
					if (parent.right!=null) {
						System.out.println("右子树节点不为空");
					}else {
						parent.right=pNode;
					}
					break;
				default:
					System.out.println("无效数据");
					break;
				}
			}
	}
	
	//查找节点
	public Node findNode(Node treeNode,String data){
		Node ptr;
		if (treeNode==null) {
			return null;
		}else {
			if (treeNode.data.equals(data)) {
				return treeNode;
			}else {
				if ((ptr=findNode(treeNode.left,data))!=null) {
					return ptr;
				}else if ((ptr=findNode(treeNode.right,data))!=null) {
					return ptr;
				}else {
					return null;
				}
			}
		}
	}
	
	//获得左子树
	public Node treeLeftNode(Node node){
		if (node!=null) {
			return node.left;
		}else {
			return null;
		}
	}
	
	//获得右子树
	public Node treeRight(Node node){
		if (node!=null) {
			return node.right;
		}else {
			return null;
		}
	}
	
	//判断空树
	public int treeIsEmpty(Node node){
		if (node==null) {
			return 0;
		}else {
			return 1;
		}
	}
	
	//计算二叉树的深度
	public int treeDepth(Node node){
		int depLeft=0;
		int depRight=0;
		if (node==null) {
			return 0;
		}
		depLeft=treeDepth(node.left);
		depRight=treeDepth(node.right);
		if (depLeft>depRight) {
			return depLeft+1;
		}else {
			return depRight+1;
		}
	}
	
	//清空一个二叉树
	public void clearTree(Node node){
		if (node!=null) {
			clearTree(node.left);
			clearTree(node.right);
			node=null;
		}
	}
	
	//显示一个节点
	public void nodeData(Node node){
		System.out.println(node.data);
	}
	
	//按层遍历二叉树
	public void levelTree(Node node){
		Node p=new Node();
		Node[] q=new Node[MAXLen];
		int head=0;
		int tail=0;
		
		if (node!=null) {
			tail=(tail+1)%MAXLen;
			q[tail]=node;
		}
		while(head!=tail){
			head=(head+1)%MAXLen;
			p=q[head];
			//展示节点
			nodeData(p);
			if (p.left!=null) {
				tail=(tail+1)%MAXLen;
				q[tail]=p.left;
			}
			if (p.right!=null) {
				tail=(tail+1)%MAXLen;
				q[tail]=p.right;
			}
		}
	}
	
	//先序遍历
	public void dLRTree(Node node){
		if (node!=null) {
			nodeData(node);
			dLRTree(node.left);
			dLRTree(node.right);
		}
	}
	
	//中序遍历
	public void lDRTree(Node node){
		if (node!=null) {
			lDRTree(node.left);
			nodeData(node);
			lDRTree(node.right);
		}
	}
	
	//后序遍历
	public void lRDTree(Node node){
		if (node!=null) {
			lRDTree(node.left);
			lRDTree(node.right);
			nodeData(node);
		}
	}
}







