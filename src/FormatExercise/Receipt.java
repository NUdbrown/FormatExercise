package FormatExercise;

import java.util.*;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	private int space = 15;
	private int afterSpace = 5;
	private int format = 10;
	private double anotherFormat = 15.15;
	private double extraFormat = 10.2;
	

	public void printTitle() {
		f.format("%"+-space+"s"+ "%" +afterSpace+ "s" + "%" +format +"s\n", "Item", "Qty", "Price");
		f.format("%"+-space+ "s" + "%" + afterSpace + "s" + "%" + format + "s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format("%" +-anotherFormat + "s" + "%" + afterSpace + "d" +  "%" + extraFormat+ "f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%"+-space+ "s" +  "%" + afterSpace + "s" + "%" +extraFormat + "f\n", "Tax", "", total * 0.06);
		f.format("%"+-space + "s" + "%" + afterSpace + "s" + "%" + format + "s\n", "", "", "-----");
		f.format("%"+-space+"s" + "%"+ afterSpace +"s" +"%"+extraFormat+"f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack’s Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}
