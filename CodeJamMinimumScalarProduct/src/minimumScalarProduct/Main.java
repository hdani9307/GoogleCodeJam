package minimumScalarProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	//https://code.google.com/codejam/contest/32016/dashboard#s=p0&a=0

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new FileReader("A-large-practice.in"));
			BufferedWriter output = new BufferedWriter(new FileWriter("out.txt"));
			
			
			int numberOfTestCases = Integer.parseInt(input.readLine());
			List<Long> vectorsA = new ArrayList<Long>();
			List<Long> vectorsB = new ArrayList<Long>();
			
			for(int i = 0; i < numberOfTestCases; i++){
				long scallarProduct =  0;
				int numberOfVectors = Integer.parseInt(input.readLine());
				
				vectorsA = split(input);
				Collections.sort(vectorsA);
				
				vectorsB = split(input);
				Collections.sort(vectorsB);
				Collections.reverse(vectorsB);
				
				for(int k = 0; k < numberOfVectors; k++){
					scallarProduct += vectorsA.get(k) * vectorsB.get(k);
				}
				
				output.write("Case #" + (i+1) + ": "  + scallarProduct + "\n");
			}
		
			
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Long> split(BufferedReader input) throws IOException{
		List<Long> vectors = new ArrayList<Long>();
		StringTokenizer tokenizer = new StringTokenizer(input.readLine(), " ");
		
		while(tokenizer.hasMoreTokens()){
			vectors.add(Long.parseLong(tokenizer.nextToken()));
		}
		
		return vectors;
	}
}