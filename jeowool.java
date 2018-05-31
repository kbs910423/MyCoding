package JeoWool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class jeowool {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(in.readLine());
		int[] arr = new int[n];
		int sum=0;
		String ab = in.readLine();
		StringTokenizer st = new StringTokenizer(ab);
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
	}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++){
			if(sum+1<arr[i]){
				break;
			}
			sum=sum+arr[i];
		}
		System.out.println(sum+1);
 }
}
