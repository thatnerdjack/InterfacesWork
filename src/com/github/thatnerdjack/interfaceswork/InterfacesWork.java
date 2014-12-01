package com.github.thatnerdjack.interfaceswork;//
//  com.github.thatnerdjack.interfaceswork.InterfacesWork.java
//  com.github.thatnerdjack.interfaceswork.InterfacesWork
//
//  Created by Michael Malone on 2/9/06.
//  Copyright (c) 2006 __MyCompanyName__. All rights reserved.
//

import java.util.Arrays;

public class InterfacesWork {
	

	static void printArray(Object[] theArray) {
		for (Object obj : theArray)
			System.out.print(obj + " ");
		System.out.println();
	}
	
	static void populateWithBars(Object[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			theArray[i] = new Bar((int) (Math.random() * 100));
		}
	}
	

    public static void main (String args[]) {
		Object[] testArray = new Bar[10];
		populateWithBars(testArray);
		System.out.println("Unsorted");
		printArray(testArray);		
		
		// WOULD LIKE TO DO THIS
		Arrays.sort(testArray);
		System.out.println("Sorted");
		printArray(testArray);
    }
}
