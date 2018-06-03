package Robot;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int state=2,x=0,y=0;
		
		int M = keyboard.nextInt();
		int n = keyboard.nextInt();		
		String gar = keyboard.nextLine();
		
		for(int i =0; i<n; i++){
			String order = keyboard.nextLine();
			int move = Integer.parseInt(order.substring(5));
			order = order.substring(0,4);
			
			if(order.equalsIgnoreCase("TURN")==true)
			{
				if(move == 0)
				{
					state--;
					if(state == -1)
						state =3;
				}
				else if(move == 1){					
					state++;
					if(state == 4)
						state =0;
				}
			}
			else
			{
				switch(state){
				case 0:
					x = x-move;
					break;
				case 1:
					y = y+move;
					break;
				case 2:
					x = x+move;
					break;
				case 3:
					y = y-move;
					break;
				}
				if(x < 0 || y < 0){
					System.out.println("-1");
					System.exit(1);
				}
				if(x>=M || y>=M){
					System.out.println("-1");
					System.exit(1);
				}
			}
		}	
		System.out.println(x+" "+y);
	}
}
