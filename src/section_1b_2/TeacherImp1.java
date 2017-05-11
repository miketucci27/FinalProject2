package section_1b_2;

public class TeacherImp1 extends PersonBaseImp1 implements Teacher {

	
	public String thoughtCourseTitle;


	TeacherImp1(String _name,String _thoughtCourseTitle) {
		super(_name);
		thoughtCourseTitle=_thoughtCourseTitle;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String teachersFor() {
		return thoughtCourseTitle;
	}


	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
