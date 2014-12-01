package com.github.thatnerdjack.interfaceswork;//
//  com.github.thatnerdjack.interfaceswork.OurInteger.java
//  com.github.thatnerdjack.interfaceswork.InterfacesWork
//
//  Created by Michael Malone on 2/9/06.
//  Copyright 2006 __MyCompanyName__. All rights reserved.
//

abstract public class OurInteger {
	Integer myInteger;
	
	public OurInteger(int n) {
		myInteger = new Integer(n);
	}
	
	public String toString() {
		return myInteger.toString();
	}
}
