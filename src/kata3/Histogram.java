package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <T> {
    Map<T,Integer> map = new HashMap<>();
    public Integer get(T key){
        return map.get(key);
    }
    public  Set<T> keySet(){
        return map.keySet();
    }
    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key)+1 : 1);
    }
    /**private final T [] data;
    public Histogram(T[] data) {
        this.data = data;
    }  
    public T[] getData() {
        return data;
    }
    public Map<T,Integer> getHistogram(){
        Map<T,Integer> histogram = new HashMap<>();
        for (T value : data) {
            histogram.put(value, histogram.containsKey(value) ?
                histogram.get(value) +1 : 1);
        }
        return histogram;
    }*/
    
}
