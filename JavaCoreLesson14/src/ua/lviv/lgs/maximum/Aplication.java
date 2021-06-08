package ua.lviv.lgs.maximum;

import java.util.Scanner;

public class Aplication {
	public static void menu() {
		System.out.println("Enter 1 to add the item");
		System.out.println("Enter 2 to delete the item");
		System.out.println("Enter 3 to replace the item");
		System.out.println("Enter 4 to sort by name");
		System.out.println("Enter 5 to sort by length");
		System.out.println("Enter 6 to sort by width");
		System.out.println("Enter 7 to sort by weight");
		System.out.println("Enter 8 to display the i-th element of the collection");
		System.out.println("Enter 9 to exit the program");
	}

	public static void main(String[] args) {
		Shelf shelf = new Shelf();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			menu();
			switch(scanner.nextInt()) {
			case 1:{
				shelf.addCommodity();
				break;
			}
			case 2:{
				shelf.removeCommodity();
				break;
			}
			case 3:{
				shelf.replaceCommodity();
				break;
			}
			case 4:{
				shelf.sortByName();
				break;
			}
			case 5:{
				shelf.sortByLength();
				break;
			}
			case 6:{
				shelf.sortByWidth();
				break;
			}
			case 7:{
				shelf.sortByWeight();
				break;
			}
			case 8:{
				shelf.getCommodity();;
				break;
			}
			case 9:{
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Please enter a number from 1 to 9! ");
			}
			
			}
		}

	}

}
