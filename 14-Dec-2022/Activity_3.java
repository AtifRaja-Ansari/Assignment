package collection;
import java.util.*;
public class Activity_3 {
	String counry;
	// creating Hash Set
	HashSet<String> h1 = new HashSet<>();

	public HashSet<String> storeCountryNames(String CountryName) { // 1st method
		h1.add(CountryName); // adding the value
		return h1;
	}

	public void retriveCountry(String CountryName) { // 2nd method
		if (h1.contains(CountryName)) {
			System.out.println(CountryName + " is present in Hash Set");
		} else {
			System.out.println("null");
		}

	}

	public static void main(String[] args) {
		Activity_3 c = new Activity_3();
		System.out.println("HAsh Set Country" + c.storeCountryNames("India"));
		System.out.println("HAsh Set Country" + c.storeCountryNames("Africa"));
		System.out.println("HAsh Set Country" + c.storeCountryNames("US"));
		c.retriveCountry("India");
	}

}