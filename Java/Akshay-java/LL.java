package javaproject;

public class LL {
	Node head;
	private int size;
	
	LL() {
		this.size=0;
	}
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data=data;
			this.next=null;
			size++;  
		}
	}
	
	//add- first, last
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head== null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head== null)
		{
			head=newNode;
			return;
		}
		
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=newNode;
	}
	
	//print list
	
	public void printList()
	{
		Node ptr=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		while(ptr!=null)
		{
			System.out.print(ptr.data + "->");
			ptr=ptr.next;
		}
		System.out.println("NULL");
	}
	
	//delete first
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		size--;
		head=head.next;
		
	}
	
	//delete last
		public void deleteLast()
		{
			Node pptr=head;
			Node ptr=head.next;
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			size--;
			if(head.next == null)
			{
				head=null;
				return;
			}
			while(ptr.next!=null)
			{
				ptr=ptr.next;
				pptr=pptr.next;
			}
			pptr.next=null;
		}
		
		public int getSize() {
			return size;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list = new LL();
		list.addFirst(4);
		list.addFirst(9);
		list.addFirst(3);
		list.addFirst(6);
		list.addFirst(7);
		list.addLast(12);
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.addLast(69);
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
	}

}
