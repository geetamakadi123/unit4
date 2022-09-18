package question3;



public class Main {
	
	static void messageToStudents(Evaluation evaluation){
        if(evaluation instanceof DsaEvaluation){
        	
            System.out.println("Its a DSA Evaluation");
            evaluation.printNoOfQuestions();
            evaluation.evaluationTiming();
            
        }

        else if(evaluation instanceof CodingEvaluation){
        	
            System.out.println("Its a Coding Evaluation");
            evaluation.printNoOfQuestions();
            evaluation.evaluationTiming();
            
        }
        
    }

    public static void main(String[] args) {


        messageToStudents(new DsaEvaluation(5));
        System.out.println("===================================");
        messageToStudents(new CodingEvaluation(4));
    }


}
