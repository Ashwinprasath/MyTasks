package org.practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Task3 {

	public void occurence() {
		String s= "aaaabbbcc";
		LinkedHashMap<Character, Integer> lm = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (lm.containsKey(c)) {
				Integer integer = lm.get(c);
				lm.put(c, integer+1);
			}else {
				lm.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = lm.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
	public static void main(String[] args) {
		Task3 t = new Task3();
		t.occurence();
	}
}
