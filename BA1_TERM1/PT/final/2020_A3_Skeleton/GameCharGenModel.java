

import java.util.Arrays;

public class GameCharGenModel 
{
	static public int NUM_CHARS_BLOCK = 500;
	final public int STRENGTH=0; 
	final public int INTELLIGENCE=1; 
	final public int WISDOM=2;
	
	private int gameCharCount=0;
	private GameCharacter[] randomGameChars = new GameCharacter[NUM_CHARS_BLOCK];
	
	/**
	 * Returns the number of randomly-generated characters so far. 
	 * @return Number of randomly-generated characters.
	 */
	public int getNumCharacters()
	{
		return gameCharCount;
	}
	
	/**
	 * Adds a character to the array of characters
	 * @param c character to be added
	 */
	public void addGameCharacter(GameCharacter c)
	{
		if (gameCharCount>=randomGameChars.length)
		{
			GameCharacter[] newRandomChars = Arrays.copyOf(randomGameChars,randomGameChars.length+GameCharGenModel.NUM_CHARS_BLOCK);
			randomGameChars = newRandomChars;
		}
			
		randomGameChars[gameCharCount] = c;
		gameCharCount++;
	}
	
	/**
	 * Returns a character at a given index
	 * @param idx Provided index
	 * @return Character at a given index
	 */
	public GameCharacter gameCharacterAt(int idx)
	{
		if (idx<0 || idx>=randomGameChars.length)
			throw new IndexOutOfBoundsException();
		
		return randomGameChars[idx];
	}
	
	/**
	 * Finds a character with either maximum strength, intelligence or wisdom based on the parameter passed.
	 * @return Index of the character with lowest HP in the character array.
	 * @throws NoGameCharacterFoundException
	 */
	public String[] wisestOfThemAll() throws NoGameCharacterFoundException
	{
		//Implement Q2 here
		String[] result= new String[4];
		
		return result;
	}
	
	
	public void wiserThanStrongOrStrongAsWise() throws NoGameCharacterFoundException
	{
		// Implement Q3 here

		
	}

	public String display() {
		String result = "";
		// Implement Q4 here
		return result;
	}
}
