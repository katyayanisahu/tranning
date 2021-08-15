package service;

import java.util.List;
import com.techment.dao.IEmployeeDao;
import com.techment.dao.EmployeeDaoImpl;
import com.techment.modal.Employee;

import IEmployeeService.IEmployeeService;
public class EmployeeServiceImpl implements IEmployeeService {
  IEmployeeDao employeeDao=new EmployeeDaoImpl();
  
  public Employee getEmployeeById(int id)
  {
	 return employeeDao.getEmployeeById(id);
  }
  public List<Employee> getEmployeeByDept(String dept)
  {
	  return employeeDao.getEmployeeByDept(dept);
  }


}
