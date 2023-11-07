package com.demo.thread;

import com.demo.beans.MyFileSearch;

public class SearchThread extends Thread{
	private String search;
	private MyFileSearch ob;
	private String fname;
	
	public SearchThread(String search, MyFileSearch ob, String fname) {
		super();
		this.search = search;
		this.ob = ob;
		this.fname = fname;
	}

	public void run() {
		boolean ans=ob.searchWord(fname, search);
		if(ans) {
			System.out.println(search+"--->exists" );
		}else {
			System.out.println(search+"---not exists" );
		}
	}

}
