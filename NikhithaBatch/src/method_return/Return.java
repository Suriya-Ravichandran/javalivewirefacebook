package method_return;

public class Return {
	
	private String name;
	
	
	public void setname(String name) {
		this.name=name;
		
	}
	
	
	public String getname() {
		return name;
		
	}
	
	public void getdata() {
		System.out.println("Name: "+getname());
	}

}
