/* Programming Fundamentals
 * Name: Nhu-Chi Ha
 * PROGRAMMING ASSIGNMENT 4
 * Used LinkedNode from AdditionalExample as reference
 */

public class LinkedNode 
{
	int x;            // The data value
	LinkedNode next;  // Reference to the next LinkedNode
	
	LinkedNode() 
	{
		next = null;
	}
	// Constructor that initializes the data value
	LinkedNode(int x) 
	{
		this.x = x;
	}
}
