package ctci.arrayAndString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hashtable extends AbstractClass{

	class KeyValuePair {
	
		Integer key;
		Integer value;
		
		public KeyValuePair(Integer k, Integer v) {
			this.key = k;
			this.value = v;
		}
		public Integer getKey() {
			return this.key;
		}
		
		public Integer getValue() {
			return this.value;
		}
	}
	
	private Object [] values;
	private int capacity;
	
	private int hash (Integer key){
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public Hashtable(int cap) {
		this.capacity = cap;
		this.values = new Object[this.capacity];
	}
	
	public void add(Integer key,Integer value) throws Exception{
		
		if(key == null || value == null) 
			throw new Exception("key and value cannot be null .");
		
		int index = hash(key);
		List<KeyValuePair> list = (List<KeyValuePair>)values[index];
		KeyValuePair kvp = new KeyValuePair(key, value);
		
		if(list == null ) {
			list = new ArrayList<KeyValuePair>();
			values[index] = list;
		}
		list.add(kvp);
	}
	
	public Integer getValue(Integer key) {
		List<KeyValuePair> list = (List<KeyValuePair>)values[hash(key)];
		 if(list != null) {
			for (KeyValuePair kvp : list) {
				if(kvp.getKey().equals(key)) return kvp.getValue(); 
			}
		}
		return null;
	}

	public void getCurrentClass(){
		System.out.println("Child Class !!!!");
	};
	
	 /**
     * Test
	 * @throws Exception 
     */
    public static void main(String[] args) throws Exception {

        Hashtable ht = new Hashtable(100);
        
        for (Integer i = 1; i <= 1000; i++) {
            ht.add(i, i);
        }

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            Integer key = random.nextInt(1000);
            System.out.println("ht.get(\"" + key + "\") = " + ht.getValue(key));
        }   
    	
    	ht.getCurrentClass();
    }
}



abstract class AbstractClass {
	
	public void getClassName (){};
	
	public void getCurrentClass(){
		System.out.println("Abstract Class !!!!");
	}
	
	
}
