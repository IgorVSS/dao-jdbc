package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department department = new Department(null, "Smartphone");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " + department.getId());
		
		System.out.println("=== TEST 2: department update ===");
	    department = departmentDao.finById(3);
		department.setName("Peripherals");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("=== TEST 3: department findById ===");
		department = departmentDao.finById(1);
		System.out.println("The id chosen was: " + department);
		
		System.out.println("=== TEST 4: department findAll ===");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list ) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 5: department deleteById ===");
		System.out.print("Enter ID for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
	}
}
