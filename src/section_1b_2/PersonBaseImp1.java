package section_1b_2;

public abstract class PersonBaseImp1 implements Person {

	public String name;

	PersonBaseImp1(String _name){
		name=_name;
	
		
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
