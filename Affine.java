package AffinCipher;
import java.util.*;
import java.io.*;

public class Affine {

	public static void main(String[] args) throws IOException {
		/*Scanner scan = new Scanner(System.in);
		int T,a,b;
		T=scan.nextInt();
		for(int j=0; j<T; j++){	
		a=scan.nextInt();
		 b=scan.nextInt();
		 String gar = scan.nextLine();
		*/ 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(in.readLine());
		
		for(int j=0; j<T; j++){
			String ab = in.readLine();
			StringTokenizer st = new StringTokenizer(ab);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String str = in.readLine();
			
			
			for(int i=0; i<str.length(); i++){
				int result=0;
				int x= str.charAt(i);
	
				result = (a*(x-65)+b)%26 +65;
			
				out.append((char)result);
		}
			out.append('\n');
	 }
		out.flush();
		out.close();
	}
}

