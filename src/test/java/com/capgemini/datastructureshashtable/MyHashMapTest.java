package com.capgemini.datastructureshashtable;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void givenSentenceWordsMappedToTheirFrequencyInHashMap() {
		MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
		String sentence="To be or not to be";
		String[] words=sentence.split(" ");
		
		for(String word:words) {
			Integer count=myHashMap.get(word);
			if(count==null)
				count=1;
			else count=count+1;
			myHashMap.add(word, count);		
		}
		
		int frequency=myHashMap.get("be");
		assertTrue(frequency==2);
		
	}

}
