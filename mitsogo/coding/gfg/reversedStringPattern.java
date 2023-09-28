class reversedStringPattern
{
	// method declared to print the pattern of
	// the string passed as argument
	public static void reverseString(String str)
	{
		// a temporary string to store the
		// value of each row of pattern
		String r = "";
		int x = 1;
		for (int i = 0 ; i < str.length(); i++)
		{
			// extracting each character and
			// adding it to the string r
			r = r + str.charAt(i);
			if (r.length() == x)
			{
				// loop to print the string r in reverse order
				for(int j = r.length() - 1; j >= 0; j--)
					System.out.print(r.charAt(j) + " ");
				x += 1;
				r = "";
				System.out.println();
			}
		}
		
		// condition checking to add the "*" if required
		if (r.length() < x && r.length() != 0)
		{
			// adding the number of "*" required in r
			for(int k = 1; k <= x - r.length(); k++)
				r = r + "*";
				
			// printing r in reverse order
			for(int j = r.length() - 1; j >= 0; j--)
					System.out.print(r.charAt(j) + " ");
		}
	}

	// Driver Code
	public static void main(String args[])
	{
		// sample string to check the code
		String str = "oranges";
		
		// method calling
		reverseString(str);
	}
}

// https://www.geeksforgeeks.org/program-for-reversed-string-pattern/
