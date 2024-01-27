/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int i = 1;
		int j = 1;
		boolean needSpace = true;
		
		while(i <= size){
			while (j <= size){
				/*if(j == size)
					System.out.print("*");
				else*/
					System.out.print("* ");
				j++;
				
			}
			if(i==size)
				break;
			else
				System.out.println();
			i++;
			j = 1;
			if (needSpace){
				System.out.print(" ");
				needSpace = false;
			}
			else
				needSpace = true;
				
			
		}
		
	}
}
