package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY_LIST = -1;
	private static final Node LIST_END = null;
	private Node last;
	private int i;

	public Node getLast() {
		return this.last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return this.i;
	}

	public void push(int i) {
		if (getLast() == LIST_END){
			setLast(new Node(i));
		}
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == LIST_END;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty()){
			return EMPTY_LIST;
		}
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_LIST;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

}
