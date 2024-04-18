package com.project.my.other;

import tech.tablesaw.api.Table;

public class Other {

	public static void doSth() {

		Table table = Table.create("Hello World");

		// We changed the table.toString() method to return twice the output, see
		// Relation.java
		System.out.println(table.toString());

	}

}