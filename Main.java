package Execricise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//input process
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		 BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 	String VE = in.readLine();
		 	StringTokenizer st = new StringTokenizer(VE); 
		 	int v = Integer.parseInt(st.nextToken()); 
			int E = Integer.parseInt(st.nextToken()); 
			
			//token
			int[][] graph = new int[v+1][v+1];
			for(int i=0; i<E; i++){
				String ved = in.readLine();
				StringTokenizer abc = new StringTokenizer(ved);
				int a = Integer.parseInt(abc.nextToken());
				int b = Integer.parseInt(abc.nextToken());
				int c = Integer.parseInt(abc.nextToken());		
				graph[a][b] = c;
				//if(i==0)
					//min=graph[a][b];
			}
			int[][] dist = new int[v+1][v+1];
			
			//graph를 dist로 옮기는 과정
			for(int i=0; i<v+1; i++){
				for(int j=0; j<v+1; j++){
					dist[i][j] = graph[i][j];	
					if(dist[i][j]==0)
						dist[i][j]=-1;
					//System.out.print(dist[i][j]);
					}
				//System.out.println(" ");
			}
			//시작 flod & washall?
			for(int i=0; i<v+1; i++){//거처가는 vertex
				for(int x=0; x<v+1; x++){//출발하는 시작점
					for(int y=0; y<v+1; y++){//끝나는 vertex
						if(dist[x][i] == -1 || dist[i][y] ==-1  || dist[x][y] == -1)
							continue;
						if(dist[x][i] + dist[i][y] < dist[x][y])
							dist[x][y] = dist[x][i]+dist[i][y];
					}
				}
			}			
			int visit=0;
			int min=0;
			for(int i=0; i<v+1; i++){
				for(int j=0; j<v+1; j++){
					if((dist[i][j] >= 0) && (dist[j][i] >= 0)){
						if(visit==0){//miniumum value initialize
							min=dist[i][j]+dist[j][i];
							visit++;
						}
						if((dist[i][j] + dist[j][i]) < min)
							min = dist[i][j] + dist[j][i];
					}
				
				}
			}
			if(min==0)
				System.out.println("-1");
			
			else
				System.out.println(min);
	}

}
