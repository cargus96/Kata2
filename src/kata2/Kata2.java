package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        //Integer[] data = {1,1,2,0,0,1,3};
        String[] data = {"Pepe","Pepe","Pepe","Juan","Rosa","Juan","Gustavo"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println("Clave: "+ key + " ==> Valor:" +
                histogr.get(key));
        }
        
    }
}
