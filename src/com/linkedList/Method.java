package com.linkedList;

/**
 * 链表操作方法
 * @author mwb
 * @version 2017-3-21
 */
public class Method {
	//向链表追加一个节点
	public ClType add(ClType head,Data nodeData){
		ClType node,htemp;
		node = new ClType();
		node.nodeData = nodeData;
		node.nextNode = null;
		if (head == null) {
			head = node;
			return head;
		}
		htemp = head;
		while (htemp.nextNode != null) {
			htemp = htemp.nextNode;
		}
		htemp.nextNode = node;
		return head;
	}
	//向链表中插头入节点
	public ClType addFirst(ClType head,Data nodeData){
		ClType node;
		node = new ClType();
		node.nodeData = nodeData;
		node.nextNode = head;
		head = node;
		return head;
	}
	
	//查找链表中的节点
	public ClType find(ClType head,String key){
		ClType htemp;
		htemp=head;
		while(htemp!=null){
			if (htemp.nodeData.getKey().compareTo(key)==0) {
				return htemp;
			}else {
				htemp=htemp.nextNode;
			}
		}
		return null;
	}
	
	//向链表中插入节点
	public ClType ClInsertNode(ClType head,String findkey,Data nodeData){
		ClType node=new ClType();
		ClType nodetemp=head;
		node.nodeData=nodeData;
		//查找要插入节点的位置是否有节点
		nodetemp=find(head, findkey);
		if (nodetemp!=null) {
			node.nextNode=nodetemp.nextNode;
			nodetemp.nextNode=node;
		}
		else {
			System.out.println("未找到正确的插入位置！");
		}
		return head;
	}
	
	//删除链表中的节点
	public int ClDelete(ClType head,String key){
		ClType node=new ClType();
		ClType htemp=new ClType();
		node=head;
		htemp=head;
		while(htemp!=null){
			if (htemp.nodeData.getKey().compareTo(key)==0) {
				node.nextNode=htemp.nextNode;
				htemp=null;
				return 1;
			}else {
				node=htemp;
				htemp=htemp.nextNode;
			}
		}
		return 0;//未删除
	}
	
	//计算链表的长度
	public int ClLength(ClType head){
		ClType htemp;
		int len=0;
		htemp=head;
		while(htemp!=null){
			len++;
			htemp=htemp.nextNode;
		}
		return len;
	}
	
	//显示链表中的搜所有节点
	public void ClAllNode(ClType head){
		ClType htemp=new ClType();
		Data nodeData;
		htemp=head;
		System.out.printf("链表中共有%d个节点。链表中的数据如下：\n",ClLength(head));
		while(htemp!=null){
			nodeData=htemp.nodeData;
			System.out.printf("节点(%s,%s,%d)\n",nodeData.getKey(),nodeData.getName(),nodeData.getAge());
			htemp=htemp.nextNode;
		}
	}
	
	
	
}



