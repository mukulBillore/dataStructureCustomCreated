package com.bridgeLabs.HashMap;

public class HashMapMainClass {

	public static void main(String[] args) {
	//uc1
		String s = "To Be Or Not To Be";
		String[] words = s.toLowerCase().split(" ");
		MyHashMap<String ,Integer> hashMap1= new MyHashMap<String, Integer>();
		for(String word:words) {
			hashMap1.get(word);
			Integer value = hashMap1.get(word);
			if(value == null)
				value = 1;
			else
				value = value + 1;
			hashMap1.add(word,value);
		}
		int frequency = hashMap1.get("to");
		System.out.println(hashMap1);
	}

}
