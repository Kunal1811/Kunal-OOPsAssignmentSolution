
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRDepartment obj_hr = new HRDepartment();
		TechDepartment obj_tech = new TechDepartment();
		AdminDepartment obj_admin = new AdminDepartment();
		// SuperDepartment obj_super = new SuperDepartment();

		System.out.println(obj_admin.departmentName());
		System.out.println(obj_admin.getTodaysWork());
		System.out.println(obj_admin.getWorkDeadline());
		System.out.println(obj_admin.isTodayAHoliday());

		System.out.println();

		System.out.println(obj_hr.departmentName());
		System.out.println(obj_hr.doActivity());
		System.out.println(obj_hr.getTodaysWork());
		System.out.println(obj_hr.getWorkDeadline());
		System.out.println(obj_hr.isTodayAHoliday());

		System.out.println();

		System.out.println(obj_tech.departmentName());
		System.out.println(obj_tech.getTodaysWork());
		System.out.println(obj_tech.getWorkDeadline());
		System.out.println(obj_tech.getTechStackInformation());
		System.out.println(obj_tech.isTodayAHoliday());

	}

}
