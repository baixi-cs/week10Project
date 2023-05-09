package com.cogent.MS2_Performance.Entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Performer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String project;
	String descAchievement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDescAchievement() {
		return descAchievement;
	}
	public void setDescAchievement(String descAchievement) {
		this.descAchievement = descAchievement;
	}
	public Performer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Performer(int id, String name, String project, String descAchievement) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.descAchievement = descAchievement;
	}
	@Override
	public String toString() {
		return "Performer [id=" + id + ", name=" + name + ", project=" + project + ", descAchievement="
				+ descAchievement + "]";
	}
	

}
