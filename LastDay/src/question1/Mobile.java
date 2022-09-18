package question1;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

    public void searchOutdatedModel(String companyName,String... modelNames){

        for(String items : modelNames){

           for(int i=0; i<outdatedModels.length; i++){

               if(outdatedModels[i] == items){
            	   
                   System.out.println(items+"_"+"OUTDATED");
               }
           }
        }
    }

    public static void main(String[] args) {

        Mobile m1=new Mobile();

        m1.searchOutdatedModel("Xiaomi","note5","note9");
    }

}
