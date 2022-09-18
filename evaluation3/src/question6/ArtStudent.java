package question6;

public  class ArtStudent implements Student{
	
	int hindiMarks;
	int englishMarks;
	int historyMarks;
	
	ArtStudent(int hindiMarks,int englishMarks,int historyMarks){
		
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
		
	}
	
	double getPercentage() {
		
		double percentage = (hindiMarks+englishMarks+historyMarks)/3;
		
		return percentage;
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
