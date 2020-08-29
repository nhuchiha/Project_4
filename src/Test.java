/* Programming Fundamentals
 * Name: Nhu-Chi Ha
 * PROGRAMMING ASSIGNMENT 4
 */
import java.util.Scanner;
public class Test 
{

	public static void main(String[] args)
	{
		// Introduction
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Nhu-Chi Ha");
		System.out.println("PROGRAMMING ASSIGNMENT 4\n");
		
		Scanner scan = new Scanner(System.in);
		// Create Set object
		Set setObject = new Set();
		//Declare input variables and temp Arrays
		String inputCommand = "";
		String[] commandArray = new String[2];		
		
		// Create infinite loop for user input command
		do
		{
			//Validate the second element to be integer
			boolean isInteger = false;
			while(isInteger == false)
			{
				//Prompt user to enter the commands
				System.out.print("Enter command: ");
				inputCommand = scan.nextLine();
				commandArray = inputCommand.split(" "); 
				
				isInteger = validateInteger(commandArray[1]);
				if(isInteger == false)
			        System.out.println("Invalid. Try again"); 
			    else 
			        break;
			}
			// Separate the input Command into two elements
			String command = commandArray[0];
			int data = Integer.parseInt(commandArray[1]);
			// Implement appropriate methods based on different command
			if(command.equalsIgnoreCase("Add"))
			{
				// Avoid duplicate input
				if(setObject.count > 1 && setObject.exists(data))
					System.out.println(setObject.toString());
				else
				{
					setObject.add(data);
					System.out.println(setObject.toString());
				}	
			}
			else if(command.equalsIgnoreCase("Del"))
			{
				setObject.delete(data);
				System.out.println(setObject.toString());
			}
			else if(command.equalsIgnoreCase("Exists"))
			{
				System.out.println(setObject.exists(data));	
			}	
		}
		while(inputCommand != "");
	}
	 public static boolean validateInteger(String s) 
	 {
	    for(int i = 0; i < s.length(); i++)
	    {
	    	if (s==null || s.length()==0) 
	    		return false;
	        else if (!Character.isDigit(s.charAt(i)))
	        	return false;     	
	    }
	    return true; 	
	 }	 
}
