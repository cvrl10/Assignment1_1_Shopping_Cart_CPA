
/**
 * @author Carl
 * @version 1.0
 * Assignment 1.1
 */
public class Main 
{
	public static void main(String[] args)
	{
		/**********
		 ** Item **
		 *********/
		
		//Instantiating an array of Items references and evoking the different constructors
		System.out.println("Instantiating an array of Items references and evoking the different constructors");
		Item[] items = {new Item("pants"), new Item("shirt", 50), new Item(), new Item(), new Item("Air Jordans 1", 170.00)};
		
		//printing the elements of the Items array
		System.out.println("printing the elements of the Items array:");
		for(Item stuff : items)
			System.out.print(stuff.getItem()+" ");
		System.out.println();
		System.out.println();
		
		//toString()
		System.out.println("Evoking toString()");
		System.out.println(items[2].toString());
		
	
		//Evoking getPrice();
		System.out.println("Evoking getPrice()");
		System.out.println("The price of item of item 5 is: "+items[4].getPrice());
		//Evoking setPrice();
		items[0].setPrice(100.46464);
		//"Evoking getPrice() after evoking setPrice(double)
		System.out.println("Evoking getPrice() after evoking setPrice(double) :"+items[0].getPrice());
		System.out.println("The set price is: "+items[0].getPrice());
		System.out.println();
		
		/****************
		 * ShoppingCart *
		 ****************/
		
		//Instantiating a shopping cart object
		System.out.println("Instantiating a shopping cart object");
		ShoppingCartADT<Item> cart = new ShoppingCart();
		
		//checking if this shopping cart is empty
		System.out.println("Is this shopping cart empty: "+cart.isEmpty());
		
		//Using a for loop to add items in the shopping cart
		System.out.println("Using a for loop to add items in the shopping cart");
		for (int i = 0; i < items.length; i++)
			cart.add(items[i]);
		
		//Evoking remove(Item)
		System.out.println("Evoking removing(Item) to remove the first item that was added to this shopping cart");
		System.out.println(cart.remove(items[0]));
		
		//Evoking remove()
		System.out.println("Evoking remove() to remove a random item from this shopping cart");
		System.out.println("The item removed is "+cart.remove());
		
		//Checking the size of the shopping cart
		System.out.println("The size of this shopping cart is: "+cart.size());
		
		//Evoking clear() to empty the entire contents of this shopping cart 
		System.out.println("Empying the entire contents of this shopping cart");
		cart.clear();
		
		//Evoking isEmpty() to check that shopping cart is empty
		System.out.println("Is this shopping cart empty?: "+cart.isEmpty());
		
		//Adding Items in the shopping cart and evoking contains(Item)
		for (int i = 0; i < items.length; i++)
			cart.add(items[i]);
		
		//adding a duplicate item and evoking getFrequencyOf(Item) 
		cart.add(items[0]);
		System.out.println("How many times is this item in the shopping cart?: "+cart.getFrequencyOf(items[0]));
		
		//Instantiating a new Item and checking if it's in the shopping cart
		Item item = new Item("shoes", 50);
		
		System.out.println("Does the shopping cart contain this item?: "+cart.contains(item));
		System.out.println();
		
		//Checking the contents of the shopping cart and the total price of the items in the shopping cart
		cart.contents();
		System.out.println();
		
		//Removing a random item from the shopping cart and checking how this affects the total price
		cart.remove();
		
		System.out.println("What's the total price after removing a random item?: "+cart.totalPrice());
		System.out.println();
		
		//Evoking toArray() and printing all the items in the shopping cart
		for (Object obj : cart.toArray())
			System.out.print(obj+" ");
		
	}//end main
}//end class

