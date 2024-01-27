/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int repeat = Integer.parseInt(args[0]);
		double average = 0.0;
		int famOfTwo = 0;
		int famOfThree = 0;
		int famOfFour = 0;
		
		for (int i=0; i<repeat; i++){
		int amountOfChilds = 0;
		boolean boy = true;
		boolean notSame = true;
		
		double gen1 = Math.random();
			if (gen1 > 0.5){	
				amountOfChilds++;
				while(notSame){
					double gen2 = Math.random();
					if (gen2 > 0.5){
						amountOfChilds++;
					}
					else{
						amountOfChilds++;
						notSame = false;
					}
				}
			}
			else {
				amountOfChilds++;
				while(notSame){
					double gen2 = Math.random();
					if (gen2 < 0.5){
						amountOfChilds++;
					}
					else{
						amountOfChilds++;
						notSame = false;
					}
				}
			}

			average += amountOfChilds;
			
			switch(amountOfChilds){
				case 2:
				famOfTwo++;
				break;
				case 3:
				famOfThree++;
				break;
				case 4:
				famOfFour++;
				break;
				default:
				famOfFour++;
			}	
	}
	
		System.out.println("Average: " + average/repeat + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+famOfTwo);
		System.out.println("Number of families with 3 children: "+famOfThree);
		System.out.println("Number of families with 4 or more children: "+famOfFour);
		
		if (famOfTwo >= famOfThree && famOfTwo >= famOfFour)
			System.out.println("The most common number of children is 2.");
		else if(famOfThree >= famOfFour)
			System.out.println("The most common number of children is 3.");
		else
			System.out.println("The most common number of children is 4 or more.");
	
	}
}
