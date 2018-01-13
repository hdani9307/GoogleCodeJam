package com.ReverseWords;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

public static void main(String[] args){
		try {
			
			@SuppressWarnings("resource")
			BufferedReader be = new BufferedReader(new FileReader("be.txt"));
			
			BufferedWriter ki = new BufferedWriter(new FileWriter("ki.txt"));
			
			int caseNum = Integer.parseInt(be.readLine());
			int caseCounter = 1;
			String tmp = null;
			String[] parts = null;
			
			for(int i = 0; i < caseNum; i++){
				tmp = be.readLine();
				parts = tmp.split(" ");
				if(parts.length != 1){
					ki.write("Case #" + caseCounter + ": ");
					for(int j = parts.length - 1; j >= 0; j--){
						ki.write(parts[j] + " ");
					}
					ki.write("\n");
					caseCounter++;
				}else{
						ki.write("Case #" + caseCounter + ": " + tmp + "\n");
						caseCounter++;
				}
			}
			ki.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
