package GradedAssignment1_harshita;


public class Driver {

	public static void main(String[] args) {
		SuperDepartment ad=new AdminDepartment();
		SuperDepartment hr=new HRDepartment();
		SuperDepartment te=new TechDepartment();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println("\n\nWelcome to "+hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println("\n\nwelcome to "+te.departmentName());
		System.out.println(te.getTodaysWork());
		System.out.println(te.getWorkDeadline());
		System.out.println(te.isTodayAHoliday());
	
	}

	
}
