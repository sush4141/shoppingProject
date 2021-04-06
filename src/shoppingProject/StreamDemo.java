package shoppingProject;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Collectors;
import java.util.*;

public class StreamDemo {

	public static void main(String[] args) {

		Product Book = new Product("Book",500);
		Product Pen = new Product("Pen",30);
		Product Canvas = new Product("Canvas",400);
		Product Notebook = new Product("Notebook",300);
		Product Colour = new Product("WaterColour",450);
		Product Ruler = new Product("Ruler",20);
		Product Eraser = new Product("Eraser",10);
		Product Pencil = new Product("Pencil",15);
		
		List<Product> ProductList = new ArrayList<Product>();
		
		ProductList.add(Book);
		ProductList.add(Pen);
		ProductList.add(Canvas);
		ProductList.add(Notebook);
		ProductList.add(Colour);
		ProductList.add(Ruler);
		ProductList.add(Eraser);
		ProductList.add(Pencil);
		
		ProductList.forEach(System.out::println);
		
		System.out.println();
		List<Product>SortedList = ProductList.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
		SortedList.forEach(System.out::println);
		System.out.println();
		List<Product>nameList = ProductList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
		nameList.forEach(System.out::println);
	}

}
