package application;


import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program02 {
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 4: department insert ===");
		Department department = new Department(null, "Smartphone");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " + department.getId());
		
	}
}
