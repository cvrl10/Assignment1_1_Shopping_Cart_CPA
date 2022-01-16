
/**
 * This interface defines the behavior of a shopping cart
 * 
 * @author Carl
 * @version 1.0
 * Assignment 0.1
 * ShoppingCartADT
 * Spring 2022
 */
public interface ShoppingCartADT<T> 
{
	/**
	 * @param element, the element to add to the shopping cart
	 */
	void add(T element);
	
	/**
	 * @param element, the element to remove
	 * @return T, the element removed
	 */
	boolean remove(T element);
	
	/**
	 * removes an element from this shopping cart, if possible
	 * @return T, the element removed
	 */
	T remove();
	
	/**
	 * @return the number of items in this shopping cart
	 */
	int size();
	
	/**
	 * empties this shopping cart
	 */
	void clear();
	
	/**
	 * @param element, the element to query
	 * @return the number of times an item occurs in the shopping cart
	 */
	int getFrequencyOf(T element);
	
	/**
	 * @return true, if this shopping cart contains at least one item
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @param element, the element to query 
	 * @return true, is this shopping cart contains this element
	 */
	boolean contains(T element);
	
	/**
	 * @return the total price for all the items in this shopping cart
	 */
	double totalPrice();
	
	/**
	 * prints the current contents of this shopping cart with prices and the total price
	 */
	void contents();
	
	/**
	 * @return an array of all the elements of this shopping cart
	 */
	Object[] toArray();
}//end interface