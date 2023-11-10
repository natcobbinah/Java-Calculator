package stack_ADT;

public interface IStack<E> {
	boolean isEmpty();
	E peek();
	E pop();
	void push(E item);
	int size();
}
