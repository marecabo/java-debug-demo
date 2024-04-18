package com.project.my.example;

import tech.tablesaw.api.Table;

public class Main {

	public static void main(String args[]) {

		Table table = Table.create("Hello World");
		System.out.println(table.toString());

	}

}