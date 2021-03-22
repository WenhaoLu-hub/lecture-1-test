

public class Patterns
{

	public void run()
	{

		// --------- Print Pattern A to screen

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println('\n'); // space between patterns

		// -------- Print Pattern B to screen

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println('\n'); // space between patterns

		// -----------Print Pattern C to screen

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < i + 1; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println('\n');

		// ------------Print Pattern D to screen

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5 - i; j++)
			{
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++)
			{
				System.out.print("* ");
			}

			System.out.println();

		} // outer loop

		System.out.println('\n'); // space between patterns

		// ------------Print Pattern E to screen

		for (int i = 0; i < 10; i++) // create top (foliage) of the tree
		{
			for (int j = 0; j < 9 - i; j++)
			{
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++)
			{
				System.out.print("* ");

			}

			System.out.println();

		} // outer loop

		for (int i = 0; i < 4; i++) // create tree trunk
		{
			for (int j = 0; j < 6; j++)
			{
				System.out.print(" ");
			}

			for (int j = 0; j < 3; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) // create tree base
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < 9; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}

	}// main

}// program
