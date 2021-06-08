package ua.lviv.lgs.minimum;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplication {

	public static void main(String[] args) {
		Set<ArbitraryClass> hc = new HashSet<ArbitraryClass>();
		hc.add(new ArbitraryClass("srting0", 5));
		hc.add(new ArbitraryClass("srting1", 4));
		hc.add(new ArbitraryClass("srting2", 3));
		hc.add(new ArbitraryClass("srting3", 2));
		hc.add(new ArbitraryClass("srting4", 1));
		hc.add(new ArbitraryClass("srting0", 1));
		System.out.println("Without sorting (HashSet)");
		for (ArbitraryClass arbitraryClass : hc) {
			System.out.println(arbitraryClass);

		}
		System.out.println();
		Set<ArbitraryClass> lhc = new LinkedHashSet<ArbitraryClass>();
		lhc.add(new ArbitraryClass("srting0", 5));
		lhc.add(new ArbitraryClass("srting1", 4));
		lhc.add(new ArbitraryClass("srting2", 3));
		lhc.add(new ArbitraryClass("srting3", 2));
		lhc.add(new ArbitraryClass("srting4", 1));
		lhc.add(new ArbitraryClass("srting0", 1));
		System.out.println("With sorting by input (LinkedHashSet) ");
		for (ArbitraryClass arbitraryClass : lhc) {
			System.out.println(arbitraryClass);

		}
		System.out.println();
		Set<ArbitraryClass> tc = new TreeSet<ArbitraryClass>();
		tc.add(new ArbitraryClass("srting0", 5));
		tc.add(new ArbitraryClass("srting1", 4));
		tc.add(new ArbitraryClass("srting2", 3));
		tc.add(new ArbitraryClass("srting3", 2));
		tc.add(new ArbitraryClass("srting4", 1));
		tc.add(new ArbitraryClass("srting0", 1));
		System.out.println("With sorting (TreeSet)  Comparable by name ");
		for (ArbitraryClass arbitraryClass : tc) {
			System.out.println(arbitraryClass);

		}
		System.out.println();
		Set<ArbitraryClass> tc1 = new TreeSet<ArbitraryClass>(new IntegerComparator());
		tc1.add(new ArbitraryClass("srting0", 5));
		tc1.add(new ArbitraryClass("srting1", 4));
		tc1.add(new ArbitraryClass("srting2", 3));
		tc1.add(new ArbitraryClass("srting3", 2));
		tc1.add(new ArbitraryClass("srting4", 1));
		tc1.add(new ArbitraryClass("srting0", 1));
		System.out.println("With sorting (TreeSet) Comparator by Integer");
		for (ArbitraryClass arbitraryClass : tc1) {
			System.out.println(arbitraryClass);

		}

	}

}
