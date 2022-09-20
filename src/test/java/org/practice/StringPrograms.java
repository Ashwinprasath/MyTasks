package org.practice;

import java.util.LinkedHashSet;

public class StringPrograms {

	public void ifStringHasRepeatedCharacterThenReverseTheString() {

		String s = "Tester";
		int count;
		String s1 = "";

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			count = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j])
					count++;
			}
			if (count > 1) {
				for (int j1 = s.length() - 1; j1 >= 0; j1--) {
					s1 = s1 + s.charAt(j1);
				}
			}
		}
		System.out.println(s1);
	}

	public void printDuplicateCharactersInString() {

		String s = "Great responsibility";
		int count;
		char[] strChar = s.toCharArray();
		for (int i = 0; i < strChar.length; i++) {
			count = 1;
			for (int j = i + 1; j < strChar.length; j++) {
				if (strChar[i] == strChar[j] && strChar[i] != ' ') {
					count++;
					strChar[j] = '0';
				}
			}
			if (count > 1 && strChar[i] != '0')
				System.out.println(strChar[i]);
		}
	}

	public void printWithoutDuplicateCharctersInString() {
		String s = "Great responsibility";
		StringBuilder sb = new StringBuilder();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i< s.length(); i++) {
			set.add( s.charAt(i));
		}
		for(Character c: set) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		StringPrograms s = new StringPrograms();
		s.ifStringHasRepeatedCharacterThenReverseTheString();
		s.printDuplicateCharactersInString();
		s.printWithoutDuplicateCharctersInString();
	}
}
