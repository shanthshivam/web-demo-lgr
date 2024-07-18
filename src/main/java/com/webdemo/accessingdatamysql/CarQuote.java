package com.webdemo.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CarQuote {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  
  private Integer id;

  private String carName;

  private String carYear;
  
  private String firstName;

  private String surname;
  private int age;
  private int year;

  public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public String getCarYear() {
	return carYear;
}

public void setCarYear(String carYear) {
	this.carYear = carYear;
}

}