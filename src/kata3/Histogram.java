package Kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Histogram<T> {
    private final Map map = new HashMap<T,Integer>() ;  
    
    
    public Integer get(T clave){
        return (Integer)map.get(clave);

    }

    public Set<T> keySet(){
        return map.keySet();
    }


    public void increment(T key){
        map.put(key, map.containsKey(key) ? (Integer)map.get(key) +1 : 1);
    }
}
