/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int i = 0;
		int j = 0;
		boolean needSpace = true;
		
		while(i < size){
			while (j < size){
				if(j == (size-1))
					System.out.print("*");
				else
					System.out.print("* ");
				j++;
				
			}
			System.out.println();
			i++;
			j = 0;
			if (needSpace){
				System.out.print(" ");
				needSpace = false;
			}
			else
				needSpace = true;
				
			
		}
		
	}
}
