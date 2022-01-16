import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * This class represents a shopping cart to which items can be added
 * @author Carl
 * @version 1.0
 * Assignment 1.1
 */
public class ShoppingCart implements ShoppingCartADT<Item>
{
	private ResizableArrayBag<Item> cart;
	private double total;
	public ShoppingCart()
	{
		cart = new ResizableArrayBag<>();
		total = 0;
	}//end empty-argument constructor
	
	/**
	 * adds an item to this shopping cart
	 */
	public void add(Item element) 
	{
		cart.add(element);
		if (element != null)
			total += element.getPrice();
	}//end add

	/**
	 * removes the argument from this shopping cart if possible
	 * @return true if the item is remove
	 */
	public boolean remove(Item element) 
	{
		if (element != null && contains(element))
			total -= element.getPrice();
		return cart.remove(element);
	}//end remove(Item)

	/**
	 * removes the last item that was added to this shopping cart if possible
	 * @return Item or null if this shopping cart is empty
	 */
	public Item remove() 
	{
		Object[] items = toArray();
		if (items[size()-1] != null)
			total -= ((Item)items[size()-1]).getPrice();
		return cart.remove();
	}//end remove()

	/**
	 * @return the number of items in this shopping cart
	 */
	public int size() 
	{
		return cart.getCurrentSize();
	}//end size

	/**
	 * removes all the items in this shopping cart
	 */
	public void clear() 
	{
		cart.clear();
		total = 0;
	}//end clear

	/**
	 * @return the number of times this argument appears in this shopping bag
	 */
	public int getFrequencyOf(Item element) 
	{
		return cart.getFrequencyOf(element);
	}//end getFrequencyOf

	/**
	 * @return true if this shopping cart is empty
	 */
	public boolean isEmpty() 
	{
		return cart.isEmpty();
	}//end isEmpty

	/**
	 * @return true if this shopping cart contains the argument
	 */
	public boolean contains(Item element) 
	{
		return cart.contains(element);
	}//end contains

	/**
	 * @return the total price for all the items in this shopping cart
	 */
	public double totalPrice() 
	{
		Scanner scan = new Scanner(new DecimalFormat("#.00").format(total));
		return scan.nextDouble();
	}//end totalPrice

	/**
	 * prints the current contents of this shopping cart with prices and the total price
	 */
	public void contents() 
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		Object[] items = toArray();
		for (int i = 0; i < size(); i++)
			System.out.println(((Item)items[i]).getItem()+" price: "+fmt.format(((Item)items[i]).getPrice()));
		System.out.println("total price: "+fmt.format(total));
	}//end contents

	/**
	 * @return an array of all the elements of this shopping cart
	 */
	public Object[] toArray() 
	{
		return cart.toArray();
	}//end toArray
}//end class