package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private static final int EMPTY_RHYMER_ARRAY = -1;
	
	private static final int DEFAULT_RETURN_VALUE = -1;

	private static final int RHYMER_SIZE = 12;

	private static final int FULL_RHYMER_ARRAY = RHYMER_SIZE-1;

	private final int[] numbers = new int[RHYMER_SIZE];

	private int total = EMPTY_RHYMER_ARRAY;

	public int getTotal(){
		return this.total;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return getTotal() == EMPTY_RHYMER_ARRAY;
	}

	public boolean isFull() {
		return getTotal() == FULL_RHYMER_ARRAY;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return numbers[getTotal()];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return numbers[total--];
	}

}
