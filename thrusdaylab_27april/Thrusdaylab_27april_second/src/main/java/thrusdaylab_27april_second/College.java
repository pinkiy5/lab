package thrusdaylab_27april_second;
import jakarta.persistence.*; 
@Entity 
@Table(name="college_info") 
public class College {
	@Id 
	private int college_id; 
	private String college_Name;
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	public String getCollege_Name() {
		return college_Name;
	}
	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}
	public College(int college_id) {
		super();
		this.college_id = college_id;
	}
	

}
