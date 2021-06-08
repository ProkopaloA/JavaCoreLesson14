package ua.lviv.lgs.maximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Shelf {
	ArrayList<Commodity> ArrCommodity = new ArrayList<Commodity>();

	public void addCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the commodity name");
		String name = scanner.next();

		scanner = new Scanner(System.in);
		System.out.println("Enter the weight of the commodity");
		int weight = scanner.nextInt();

		scanner = new Scanner(System.in);
		System.out.println("Enter the width of the commodity");
		int width = scanner.nextInt();

		scanner = new Scanner(System.in);
		System.out.println("Enter the length of the commodity");
		int length = scanner.nextInt();

		Commodity commodity = new Commodity(name, length, width, weight);
		ArrCommodity.add(commodity);
		System.out.println("Commodity " + commodity.toString() + " successfully added!");
	}

	public void removeCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the commodity name");
		String name = scanner.next();

		Iterator<Commodity> iterator = ArrCommodity.iterator();
		while (iterator.hasNext()) {
			Commodity nextCommodity = iterator.next();
			if (nextCommodity.getName().equalsIgnoreCase(name)) {
				iterator.remove();
				System.out.println("Commodity " + nextCommodity + " succssesfuly removed!");
			} else {
				System.out.println("Such commodity" + name + " does not exist");
			}
		}
	}
	public void replaceCommodity() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the commodity name");
		String name = scanner.next();
		for (Commodity commodity : ArrCommodity) {
			if (commodity.getName().equalsIgnoreCase(name)) {
				scanner = new Scanner(System.in);
				System.out.println("Enter the commodity name");
				String newName = scanner.next();

				scanner = new Scanner(System.in);
				System.out.println("Enter the weight of the commodity");
				int newWeight = scanner.nextInt();

				scanner = new Scanner(System.in);
				System.out.println("Enter the width of the commodity");
				int newWidth = scanner.nextInt();

				scanner = new Scanner(System.in);
				System.out.println("Enter the length of the commodity");
				int newLength = scanner.nextInt();
				
				commodity.setName(newName);
				commodity.setLength(newLength);
				commodity.setWeight(newWeight);
				commodity.setWidth(newWidth);
				
				System.out.println("The commodity with name " + name + " successfuly replace by " + commodity.toString());
			} else {
				System.out.println("Such commodity" + name + " does not exist");
			}
			
		}
	}
	public void sortByName() {
		System.out.println("Without sorting:");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
		Collections.sort(ArrCommodity, new NameComparator());
		System.out.println();
		System.out.println("After sorting by name");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
	}
	public void sortByLength() {
		System.out.println("Without sorting:");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
		Collections.sort(ArrCommodity, new LengthComparator());
		System.out.println();
		System.out.println("After sorting by length");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
	}
	public void sortByWeight() {
		System.out.println("Without sorting:");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
		Collections.sort(ArrCommodity, new WeightComparator());
		System.out.println();
		System.out.println("After sorting by weight");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
	}
	public void sortByWidth() {
		System.out.println("Without sorting:");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
		Collections.sort(ArrCommodity, new WidthComparator());
		System.out.println();
		System.out.println("After sorting by width");
		for (Commodity commodity : ArrCommodity) {
			System.out.println(commodity);			
		}
	}
	public void getCommodity() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the commodity number");
		int i = scanner.nextInt();
		if(i<0||i>ArrCommodity.size()-1) {
			System.out.println("There is no commodity for this number" + i);
		} else {
			System.out.println("The commodity under this number"+i+"this product: " +ArrCommodity.get(i).toString());
		}
	}
	
}
