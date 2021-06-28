package Student_marks;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import Student_marks.Student_info;

public class Main {
	
	public static void main(String [] arg)
	{
	//this is the first table 
	Student_info s1 = new Student_info();
	s1.setName("Yogeshwar");
	s1.setCourse("MCA");
		// secound 
	Student_result r1 = new Student_result();
	r1.setCoa(47);
	r1.setDs(80);
	r1.setOs(60);
	r1.setSW(70);
	r1.setUnix(90);
      //Join
	//r1.setStudent(s1);
	
	s1.setName("Salman");
	s1.setCourse("MCA");
		// secound 
	Student_result r2 = new Student_result();
	r2.setCoa(47);
	r2.setDs(80);
	r2.setOs(60);
	r2.setSW(70);
	r2.setUnix(90);
	
	
	SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=sessionfactory.openSession();
	session.beginTransaction();

	session.save(s1);
	session.save(r1);


	session.getTransaction().commit();
	session.close();
	sessionfactory.close();
	
	
	}

}