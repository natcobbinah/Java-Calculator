package stack_ADT;

public class LinkedStack<E> implements IStack<E> {
	private Node<E> top;
	private int size = 0;

	@Override
	public boolean isEmpty() {
		return (this.size == 0);
	}

	@Override
	public E peek() {
		if(this.top != null) {
			return this.top.data;
		}else {
			return null;
		}
	}

	@Override
	public E pop() {
		if(top != null) {
			E data = this.top.data;
			this.size -= 1;
			if(top.next != null) {
				this.top = this.top.next;
			}else {
				this.top = null;
			}
			return data;
		}else {
			return null;
		}
	}

	@Override
	public void push(E item) {
		Node<E> node = new Node<E>(item);
		if(top != null) {
			node.next = top;
			top = node;
		}else {
			top = node;
		}
		this.size += 1;
	}

	@Override
	public int size() {
		return this.size;
	}
}
