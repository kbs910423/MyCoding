package SangGeunTrip;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 int T = Integer.parseInt(in.readLine());
		 
		 for(int i=0; i<T; i++){
			 String ve = in.readLine();
			 StringTokenizer VE = new StringTokenizer(ve);
			 int v = Integer.parseInt(VE.nextToken());
			 int e = Integer.parseInt(VE.nextToken());
			 int[][] graph = new int[v+1][v+1];
			 for(int j=0; j<e; j++){
				String ved = in.readLine();
				StringTokenizer abc = new StringTokenizer(ved);
				int a = Integer.parseInt(abc.nextToken());
				int b = Integer.parseInt(abc.nextToken());
				graph[a][b] = 1; 
				graph[b][a] = 1;
			}
			 System.out.println(v-1);
		 }
			 
	}
}

