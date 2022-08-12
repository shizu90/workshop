package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private double baseSalary;
	private Department department;
	
	public Seller() {}
	public Seller(Integer id, String name, String email, Date birthDate, double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public Integer getId() {return this.id;}
	public void setId(Integer id) {this.id = id;}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public String getEmail() {return this.email;}
	public void setEmail(String email) {this.email = email;}
	
	public Date getBirthDate() {return this.birthDate;}
	public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}
	
	public double getBaseSalary() {return this.baseSalary;}
	public void setBaseSalary(double baseSalary) {this.baseSalary = baseSalary;}
	
	public Department getDepartment() {return this.department;}
	public void setDepartment(Department department) {this.department = department;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Seller other = (Seller) obj;
		if(this.id == null) {
			if(other.id != null) {
				return false;
			}
		}else if(!id.equals(other.id)) return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + 
				", baseSalary=" + baseSalary + ", department=" + department + "]";
	}
}
