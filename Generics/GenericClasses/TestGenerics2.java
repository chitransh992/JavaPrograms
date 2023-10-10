package GenericClasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class TestGenerics2{
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(1,"Vijay");
        mp.put(2,"Sunil");
        mp.put(3,"Ramesh");

        Set<Map.Entry<Integer,String>> set = mp.entrySet();

        Iterator<Map.Entry<Integer,String>> itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry entry = itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}