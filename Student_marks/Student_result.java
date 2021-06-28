package Student_marks;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT_RESULT")
public class Student_result {

	//@Id @GeneratedValue(generator="NewGenerator")
	//@GenericGenerator(name="NewGenerator", strategy="foreign", parameters = { @Parameter (value="student", name="property") })
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int rollno;
	
	
	
	// i want to connect Student_ino to this 
	
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="rollno")

	private int Coa;
	private int SW;
	private int Unix;
	private int Os;
	private int Ds;
	public int getCoa() {
		return Coa;
	}
	public void setCoa(int coa) {
		Coa = coa;
	}
	public int getSW() {
		return SW;
	}
	public void setSW(int sW) {
		SW = sW;
	}
	public int getUnix() {
		return Unix;
	}
	public void setUnix(int unix) {
		Unix = unix;
	}
	public int getOs() {
		return Os;
	}
	public void setOs(int os) {
		Os = os;
	}
	public int getDs() {
		return Ds;
	}
	public void setDs(int ds) {
		Ds = ds;
	}
			
		
			
}
