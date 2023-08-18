package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PostalService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    HashMap<Integer, String> ZipCodes = new HashMap();
    
    public void cargarDiez(){
        ZipCodes.put(99817, "Eisenach");
        ZipCodes.put(76824, "Pantanal");
        ZipCodes.put(1828, "Banfield");
        ZipCodes.put(10602, "Ararat");
        ZipCodes.put(99817, "Eisenach");
        ZipCodes.put(92, "Dingle");
        ZipCodes.put(80121, "Napoli");
        ZipCodes.put(96344, "Chernove");
        ZipCodes.put(94130, "Panare");
        ZipCodes.put(99817, "Eisenach");
    }
    
    public void showZip(){
        for (Map.Entry<Integer, String> entry : ZipCodes.entrySet()) {
            System.out.println("Zip Code: " + entry.getKey() + " / City: " + entry.getValue());
        }
    }
    
}
