package empSalary;

public class processProject {
	private int sum;
	public processProject() {
		
	}
	public processProject(inputProject in) {
		int sum = 0;
		//--project #A --//
		if(in.getSalary() < 100000){
			sum = (int)(0.5*in.getSalary());
			sum = sum + in.getSalary();
		}
		else {
			sum = (int)(0.10*in.getSalary());
			sum = sum + in.getSalary();
		}

		this.sum = sum;
		
	}             
	public int getSum(){
		return this.sum;
	}
	public void setSum(int sum){
		this.sum = sum;
	}
}