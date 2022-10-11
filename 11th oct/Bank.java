package Assignments;

class Bank{
}
	class SBI extends Bank{
	int getRateOfInterest(){
		return 8;}
	}
	
	class ICICI extends Bank{
	int getRateOfInterest(){
		return 7;}
	}
	class AXIS extends Bank{
	int getRateOfInterest(){
		return 9;}
	} 

class test{
		public static void main(String args[]){
		SBI S = new SBI();
		ICICI I = new ICICI();
		AXIS A = new AXIS();
		System.out.println("SBI Rate of Interest: "+S.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+I.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+A.getRateOfInterest());
	}
}


