package com.com.collections;

import java.util.*;

public class ArrayList {
	Object[] arraylist;
	int l_size=0;
	
	ArrayList(){
		arraylist=new Object[10];
	}
	
	
	
	void add(Object obj) {
		if(arraylist.length-l_size<=10) {
			update();
		}
		arraylist[l_size++]=obj;
		
	}
	
	void update() {
		arraylist=Arrays.copyOf(arraylist, arraylist.length*2);
		System.out.println();
	}
	
	
	
	Object delete(int pos) {
		if(pos<l_size) {
			Object obj=arraylist[pos];
			arraylist[pos]=null;
			int t=pos;
			while(t<l_size) {
				arraylist[t]=arraylist[t+1];
				arraylist[t+1]=null;
				t+=1;
			}
			l_size-=1;
			return obj;
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	
	Object get_value(int pos) {
		if(pos<=l_size) {
			//System.out.println("Element at specified index : "+arraylist[pos]);
			return arraylist[pos];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	
	

}
