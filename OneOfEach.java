
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int amountOfChilds = 0;
		boolean boy = true;
		boolean notSame = true;
		String genders = "";
		
		double gen1 = Math.random();
			if (gen1 > 0.5){
				genders += "b ";	
				amountOfChilds++;
				while(notSame){
					double gen2 = Math.random();
					if (gen2 > 0.5){
						genders += "b ";
						amountOfChilds++;
					}
					else{
						genders += "g ";
						amountOfChilds++;
						notSame = false;
					}
				}
			}
			else {
				genders += "g ";
				amountOfChilds++;
				while(notSame){
					double gen2 = Math.random();
					if (gen2 < 0.5){
						genders += "g ";
						amountOfChilds++;
					}
					else{
						genders += "b ";
						amountOfChilds++;
						notSame = false;
					}
				}
			}			
		System.out.println(genders);
		System.out.println("You made it... and you now have " + amountOfChilds + " children.");
	}
}
