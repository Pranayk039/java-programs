class loss {
    public static void main(String[] args) {
        int cp=8000,sp=8000;
	
		if(cp<=sp)
		{
			System.out.println("profit = "+ (sp-cp));
			
		}
		else
		{
			System.out.println("loss ="+ (cp-sp));
		}
       
    }
}