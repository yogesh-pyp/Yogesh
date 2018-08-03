package service;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;

import Doa.EmployeeDoa;
import domain.Employee;
import domain.EmployeeBean;



@Service
public class EmployeeService {

	@Autowired
	EmployeeBean employeeBean;
	
	@Autowired
	EmployeeDoa employeeDoa;
	
	public List readCsv() throws IOException
	{
		String csvFilename = "C:\\Employee.csv";
		
		List<EmployeeBean> list=new ArrayList<EmployeeBean>();
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		String[] row = null;
		while((row = csvReader.readNext()) != null) {
			
		employeeBean.setId(row[0]);	
		employeeBean.setName(row[1]);
		employeeBean.setCity(row[2]);
		list.add(employeeBean);
		
		employeeDoa.addEmployee(employeeBean);
			
		}
		//...
		csvReader.close();
		
		
		return list;
	}
	
}

