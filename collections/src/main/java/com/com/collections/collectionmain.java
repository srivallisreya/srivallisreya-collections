package com.com.collections;
import java.util.*;


public class collectionmain {
	public static void main(String args[]) {
		int i;
		boolean flag=true;
		ArrayList l=new ArrayList();
		l.add(new String("Sreya"));
		l.add(new String("Sarath"));
		l.add(new String("Ashok"));
		l.add(new String("Srinivas"));
		l.add(new String("Pradhyu"));
		
		l.add(new String("India"));
		l.add(new String("America"));
		l.add(new String("England"));
		l.add(new String("China"));
		l.add(new String("Japan"));
		for(i=0;i<l.l_size;i++) {
			System.out.print(l.get_value(i)+" ");
		}
		System.out.println();
		
		Scanner scan=new Scanner(System.in);
		String item;
		int ch,pos;
		
		
		
		while(flag) {
		System.out.println("\n\tMenu\n 1.Insert \n 2.Delete\n 3.value at specific index");
		System.out.println("Enter your choice");
		ch=scan.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter item to be inserted");
			item=scan.next();
			l.add(new String(item));
			for(i=0;i<l.l_size;i++) {
				System.out.print(l.get_value(i)+" ");
			}
			break;
		case 2:
			System.out.println("deleting an element");
			System.out.println("Enter the index to be deleted");
			pos=scan.nextInt();
			System.out.println(l.delete(pos));
			for(i=0;i<l.l_size;i++) {
				System.out.print(l.get_value(i)+" ");
			}
			break;
			
		case 3:
			System.out.println("Enter the position of index");
			pos=scan.nextInt();
			System.out.println("Element at specified position is : "+l.get_value(pos));
			break;
		default:
			System.out.println("Exit");
			flag=false;
		}
		
			
			
			
		}
		
		
		
		
		scan.close();
		
	}

}
