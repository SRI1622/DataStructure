package learn;

class Node{
	int data;
	Node next;
}
class LinkList{
	 Node head ;
	 public void InsertElement(int value) {
		 Node newNode = new Node();
		 newNode.data = value;
		 newNode.next = null;
		 if(head==null) {
			 head=newNode;
		 }
		 else {
			 Node temp = head;
			 while(temp.next!=null) {
				 temp = temp.next;
			 }
			 temp.next= newNode;
		 }
	 }
	 public void addFirst(int value) {
		 Node newNode = new Node();
		 newNode.data = value;
		 newNode.next = head;
		 head=newNode;
	 }
	 public void InsertAt(int index,int value) {
		 Node newNode = new Node();
		 newNode.data = value;
		 newNode.next=null;
		 if(index==0)
			 addFirst(value);
		 else {
			 Node temp = head;
			 for(int i=0;i<index-1;i++) {
				 temp = temp.next;
			 }
			 newNode.next = temp.next;
			 temp.next = newNode;	 
		 }
	 }
	 public int SearchData(int value) {
		 Node temp = head;
		 while(temp!=null) {
			 if(temp.data == value) {
				 System.out.println();
				 System.out.println(value + " Data Founded");
				 return 1;
			 }
			 else {
				 temp=temp.next;
			 } 
		 }
		 System.out.println(value+ " Not founded");
		 return -1;
	 }
	 
	 public void DeleteData(int value) {
		 if(head.data == value) {
			 head = head.next;
		 }
		 else {
			 Node temp = head;
			 while(temp.next!=null) {
				 if(temp.next.data == value) {
					 temp.next = temp.next.next;
					 
				 }
				 else {
					 temp = temp.next;
				 }
			 }
		 }
	 }
	 public void show() {
		 Node n = head;
		 while(n.next!=null) {
			 System.out.print(n.data+" ");
			 n=n.next;
		 }
		 System.out.print(n.data); 
	 }
}

public class LinkedList {

	public static void main(String[] args) {
		LinkList s = new LinkList();
		s.InsertElement(24);
		s.InsertElement(100);
		s.InsertElement(200);
		s.InsertElement(300);
		s.InsertElement(400);
		s.InsertElement(500);
		
		s.addFirst(10);
		s.addFirst(20);
		
		s.InsertAt(2, 7);
		s.InsertAt(1, 3);
		s.InsertAt(0, 5);
		
		s.show();
		
		s.SearchData(400);
		s.SearchData(600);
		
		s.DeleteData(200);
		s.DeleteData(500);
		s.DeleteData(10);
		s.DeleteData(100);
		s.show();
		
	}

}
