import java.util.Scanner;

class Ass_3_NinhTQ {

    public Ass_3_NinhTQ() {
    }
    
    public static void main (String[] args) {
    	int aptitudeQuestion = 0, aptitudeAnswer = 0, aptitudeCase = 1;
    	int englishQuestion = 0, englishAnswer = 0, englishCase = 2;
    	int mathQuestion = 0, mathAnswer = 0, mathCase = 3;
    	int select = 0;
    	int score = 0;
    	int points = 0;3
    		
		Scanner input = new Scanner (System.in);
    	for (int i = 0; i<3; i++)
    	{
    		System.out.println ("\t- CHON DE TAI --------------");
    		if(aptitudeQuestion == 0)
    		{
    			System.out.println ("\t1. Aptitude");
    		}    			
    		if(englishQuestion == 0)
    		{
    			System.out.println ("\t2. English");
    		}
    		if(mathQuestion == 0)
    		{
    			System.out.println ("\t3. Math");
    		}
    		System.out.println ("\t4. Exit");
    		System.out.print ("\tLua chon de tai: ");
    		select = input.nextInt();
    		if(select == 4)
    		{
    			break;
    		}
    		else
    		{
	    		switch (select) {
					case 1:
						if(aptitudeQuestion != 1)
						{
							System.out.println ("Cau hoi:\n\"2 con vit di truoc 2 con vit, 2 con vit di sau 2 con vit, 2 con vit di giua 2 con vit. Hoi co may con vit?\"");
							System.out.println ("Lua chon dap an duoi day:\n1. 3 con vit\t2. 4 con vit\t3. 5 con vit");
							System.out.print ("Dap an: ");
							aptitudeAnswer = input.nextInt();
							if(aptitudeAnswer == 2) score = score + 10;
							aptitudeQuestion = 1;
						}
						else
						{
							System.out.println ("Da hoan thanh de tai nay. Vui long chon de tai moi!");
						}
						break;
					case 2:
						if(englishQuestion != 1)
						{
							System.out.println ("Cau hoi:\n\"What's the capital of Viet Nam?\"");
							System.out.println ("Lua chon dap an duoi day:\n1. Ha Noi\t2. Da Nang\t3. Ho Chi Minh");
							System.out.print ("Dap an: ");
							englishAnswer = input.nextInt();
							if(englishAnswer == 1) score = score + 10;
							englishQuestion = 1;
						}
						else
						{
							System.out.println ("Da hoan thanh de tai nay. Vui long chon de tai moi!");
						}
						break;
					case 3:
						if(mathQuestion != 1)
						{
							System.out.println ("Cau hoi:\n\"So pi bang bao nhieu?\"");
							System.out.println ("Lua chon dap an duoi day:\n1. (3.13)\t\t2. (3.14)\t\t3. (3.15)");
							System.out.print ("Dap an: ");
							mathAnswer = input.nextInt();
							if(mathAnswer == 2) score = score + 10;
							mathQuestion = 1;
						}
						else
						{
							System.out.println ("Da hoan thanh de tai nay. Vui long chon de tai moi!");
						}	
						break;
				}
    		}
    	}
    	System.out.println ("-----------------------------------------------------------------------");
    	System.out.println ("\tFINISH!!");
    	switch (score) {
    		case 0:
    			System.out.println ("\tBonus points earned: \t0");
    			System.out.println ("\tTotal score out of 35: \t0");
    			System.out.println ("\tMessage on IQ level: \t\"You need to reappear the test\"");
    			break;
			case 10:
    			System.out.println ("\tBonus points earned: \t0");
    			System.out.println ("\tTotal score out of 35: \t10");
    			System.out.println ("\tMessage on IQ level: \t\"Your IQ level is below average\"");
				break;
			case 20:
    			System.out.println ("\tBonus points earned: \t2");
    			System.out.println ("\tTotal score out of 35: \t22");
    			System.out.println ("\tMessage on IQ level: \t\"Your IQ level is average\"");
				break;
			case 30:
    			System.out.println ("\tBonus points earned: \t5");
    			System.out.println ("\tTotal score out of 35: \t35");
    			System.out.println ("\tMessage on IQ level: \t\"You are intelligent\"");
				break;
		}
		System.out.println ("-----------------------------------------------------------------------");
    }
}