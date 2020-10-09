package com.capgemini.datastructureshashtable;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenSentenceMapWordsToTheirFrequencyUsingMyLinkedHashMapCheckFrequency() {
		MyLinkedHashMap<String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
		String sentence="Paranoids are not paranoid because they "
				        + "are paranoid but because they keep putting themselves"
				        + " deliberately into paranoid avoidable situations";
		String[] words=sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer count=myLinkedHashMap.get(word);
			
			if(count==null)
				count=1;
			else count=count+1;
			myLinkedHashMap.add(word, count);
		}
		int frequency=myLinkedHashMap.get("paranoid");
		assertTrue(frequency==3);
	}

}
