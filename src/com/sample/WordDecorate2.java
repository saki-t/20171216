package com.sample;

public class WordDecorate2 {
	public void decorate(String word) {
		System.out.println("+" + word + "+");
	}
	public String addWord(String word) {
		String str = null;
		str = word + word + word + word;
		return str;

	}

}
