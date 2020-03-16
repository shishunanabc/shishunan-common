package com.shishunan.common.utils;
/**
 * 
 * @ClassName: Person 
 * @Description: TODO
 * @author: ʦ����
 * @date: 2020��2��28�� ����8:50:46
 */

import java.util.Date;

public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date date;
	public Person() {
		super();
	}
	public Person(String name, Integer age, String about, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", date=" + date + "]";
	}
	
}
