package com.main;

import java.io.*;

public class StoreCredit {

	public static void main(String[] args){
		
		int credit = 0;
		int itemNum = 0;
		int caseCounter = 1;
		String price = null;
		
		try {
			
			BufferedWriter ki = new BufferedWriter(new FileWriter("ki.txt"));
			
			@SuppressWarnings("resource")
			BufferedReader be = new BufferedReader(new FileReader("be.txt"));
			int inputNum = Integer.parseInt(be.readLine());
	
			for(int i = 0; i < inputNum ; i++){
				
				credit = Integer.parseInt(be.readLine());
				itemNum = Integer.parseInt(be.readLine());
				price = be.readLine();
				String[] parts = price.split(" ");
				
					for(int j = 0 ; j < itemNum; j++){
						for(int k = j + 1; k < itemNum; k++){
							if(Integer.parseInt(parts[j]) + Integer.parseInt(parts[k]) == credit){
								ki.write("Case #" + caseCounter + ": " + (j+1) + " " + (k+1)+ "\n");
								caseCounter++;
							}
						}
					}
			}
			ki.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}