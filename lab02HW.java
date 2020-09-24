public class lab02HW{	
	public static void main(String[] a){
		long maxiValue = Long.parseLong(a[0]);
		if (a.length < 2){
			System.err.println("Please provide me with at least two parameters: TRY AGAIN!");
			System.exit(1);
		}
		for(int i=0;i<a.length;i++)
		{
			if(Long.parseLong(a[i]) >= maxiValue)
			{
				maxiValue = Long.parseLong(a[i]);
			
			}
		}
		System.out.println("Max Value is " + maxiValue);
	}
}