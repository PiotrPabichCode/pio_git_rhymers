package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer:
 * główna klasa implementująca najważniejsze metody oraz przechowująca zmienne
 * takie jak wielkości tablicy oraz znajdujące się w niej liczby
 * @author Piotr Pabich 235944
 *
 */
public class DefaultCountingOutRhymer {
	
	/**
	 * Stałe i zmienne:
	 * EMPTY_RHYMER_ARRAY   - błąd, gdy tablica jest pusta
	 * DEFAULT_RETURN_VALUE - błąd w metodach peekaboo() i countOut() 
	 * RHYMER_SIZE          - wielkość tablicy
	 * FULL_RHYMER_ARRAY    - ostatni indeks w tablicy
	 * numbers 				- tablica przechowująca liczby
	 * total   				- obecna wielkość tablicy
	 */
	private static final int EMPTY_RHYMER_ARRAY = -1;
	
	private static final int DEFAULT_RETURN_VALUE = -1;

	private static final int RHYMER_SIZE = 12;

	private static final int FULL_RHYMER_ARRAY = RHYMER_SIZE-1;

	private final int[] numbers = new int[RHYMER_SIZE];

	private int total = EMPTY_RHYMER_ARRAY;

	/**
	 * getTotal() - getter zwracający pole total
	 * @return zwraca pole prywatne total
	 */
	public int getTotal(){
		return this.total;
	}

	/**
	 * setTotal(int total) - setter ustawiajacy pole total
	 * @param total - zmienna ustawiana w pole prywatne total
	 */
	public void setTotal(int total){
		this.total = total;
	}

	/**
	 * countIn(int in) - metoda dodająca element do tablicy
	 * @param in - element dodawany do tablicy numbers
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * callCheck() - metoda sprawdzająca czy tablica jest pusta
	 * @return zwraca true lub false
	 */
	public boolean callCheck() {
		return getTotal() == EMPTY_RHYMER_ARRAY;
	}

	/**
	 * isFull() - metoda sprawdzająca czy osiągnieto 
     * 			  maksymalną ilość elementów w tablicy
	 * @return zwraca true lub false
	 */
	public boolean isFull() {
		return getTotal() == FULL_RHYMER_ARRAY;
	}

	/**
	 * peekaboo()  - metoda zwracająca ostatnią wartość z tablicy
	 * @return zwraca element pod indeksem total lub błąd DEFAULT_RETURN_VALUE
	 */
	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return numbers[getTotal()];
	}

	/**
	 * countOut()  - metoda zwracająca wartość z tablicy pod indeksem total,
	 * 				 a pózniej dekrementującą wartość total
	 * @return zwraca element pod indeksem total lub błąd DEFAULT_RETURN_VALUE
	 */
	public int countOut() {
		if (callCheck())
			return DEFAULT_RETURN_VALUE;
		return numbers[total--];
	}

}
