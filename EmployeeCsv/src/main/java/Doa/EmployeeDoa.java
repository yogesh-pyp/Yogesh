package Doa;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.EmployeeBean;

@Repository
public class EmployeeDoa {
	
	@Autowired
	SessionFactory sessionFactory;
	

	public void addEmployee(EmployeeBean employeeBean)
	{
		sessionFactory.getCurrentSession().save(employeeBean);
	}

}
