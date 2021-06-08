package ua.lviv.lgs.minimum;

public class ArbitraryClass implements Comparable<ArbitraryClass>  {
private String string;
private int integer;
public ArbitraryClass(String string, int integer) {
	super();
	this.string = string;
	this.integer = integer;
}
public String getString() {
	return string;
}
public void setString(String string) {
	this.string = string;
}
public int getInteger() {
	return integer;
}
public void setInteger(int integer) {
	this.integer = integer;
}
@Override
public String toString() {
	return "ArbitraryClass [string=" + string + ", integer=" + integer + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + integer;
	result = prime * result + ((string == null) ? 0 : string.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ArbitraryClass other = (ArbitraryClass) obj;
	if (integer != other.integer)
		return false;
	if (string == null) {
		if (other.string != null)
			return false;
	} else if (!string.equals(other.string))
		return false;
	return true;
}
@Override
public int compareTo(ArbitraryClass o) {
	
	return this.string.compareTo(o.getString());
}

}
