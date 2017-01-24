import java.util.ArrayList;

import java.util.Scanner;

public class CharacterGenerator
	{
		static ArrayList<Hero> character = new ArrayList<Hero>();
		static String magic;
		static int number;

		public static void main(String[] args)
			{
				characterList();
				setParty();
			}
		
		public static void characterList()
			{
				character.add (new Hero("", "", "", "", ""));
				character.add (new Hero("", "", "", "", ""));
				character.add (new Hero("", "", "", "", ""));
				character.add (new Hero("", "", "", "", ""));
				character.add (new Hero("", "", "", "", ""));
			}

		public static void setParty()
			{
				
			for (Hero h : character)
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("What is your name?");
					String name = userInput.nextLine();
					h.setName(name);
					System.out.println();
					System.out.println();
					
					Scanner userInput1 = new Scanner(System.in);
					System.out.println("What is your race? Human, Elf, Dwarf, Orc, or Other");
					String race = userInput1.nextLine();
					h.setRace(race);
					System.out.println();
					System.out.println();
					
					Scanner userInput2 = new Scanner(System.in);
					System.out.println("What is your fighting type. Warrior, Mage, Theif, Archer, or Other");
					String fight = userInput2.nextLine();
					h.setFight(fight);
					System.out.println();
					System.out.println();
					
					if (fight.equals("Mage"))
						{
							Scanner userInput4 = new Scanner(System.in);
							System.out.println("What kind of magic does this mage use? Fire, Ice, Lightning, Dark magic, or Other");
							magic = userInput4.nextLine();
							h.setFight(magic);
							System.out.println();
							System.out.println();
						}
					
					else
						{
							
						}
					
					Scanner userInput3 = new Scanner(System.in);
					System.out.println("Is this character a Man, a Woman or Other");
					String gender = userInput3.nextLine();
					h.setGender(gender);
					System.out.println();
					System.out.println();
					
					System.out.println("This is character " + (h.getName()));
					System.out.println("This character is a " + gender);
					System.out.println("This character's race is " + race);
					System.out.println("This character's fighting type is " + fight);
					if (fight.equals("Mage"))
						{
							System.out.println("This Mage controls " + magic);
						}
					System.out.println();
					System.out.println("____________________________________________________________________________________________________________________"
							+ "");
					System.out.println();
				}
			}
	}