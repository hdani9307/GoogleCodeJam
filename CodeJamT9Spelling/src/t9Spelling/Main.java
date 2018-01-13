package t9Spelling;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("resource")
			BufferedReader be = new BufferedReader(new FileReader("be.txt"));
			
			BufferedWriter ki = new BufferedWriter(new FileWriter("ki.txt"));
			
			String[] id = {"0","2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
			String[] charSet = {" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
			String tmp = null;
			char tmp1;
			int prev = -1;
			int caseNum = Integer.parseInt(be.readLine());
			int caseCounter = 1;
			
			for(int i = 0; i < caseNum; i++){
				tmp = be.readLine();					//egy sor beolvasasa
				prev = -1;
				ki.write("Case #" + caseCounter + ": "); //Case kiiratas
				for(int j = 0; j < tmp.length(); j++){	//beolvasas vegigjarasa
					tmp1 = tmp.charAt(j);				//betukre szetszedes
					for(int k = 0; k <= 26; k++){		//betunek megfelelo szam megkeresese
						if(Character.toString(tmp1).equals(charSet[k])){ 	//talalat eseten kiiratja
							if(id[k].charAt(0) == prev){
								ki.write(" " + id[k]);
								prev = id[k].charAt(0);
							}else{
								ki.write(id[k]);
								prev = id[k].charAt(0);
							}
						}
					}
				}
				ki.write("\n");
				caseCounter++;
			}
			ki.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}