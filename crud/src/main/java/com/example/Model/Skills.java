package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SKILLS") 
public class Skills {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	int  skillId;
	
	String skilName;

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkilName() {
		return skilName;
	}

	public void setSkilName(String skilName) {
		this.skilName = skilName;
	}
}
