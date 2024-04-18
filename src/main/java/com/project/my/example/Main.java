package com.project.my.example;

import tech.tablesaw.api.Table;

public class Main {

	public static void main(String args[]) {

		Table table = Table.create("Hello World");

		// We changed the table.toString() method to return twice the output, see
		// Relation.java
		System.out.println(table.toString());

	}

}