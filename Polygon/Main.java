package GeneralJavaClasses;
import java.util.*;

public class Main {
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int sel = 0;
		
		boolean typedUnvalid = false;
		
		while(sel != 3 & !typedUnvalid) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Simple sw for calculating the area of some polygons");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			System.out.println("Are we talking about a rectangle or a square?");
			System.out.println("(Insert '1' for \033[4mRectangle\033[0m or '2' for the \033[4mSquare\033[0m)");
			System.out.println(ANSI_RED+"\033[3mInsert 3 to terminate\033[0m"+ANSI_RESET);
			System.out.println("");
			System.out.print("> ");
			try {
				sel = inp.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("");
				System.out.println("You can only insert \033[4mint\033[0m values!");
				typedUnvalid = true;
			}
			switch(sel) {
			case 1:
				System.out.println("");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("You choose to calculate the area of a Rectangle");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("");
				System.out.println("Insert the Weight of the rectangle");
				System.out.print("> ");
				double weight = inp.nextDouble();
				System.out.println("Insert the Height of the rectangle");
				System.out.print("> ");
				double height = inp.nextDouble();
				MathsPolygon rectangle = new MathsPolygon(weight, height);
				double area = rectangle.rectangle_area(weight, height);
				System.out.println("The area is: "+area+"m2");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("You choose to calculate the area of a the square");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("");
				System.out.println("Insert the Weight of the square");
				System.out.print("> ");
				double side = inp.nextDouble();
				MathsPolygon square = new MathsPolygon(side);
				double areas = square.square_area(side);
				System.out.println("The area is: "+areas+"m2");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				break;
				
			default:
				System.out.println("");
				System.out.println("Insert a valid option");
				System.out.println("");
			
			}
		}
	}

}
