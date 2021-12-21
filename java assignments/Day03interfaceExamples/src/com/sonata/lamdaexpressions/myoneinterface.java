package com.sonata.lamdaexpressions;
@FunctionalInterface
public interface myoneinterface {
	void display();
	default void showone() {System.out.println("show this");}

}
