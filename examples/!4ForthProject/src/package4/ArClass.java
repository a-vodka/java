package package4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ArClass {
	
	public static void main(String[] args) throws IOException {
		Client myClient = new Client();
		myClient.number = 1;
		myClient.name = "Vasiliy Ivanovich";
		myClient.salary = 2200;
		myClient.kept = 200;
		myClient.given = myClient.salary - myClient.kept;
		Client myClient2 = new Client();
		myClient2.number = 2;
		myClient2.name = "Vasiliy Petrovich";
		myClient2.salary = 3200;
		myClient2.kept = 200;
		myClient2.given = myClient2.salary - myClient2.kept;
		ArrayList<Client> ArClient = new ArrayList <Client>();
		ArClient.add(myClient);
		ArClient.add(myClient2);
		for (int i=0; i<ArClient.size();i++) {
			System.out.println(ArClient.get(i).number + " " + ArClient.get(i).name + " " + ArClient.get(i).salary+ 
					" " + ArClient.get(i).kept + " " + ArClient.get(i).given);	
		}
		String name; 
		
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 

 	
        /*
        do { 
        name = (String)br.readLine(); // читать символы 
        System.out.println(name);
        }
        while(name != "Exit");*/
        
        int a;
        int b;
        System.out.println("¬ведите a");
        String sA=br.readLine();
        a=Integer.valueOf(sA);
        
        System.out.println("¬ведите b");
        String sB=br.readLine();
        b=Integer.valueOf(sB);
        
        int res = a+b;
        System.out.println("»того "+res);
}
}

