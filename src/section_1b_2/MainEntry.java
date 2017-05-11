package section_1b_2;

public class MainEntry {

	public static void main(String[] args) {
	
		
		Person p1,p2;
		Teacher t=new TeacherImp1("Ilker","java");
		Student s=new StudentImp1("Michael","java");
		p1=t;
		p2=s;
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		

	}

}
