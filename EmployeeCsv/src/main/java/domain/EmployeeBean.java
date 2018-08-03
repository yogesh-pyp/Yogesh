package domain;

import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

	
	String id;
	
	String name;
	
	String city;
	
	String State;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", State=" + State + "]";
	}
	
	
	
	
}
