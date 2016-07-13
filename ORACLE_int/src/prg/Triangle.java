package prg;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle.triangleCharacter(5);
		Triangle.triangle(5);
		
		
	}
	public static void triangle(int n)
	{
		int rows, star, spaces;
        int number_of_stars = n;
        int number_of_rows = number_of_stars;

        for (rows=1; rows <= number_of_rows; rows++) {
                for (spaces=1; spaces <= number_of_stars; spaces++) {
                        System.out.print(" ");
                }
                for (star=1; star <= rows; star++) {
                	System.out.print("*");
                	System.out.print(" ");
                }
                System.out.println();
                number_of_stars = number_of_stars - 1;
        }
        
	}
	
	public static void triangleCharacter(int n)
	{
		int rows, star, spaces;
        int number_of_stars = n;
        int number_of_rows = number_of_stars;

        for (rows=1; rows <= number_of_rows; rows++) {
                for (spaces=1; spaces <= number_of_stars; spaces++) {
                        System.out.print(" ");
                }
                for (star=1; star <= rows; star++) {
                	if(rows % 2==0)
                	{
                		System.out.print("0");
                	}
                	else
                	{
                		System.out.print("X");
                	}
                	
                	System.out.print(" ");
                }
                System.out.println();
                number_of_stars = number_of_stars - 1;
        }
        
	}

}
