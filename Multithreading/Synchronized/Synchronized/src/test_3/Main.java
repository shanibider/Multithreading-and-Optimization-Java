package test_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        
		Geek gk = new Geek(); 
        List<String> list = new ArrayList<String>(); 
        
        gk.geekName("Steven", list); 
        System.out.println(gk.name); // Steven.
        gk.geekName("Omer", list);
        System.out.println(gk.name); // Omer.
        gk.geekName("Romi", list);
        gk.geekName("Klopp", list);
        System.out.println(gk.name);  // Klopp.
        
        // List of names.
        for (String string : list) {
			System.out.print(string + "...");
		}
        
        System.out.println("\nNumber of Threds: " + gk.count);

	}

}
