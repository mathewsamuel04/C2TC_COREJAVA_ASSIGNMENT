package entityassignment2;

public class Student {
	private String Name;
	private String Adress;
	private int Phone;
	private int Sales_amount;
	private double Commission;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		this.Phone = phone;
	}
	public int getSales_amount() {
		return Sales_amount;
	}
	public void setSales_amount(int sales_amount) {
	   this.Sales_amount = sales_amount;
	}
	public double getCommission() {
		return Commission;
	}
	public void setCommission(double commission) {
		this.Commission = commission;
	}
	public Student() {
		System.out.println("Object is Created");
	}
	public void calculateCommission() {
		 if (Sales_amount >= 100000) {
	            Commission = Sales_amount * 0.10;
	        } else if (Sales_amount >= 50000) {
	            Commission = Sales_amount * 0.05;
	        } else if (Sales_amount >= 30000) {
	            Commission = Sales_amount * 0.03;
	        } else {
	            System.out.println("No Commission");
	        }
		 System.out.println("Name: " + Name);
	        System.out.println("Sales Amount: " + Sales_amount);
	        System.out.println("Commission: " + Commission);
	}
	 

}
