package model.data_structures;

public interface IQueue<T> extends Iterable<T>{
	
	/** Enqueue a new element at the end of the queue */
	public void enqueue(T item);
	
	/** Dequeue the "first" element in the queue
	 * @return "first" element or null if it doesn't exist
	 */
	public T dequeue();
	
	/** Evaluate if the queue is empty. 
	 * @return true if the queue is empty. false in other case.
	 */
	public boolean isEmpty();
	
	public int size();	
}
