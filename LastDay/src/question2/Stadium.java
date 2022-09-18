package question2;

public enum Stadium {
	
	EDEN_GARDENS_STADIUM{
	        @Override
	        public void message() {
	            System.out.println("This is the home ground of KKR");
	        }
	    },
	    WANKHEDE_STADIUM{
	        @Override
	        public void message() {
	            System.out.println("This is the home ground of Mumbai Indians");
	        }
	    },
	    CHIDAMBARAM_STADIUM{
	        @Override
	        public void message() {
	            System.out.println("This is the home ground of CSK");
	        }
	    } ,
	    M_CHINNASWAMY_STADIUM{
	        @Override
	        public void message() {
	        	
	            System.out.println("This is the home ground of RCB");
	        }
	    };



	 public void message(){

	     System.out.println("This is the home ground of IPL");
	 }

}


