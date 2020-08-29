/* Programming Fundamentals
 * Name: Nhu-Chi Ha
 * PROGRAMMING ASSIGNMENT 4
 */
public class Set 
{
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	Set() 
	{
		front = null;
		count = 0;
	}
	// Create the add method
	void add(int x) 
	{
		LinkedNode newNode = new LinkedNode(x);
	    newNode.next = front;
	    front = newNode;
	    count++;
	}
	// Create the delete method
	void delete(int deleteNum) 
	{		
		LinkedNode temp = front;
		if(temp.x == deleteNum)
			front = front.next;
		else 
		{
			while(temp.next != null)
			{
				if(temp.next.x == deleteNum)
				{
					temp.next = temp.next.next;
					break;
				}
				else 
					temp = temp.next;
			}	
		}
	}
	
	// Create the exist method
	public boolean exists(int searchNum)
	{
		LinkedNode current = front;
		while(current.next!=null)
		{
			if(searchNum == current.x || searchNum == front.x)
			{
				return true;	
			}
			current = current.next;	
		}
		return false;
	}
	// Create the toString method
	public String toString()
	{
		String result ="";
		LinkedNode current = front;
		while(current.next !=null)
		{
			current = current.next;
			result = result+ " "+ current.x;
		} 
		return front.x + result;
	}
	
}
