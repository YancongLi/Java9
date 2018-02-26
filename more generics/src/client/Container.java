package client;

public class Container<type1, type2> {
	
	type1 item1;
	type2 item2;
	
	public Container(type1 item1, type2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Printing contents of container: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
	}

	public type1 getItem1() {
		return item1;
	}

	public void setItem1(type1 item1) {
		this.item1 = item1;
	}

	public type2 getItem2() {
		return item2;
	}

	public void setItem2(type2 item2) {
		this.item2 = item2;
	}
	
	
}
