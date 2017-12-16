package com.sample;

public class WordDecorate3 {
	//クラス変数
	private String addnumber = null;

public WordDecorate3(String word){
	addnumber = word;
	System.out.println(word);
}
	public void decorate(String center) {
		System.out.println(addnumber + center + addnumber);

	}
}
