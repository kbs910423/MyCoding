package DrunkenSamdBeom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(in.readLine());
		for(int i=0; i<T; i++){
			int N = Integer.parseInt(in.readLine());
			int room[] = new int[N+1];
			Arrays.fill(room,0);
			for(int j=1; j<N+1; j++){
				for(int k=1; k<N+1; k++){
					if((k%j)==0){
						if(room[k]==0)
							room[k]=1;
						else if(room[k]==1)
							room[k]=0;
					}
				}
				
			}
			int count=0;
			for(int j=1;j<N+1;j++){
				if(room[j]==1)
					count++;
			}
			System.out.println(count);
		}

	}

}
