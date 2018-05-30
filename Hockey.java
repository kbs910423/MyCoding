package Hockey;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Hockey {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String whxyp = in.readLine();
		StringTokenizer st = new StringTokenizer(whxyp);
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int count=0;
		int r=h/2;
		
		for(int i=0; i<p; i++){
			String x1y1 = in.readLine();
			StringTokenizer xy = new StringTokenizer(x1y1);
			int px = Integer.parseInt(xy.nextToken());
			int py = Integer.parseInt(xy.nextToken());
			
			if(px>=x && px<=(x+w) && y<=py && (y+h)>=py)
				count++;
			else if(px<=x && py<=(y+h)){
				double x1 = Math.pow((px-x), 2);
				double x2 = Math.pow((py-(y+r)), 2);
				if((x1+x2)<=(r*r))
					count++;
				else
					continue;
			}
			else if(px>=(x+w) && py<=(y+h)){
				double x1 = Math.pow((px-(x+w)), 2);
				double x2 = Math.pow((py-(y+r)), 2);
				if((x1+x2)<=(r*r))
					count++;
				else
					continue;
			}
			else
				continue;
		}
		System.out.println(count);
	}

}
