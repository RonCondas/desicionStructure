import java.util.Scanner;

public class roman1 {

	public static void main(String[] args) {
		
			
				
				System.out.println("This program is intended convert a number from 1 to 10 in roman numbers");
				
				
				
				System.out.println("Enter a number");
				Scanner roma = new Scanner(System.in);
				
				
				
				int numb = roma.nextInt();		

				
				switch (numb)	
					{
					case 1 :
					    System.out.println("I");
					    break;
					 case 2:
					    System.out.println("II");
					    break;
					 case 3:
					    System.out.println("III");
					    break;
					 case 4:
					    System.out.println("IV");
				    break;
					 case 5:
					    System.out.println("V");
					    break;
					  case 6:
					    System.out.println("VI");
					    break;
					  case 7:
					    System.out.println("VII");
					    break;
					  case 8:
						    System.out.println("VIII");
						    break;
					  case 9:
						    System.out.println("IX");
						    break;
					  case 10:
						    System.out.println("X");
						    break;
//					  
					  default:
						   System.out.println( "Sorry, the number you enter is not in range");
						    }
				
//				int answer = roma.nextInt();
//				
//				if(answer == 376) {
//					
//					System.out.println("Your sum is: \n CORECT");
//						
//					}else if(answer == 118) {
//					
//						System.out.println("Your substraction is: \n CORECT");
//						
//					}else if(numb == 1) {
//					
//						System.out.println("The Answer was actully:  118");
//				}else {
//					System.out.println("The Answer was actully:  376");
//				}
//				
				
				
				
			roma.close();	
					
	}
}

		
		