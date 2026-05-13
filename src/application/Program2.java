package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	   public static void main(String[] args) {

	     DepartmentDao departmentDao =  DaoFactory.createDepartmentDao();
	     
	     System.out.println("=== TEST 1: department findById ===");

	        Department dep = departmentDao.findById(1);
	        dep.setName(null);
	        System.out.println(dep);

	        System.out.println("\n=== TEST 2: department findAll ===");
	        List<Department> list = departmentDao.findAll();

	        for (Department obj : list) {
	            System.out.println(obj);
	        }

	        System.out.println("\n=== TEST 3: department insert ===");
	        Department newDepartment = new Department(
	                null,
	                "Games"
	        );
	        departmentDao.insert(newDepartment);

	        System.out.println(
	                "Inserted! New id = "
	                + newDepartment.getId()  
	                );
	        
	        System.out.println("\n=== TEST 4: department update ===");
	        Department department = departmentDao.findById(1);
	        department.setName("Technology");
	        departmentDao.update(department);

	        System.out.println("Update completed");

	        System.out.println("\n=== TEST 5: department delete ===");
	        departmentDao.deleteById(7);
	        System.out.println("Delete completed");
	    }
	}


