package com.github.thatnerdjack.interfaceswork;//
//  com.github.thatnerdjack.interfaceswork.Foo.java
//  com.github.thatnerdjack.interfaceswork.InterfacesWork
//
//  Created by Michael Malone on 2/16/06.
//  Copyright 2006 __MyCompanyName__. All rights reserved.
//

public class Foo extends OurInteger implements Comparable<Foo>{
	
	public Foo(int n) {
		super(n);
	}

	public int compareTo(Foo o) {
		return (myInteger.intValue() - o.myInteger.intValue());
	}

}
