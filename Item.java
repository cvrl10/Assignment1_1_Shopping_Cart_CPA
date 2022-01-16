import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * This class represents an item with price and item name
 * @author Carl
 * @version 1.0
 * Assignment 1.1
 *
 */
public class Item 
{
	private final String item;
	private double price;
	private static int number = 1;
	
	/**
	 * sets the string representation of this item to null and price to 0
	 */
	public Item()
	{
		this(null);
	}//end empty-argument constructor
	
	/**
	 * @param item, a String representation of this item
	 * @param price the price of this item
	 */
	public Item(String item, double price)
	{
		if (item == null)
		{
			this.item = "item "+number;
			number++;
		}
		else 
			this.item = item;
		setPrice(price);
	}//end constructor
	
	/**
	 * @param item, a String representation of this item
	 */
	public Item(String item)
	{
		this(item, 0);
	}//end constructor
	
	/**
	 * @return a String representation of this item
	 */
	public String getItem()
	{
		return item;
	}//end getItem
	
	/**
	 * sets the price of this item
	 * @param price, the price to set
	 */
	public void setPrice(double price)
	{
		Scanner scan = new Scanner(new DecimalFormat("#.00").format(price));
		this.price = scan.nextDouble();
	}//end setPrice
	
	/**
	 * @return the price of this item
	 */
	public double getPrice()
	{
		return price;
	}//end getPrice
	
	/**
	 * @return a String representation of this Item
	 */
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return item +": "+fmt.format(price);
	}//end toString
}//end class