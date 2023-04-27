package thrusdaylab_27april_second;
import jakarta.persistence.*; 
@Entity 
@Table(name="student_info") 
public class Student { 
	@Id 

	@GeneratedValue(strategy=GenerationType.IDENTITY) 

	@Column(name="stu_id") 

	private int id; 

	private String name; 

	private String dept; 

	@OneToOne(cascade=CascadeType.ALL) 

	@JoinColumn(name="college_id") 

	private College college;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	public Student() { 

	} 
} 

