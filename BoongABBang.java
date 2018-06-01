package BoonABBang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BoongABBang {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(in.readLine());
		int[] arr = new int[n+1];
		arr[0]=0;
		String ab = in.readLine();
		StringTokenizer st = new StringTokenizer(ab);
		for(int i=1; i<n+1; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		int[] max = new int[n+1];
		max[0]=0;
		for(int i=1; i<=n; i++){
			max[i]=0;
			for(int j=1; j<=i; j++){
				max[i]=Math.max(max[i],max[i-j]+arr[j]);
			}
		}
		System.out.println(max[n]);
	}
}
