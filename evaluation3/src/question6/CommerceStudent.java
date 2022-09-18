package question6;

public  class CommerceStudent implements Student{
	
	int accountMarks;
	int economicsMarks;
	int businessStudiesMarks;
	
	CommerceStudent(int accountMarks,int economicsMarks,int businessStudiesMarks){
		this.accountMarks=accountMarks;
		this.businessStudiesMarks=businessStudiesMarks;
		this.economicsMarks=economicsMarks;
	}
	
	 double getPercentage() {
		 
		 double percentage = (accountMarks + economicsMarks + businessStudiesMarks )/3;
		 
		 return percentage;
	 }

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
