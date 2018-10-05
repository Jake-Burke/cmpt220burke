import java.util.Scanner;

public class AnotherBrickInTheWall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of the wall: ");
		int height = scan.nextInt();
		
		System.out.println("Enter the width of the wall: ");
		int width = scan.nextInt();
		
		System.out.println("Enter the number of bricks: ");
		int bricks = scan.nextInt();
		
		boolean test = true;
		
		System.out.println("Enter the lenght of each brick: ");
		int[] numbers = new int[bricks];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = scan.nextInt();
		
		int brick = 0;
		int brickWidth = 0;

		main: for (int i = 1; i <= height; i++){
				brickWidth = width;
				
				while (brickWidth > 0){
					if (brick == numbers.length){
						test = false;
						break main;
						}
					else{
						brickWidth -= numbers[brick];
						}
					
					brick++;
					}
				
				if (brickWidth < 0){
					test = false;
					break main;
					}
				}

		if (test) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

			}

		}