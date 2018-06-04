package WoderingMino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class WoderingMino {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(in.readLine());
		int[][] arr = new int[n][n];
		int[][] graph = new int[n][n];
		int sum=0;
		
		for(int i=0; i<n; i++) {	
			String ab = in.readLine();
			StringTokenizer st = new StringTokenizer(ab);
			for(int j=0; j<n; j++){
					arr[i][j] = Integer.parseInt(st.nextToken());
					graph[i][j] =0;
			}
		}
		for(int i=0; i<n; i++){
			for(int x=0; x<n; x++){
				for(int y=0; y<n; y++){
					if(i==x || x==y || i==y)
						continue;
					if(arr[x][i]+arr[i][y] == arr[x][y]){
						graph[x][y]=1;
					}
					else if(arr[x][i]+arr[i][y] < arr[x][y]){
						System.out.println("-1");
						System.exit(0);
					}
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(graph[i][j] ==0)
				sum = sum+arr[i][j];
			}
		}
			System.out.println(sum/2);
	}

}
