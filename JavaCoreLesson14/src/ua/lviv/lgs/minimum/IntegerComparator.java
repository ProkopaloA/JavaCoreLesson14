package ua.lviv.lgs.minimum;

import java.util.Comparator;

public class IntegerComparator implements Comparator<ArbitraryClass> {

	@Override
	public int compare(ArbitraryClass o1, ArbitraryClass o2) {
		if (o1.getInteger() > o2.getInteger()) {
			return 1;
		} else if (o1.getInteger() < o2.getInteger()) {
			return -1;
		}
		return 0;
	}
	

}
