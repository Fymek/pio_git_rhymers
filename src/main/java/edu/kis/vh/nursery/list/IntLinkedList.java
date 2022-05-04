package edu.kis.vh.nursery.list;

/**
 * @Autor Szymon Owczarek
 */
public class IntLinkedList {

	private Node last;
	private int i;

	/**
	 * METODA ZAPISUJE WARTOŚĆ NA OSTATNIM INDEKSIE LISTY
	 *
	 * @param i - wartość która ma być dodana do listy
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 *
	 * @return false - jeśli ostatni element (last) nie jest równy null
	 * @return true - jeśli ostatni element (last) jest równy null
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * METODA ZAWSZE ZWRACA FALSE
	 *
	 * @return false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * METODA ZWARACA OSTATNIĄ WARTOŚĆ
	 *
	 * @return - zwracana zostaje wartosc ostatnio dodanego elementu
	 * @return -1 - jesli lista jest pusta
	 *
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	/**
	 * USUWA I ZWARACA OSTATNIĄ WARTOŚĆ
	 *
	 * @return  - zwracana zostaje wartosc usuniętego elementu
	 * @return -1 - jesli lista jest pusta
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

class Node {

	private int value;
	private Node prev, next;

	public Node(int i) {
		this.value = i;
	}

	public int getValue() {
		return value;
	}


	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}