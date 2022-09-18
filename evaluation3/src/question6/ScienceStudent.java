package question6;

public class ScienceStudent implements Student{
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	int biologyMarks;
	
	ScienceStudent(int physicsMarks,int chemistryMarks,int mathsMarks,int biologyMarks){
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		this.biologyMarks = biologyMarks;
	}
	
	double getPercentage() {
		
		double percentage = (physicsMarks+chemistryMarks+mathsMarks+biologyMarks)/4;
		
		return percentage;
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
