package collection;
import java.util.*;
public class Activity_3 {
	
	HashMap<String,String>CountryMap = new HashMap<String,String>();
	void storeCountryName(String CountryName,String Capital){
	CountryMap.put(CountryName,Capital);
	}	
	
	static String retrieveCountryName(String CountryName,String Capital) {
		if (CountryMap.contains(CountryName))
		return Capital;
		else
		return null;
	}

	static String retrieveCapital(String CountryName,String Capital) {
		if (CountryMap.contains(Capital))
		return CountryName;
		else
		return null;
	}
	
	public static void main(String args[]) {
		Activity_3 obj=new Activity_3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of countries you want to enter:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the name of Country "+i+":");
			obj.storeCountryName(sc.next());
		}
		//System.out.println("Elements in HashSet(H1):"+Country);
		System.out.println("Enter country name to search in HashSet(H1):");
		System.out.println(retrieveCountryName(sc.next()));
		System.out.println(retrieveCapital(sc.next()));

}}