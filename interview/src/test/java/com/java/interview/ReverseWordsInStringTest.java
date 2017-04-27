package com.java.interview;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInStringTest {
	
	@Test
	public void testReverseWord() {
		String input = "i am sonali";
		String response = ReverseWordsInString.reverseWords(input);
		System.out.println(response);
		Assert.assertEquals("sonali am i", response);
	}
	
	@Test
	public void testReverseWordsForNull() {
		String input = "This is a Test String";
		String response = ReverseWordsInString.reverseWords(null);
		Assert.assertEquals(null, response);
	}
	
	@Test
	public void testReverseWordsForEmpty() {
		String input = "";
		String response = ReverseWordsInString.reverseWords(input);
		Assert.assertEquals(null, response);
	}
}
