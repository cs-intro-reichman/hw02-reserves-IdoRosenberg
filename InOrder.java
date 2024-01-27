/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int rand = (int) (Math.random()*10);
		boolean isBigger = true;
		System.out.print(rand + " ");
		while(isBigger){
			int rand1 = (int) (Math.random()*10);
			if(rand1 >= rand){
				rand = rand1;
				System.out.print(rand + " ");
			}
			else
				isBigger = false;
			
		}
		
	}
}
