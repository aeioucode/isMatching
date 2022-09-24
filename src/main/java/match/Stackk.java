package match;

public interface Stackk<E> {
	
	int size();
	
	boolean isEmpty();
	
	void push(E e);
	
	E top();
	
	E pop();

}
