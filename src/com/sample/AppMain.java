package com.sample;

public class AppMain {

	public static void main(String[] args) {
		String word = "Hello Java";
		WordDecorate deco = new WordDecorate();
		deco.decorate(word);
		String addword = deco.addWord(word);
		System.out.println(addword);

		WordDecorate2 deco2 = new WordDecorate2();
		deco2.decorate(word);
		String addword2 = deco2.addWord(word);
		System.out.println(addword2);

		String word2 = "～";
		deco.decorate2(word,word2);

		WordDecorate3 deco3 = new WordDecorate3(word2);
		deco3.decorate(word);


	}
}
