package SpringQ5;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private int admNo;
	private String studentname;
	
	
	@Resource
	private IdCard idCard;


	public int getAdmNo() {
		return admNo;
	}
	
	public void setAdmNo(int admNo) {
		
		this.admNo = admNo;
	}


	public String getStudentname() {
		return studentname;
	}

	@Inject
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public IdCard getIdCard() {
		return idCard;
	}


	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

}
