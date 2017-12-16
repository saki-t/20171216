package com.sample;

public class WordDecorate {


	/**
	 *文字の前後にアスタリスクを挿入するよ
	 * @param word
	 */
	public void decorate(String word) {
		System.out.println("*" + word + "*");

	}
	public String addWord(String word) {
		String str = null;
		str = word + word;
		return str;

	}
	public void decorate2(String word,String word2) {
		System.out.println( word2 + word + word2 );

	}


}
