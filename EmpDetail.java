package com.hibernate.hibernateproject;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hibernate.hibernateproject.dto.Address;
import com.hibernate.hibernateproject.dto.Age;
import com.hibernate.hibernateproject.dto.Name;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name = "EmpDetail")
public class EmpDetail implements Serializable {
	private static final long serialVersionUID = 8633415090390966715L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
 
	@Column(name = "EMPNAME")
	private Name empname;
	@Column(name = "AGE")
	private Age age;
	@Column(name = "ADDRESS")
	private Address address;
 
    @OneToMany(mappedBy = "EmpDetail", cascade = CascadeType.ALL)
    private String Details;
 
  	  public EmpDetail(Name empname, Age age, Address address) {
        this.empname = empname;
        this.age = age;
        this.address = address;
    }
 
  	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getempname() {
		return empname;
	}

	public void setempname(Name empname) {
		this.empname = empname;
	}

	public Age getage() {
		return age;
	}

	public void setage(Age age) {
		this.age = age;
	}

	public Address getaddress() {
		return address;
	}

	public void setaddress(Address address) {
		this.address = address;
	}


    public String getDetails() {
        return Details;
    }
 
    public void setDetails(String Details) {
        this.Details = Details;
    }
}
{}
