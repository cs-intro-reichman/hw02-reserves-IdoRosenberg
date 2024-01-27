/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sumDivisors = 0;
		
		//Sums up all of the divisors
		for(int i=1; i<num; i++){
			if(num % i == 0){
				sumDivisors +=i;
			}
		}
		
		if (sumDivisors == num){
			String fin = num + " is a perfect number since " + num + " = "; 
			
				for(int i=1; i<num; i++){
					if(num % i == 0){
						
						/* This if is a graphic one, because the biggest and last divisor is num/2,
							so we dont need to add "+" to fin after him */
							
						if(num/2 == i)
						fin += i;	
						else
						fin += i + " + ";
					}
				}
				System.out.println(fin);
		}
		else
			System.out.println(num + " is not a perfect number");	
	}
}
