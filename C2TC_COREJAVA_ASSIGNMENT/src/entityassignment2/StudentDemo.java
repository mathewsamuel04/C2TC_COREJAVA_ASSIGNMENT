package entityassignment2;

public class StudentDemo {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Aswin");
		s.setAdress("no: 23,FF Street");
		s.setPhone(455634241);
		s.setSales_amount(346788);
		s.setCommission(6);
		s.calculateCommission();
		}

}
