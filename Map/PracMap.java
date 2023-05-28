package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PracMap {
    public static void main(String[] args)
    {
        Map m = new HashMap();
        m.put(1, "Yash");
        m.put(2,"Mittal");
        m.put(3,"Rohan");
        System.out.println(m);
        System.out.println(m.get(2));

        Set key = m.keySet();
        Iterator itr = key.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            System.out.println(i);
        }

        Collection c = m.values();
        Iterator itr1 = c.iterator();
        while(itr1.hasNext())
        {
            String name = (String)itr1.next();
            System.out.println(name);
        }

        Set EntryData = m.entrySet();
        Iterator itr2 = EntryData.iterator();
        while(itr2.hasNext())
        {
            Map.Entry data = (Entry) itr2.next();
            System.out.println(data.getKey() +" "+data.getValue());
        }

    }
}
