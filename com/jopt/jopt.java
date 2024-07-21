package com.jopt;

import joptsimple.OptionParser;
import joptsimple.OptionSet;


class LongOptionTest{
	public static void main(String[] args){
		System.out.println("Hello");
		OptionParser parser = new OptionParser();
		parser.accepts("add").withRequiredArg().ofType(String.class).required();
		parser.accepts("path").withRequiredArg().ofType(String.class);


		OptionSet options = parser.parse(args);
		String name = (String)options.valueOf("add");
		String age = (String)options.valueOf("path");
		System.out.println("add" + name);
		System.out.println("path: " + age);
		


	}
}

