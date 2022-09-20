package org.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {

	public void maps() {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Ashwin", 1);
		map.put("Prasath", 2);
		map.put("Ashwin Prasath", 3);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> e: entrySet) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		System.out.println(map);

	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.setId(1);
		s.setName("Ashwin");
		s.setMobNo(8220565859l);
		
		Sample s1 = new Sample();
		s1.setId(2);
		s1.setName("Prasath");
		s1.setMobNo(8220565758l);
		
		Sample s2 = new Sample();
		s2.setId(3);
		s2.setName("Ashwin Prasath");
		s2.setMobNo(8220565855l);
		
		Id i1 = new Id();
		i1.setId(1);
		
		Id i2 = new Id();
		i2.setId(2);
		
		Id i3 = new Id();
		i3.setId(3);
		
		Map<Id, Sample> map = new LinkedHashMap<Id, Sample>();
		map.put(i1, s);
		map.put(i2, s1);
		map.put(i3, s2);
		
		Set<Entry<Id, Sample>> entryset = map.entrySet();
		for (Entry<Id, Sample> entry : entryset) {
			System.out.println(entry.getValue().getId()+ " "+ entry.getValue().getName()+" "+entry.getValue().getMobNo());
		}
	}
}
