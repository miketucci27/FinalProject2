package section_1b_2;

public class StudentImp1 extends PersonBaseImp1 implements Student {

	public String takenCourseTitle;
	
	StudentImp1(String _name,String _takenCourseTitle) {
		super(_name);
		takenCourseTitle=_takenCourseTitle;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String studiesFor() {
		// TODO Auto-generated method stub
		return takenCourseTitle;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
