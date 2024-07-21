package com.jopt;

import joptsimple.OptionParser;
import joptsimple.OptionSet;


class LongOptionTest{
	public static void main(String[] args){
		System.out.println("Hello");
		new LongOptionTest().acceptsLongOptions();
	}

	public void acceptsLongOptions(){
		OptionParser parser = new OptionParser();
		parser.accepts("flag");

		OptionSet options = parser.parse("--flag");

	}
}

