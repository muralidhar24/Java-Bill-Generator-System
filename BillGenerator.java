import java.util.*;
class BillGenerator
{
	static String str="";
	public static void customer_order_list(String item_name, int quantity)
	{
		
		str=str+item_name;
		str=str+" "+":"+" ".repeat(15-item_name.length())+quantity+"\n";
	}
	public static void total()
	{
		System.out.println("-".repeat(25));
		System.out.println("CUSTOMER ITEMS LIST ");
		System.out.println("-".repeat(25));
		System.out.println("ITEM"+"\t      "+"QUANTITY");
		System.out.println(str);
	}
	public static void main(String m[])
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		double total_amount=0;
		int k=1;
		int n=1;
		int lucky_draw, lucky_draw_discount;
		System.out.println("-".repeat(25));
		System.out.println("  WELCOME TO XYZ STORE	  ");
		System.out.println("-".repeat(25));
		System.out.println("ITEMS LIST \n\tITEM\t   PRICE\n\tEGG : 5\n\tNOTEBOOK : 30\n\tPEN : 5\n\tPENCIL : 5\n\tBISCUITS : 7\n\tSUGAR :40\n\tGHEE : 300 liter\n\tMILK : 55 liter\n\tSOAP : 15\n\tCANDLE : 3\n\tBATTERIES :7\n\tTAPE : 7\n\tSHAMPOO : 2\n\tGLUE : 5\n\tCHIPS : 10\n\tDRINKS : 20\n");
		while(n==1)
		{
			System.out.print(" ENTER "+k+" ITEM NAME : ");
			String item_name = sc.nextLine();
			item_name=item_name.toUpperCase();
			System.out.print(" ENTER ITEM QUANTITY : ");
			int quantity = sc.nextInt();
			customer_order_list(item_name,quantity);
			forloop:
			for(int i=1; i<=quantity; i++)
			{
				switch(item_name)
				{
					case "EGG" : total_amount+=5;
					break;
					case "NOTEBOOK" : total_amount+=30;
					break;
					case "PEN" : total_amount+=5;
					break;
					case "PENCIL" : total_amount+=5;
					break;
					case "BISCUITS" : total_amount+=7;
					break;
					case "SUGAR" : total_amount+=40;
					break;
					case "GHEE" : total_amount+=300;
					break;
					case "MILK" : total_amount+=55;
					break;
					case "SOAP" : total_amount+=15;
					break;
					case "CANDLE" : total_amount+=3;
					break;
					case "BATTERIE" : total_amount+=7;
					break;
					case "TAPE" : total_amount+=7;
					break;
					case "SHAMPOO" : total_amount+=2;
					break;
					case "GLUE" : total_amount+=5;
					break;
					case "CHIPS" : total_amount+=10;
					break;
					case "DRINKS" : total_amount+=20;
					break;
					default : System.out.println(" ITEM NOT AVAILABLE IN STORE ");
					break forloop;
					
				}
				
			}
			System.out.println(" TO CONTINUE THE SHOPING PLEASE ENTER 1 ELSE ENTER 0 ");
			n = sc.nextInt();
			sc.nextLine();
			k++;
			if(n==0)
			{
				total();
				System.out.println("-".repeat(15)+"\n TOTAL COST ");
				System.out.println("-".repeat(15));
				System.out.println(total_amount);
				System.out.println("-".repeat(15)+"\n WITH GST 18% ");
				System.out.println("-".repeat(15));
				total_amount=total_amount+total_amount*0.18;
				System.out.println(total_amount);
				System.out.println(" CHRISTMAS LUCKY DRAW OFFER UPTO 20% OFF ");
				System.out.println(" TO PARTICIPATE IN THIS LUCKY DRAW ENTER 1 ELSE ENTER 0 ");
				lucky_draw=sc.nextInt();
				if(lucky_draw==1)
				{
					lucky_draw_discount=random.nextInt(21);
					System.out.println(" CONGRATULATIONS YOU GOT "+lucky_draw_discount+"% DISCOUNT");
					System.out.println(" AFTER "+lucky_draw_discount+"% OF DISCOUNT TOTAL ");
					System.out.println(total_amount-total_amount*lucky_draw_discount/100);	
				}		
			}
		}
						
	}
}