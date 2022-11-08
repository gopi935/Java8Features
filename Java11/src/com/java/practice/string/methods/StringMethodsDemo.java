package com.java.practice.string.methods;

import java.util.stream.Stream;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String message = "This is a program to demonstrate new java string methods \nthanks";

		// Blank Method
		System.out.println(message.isBlank());
		// Lines
		Stream<String> lines = message.lines();
		lines.forEach(line -> System.out.println(line));
		String messageForStrip = " Hello World ";
		// Strip
		System.out.println(messageForStrip.strip());
		// StripLeading
		System.out.println(messageForStrip.stripLeading());
		// StripTrailing
		System.out.println(messageForStrip.stripTrailing());
		// repeat
		System.out.println(messageForStrip.repeat(2));
	}

}
