package beans;

public class Studentreg {

	private int Rollno;
	private String name; 
	private String fname;
	private String dob; 
	private String email; 
	private long mob; 
 
	private String gender; 
	private int pinno ;
	private String addr;
	private String course;
	public Studentreg() {}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
