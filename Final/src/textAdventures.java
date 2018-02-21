import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class textAdventures
	{
		private static final int getStrength = 0;
		private static int classChoice = 0;
		static ArrayList<Character> player1 = new ArrayList<Character>();
		static ArrayList<Villain> player2 = new ArrayList<Villain>();
		public static void main(String[] args)
			{
				occupationArray();
				choosePlayer();
				villanArray();
				chooseTarget();
				adventureTime();

			}
		private static void chooseTarget()
			{
				JFrame frame = new JFrame();
				 int classVillan;
					
				 Object[] options = {"Al Capone", "Pablo Escobar", "Lucky Luciano", "El Chapo"};
					classVillan = JOptionPane.showOptionDialog(frame, "Who would you like to take out?",
							"Villan",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, options, options);
					switch(classVillan)
					{
					case 0:
						{
							JOptionPane.showMessageDialog(frame, "Al Capone. The Mob boss or Scarface, this will be a hard target.");
							break;
						}
					case 1:
							{
								JOptionPane.showMessageDialog(frame, "Pablo Escobar. The Drug Lord and leader of the Narcoterrorist. I hope your fluent in spanish.");
								break;
							}
					case 2:
							{
								JOptionPane.showMessageDialog(frame, "Lucky. The Father of modern Crime. A hard target to get to.");
								break;
							}
					case 3:
							{
								JOptionPane.showMessageDialog(frame, "Leader of the Cartel and a Drug Lord.");
								break;
							}
				
						}				
			}
		private static void villanArray()
			{
				JFrame frame = new JFrame();
				    player2.add(new Villain("Al Capone", 10, " Baseball Bat "));
					player2.add(new Villain("Pablo Escobar", 20, " Machete "));
					player2.add(new Villain("Lucky Luciano", 50, " Attack Dogs "));
					player2.add(new Villain("El Chapo", 15," The Cartel "));
					for (int i = 0; i < player2.size(); i++)
						{
							
							JOptionPane.showMessageDialog(frame, "Villain = " + player2.get(i).getName() + ", Weapon is " + player2.get(i).getWeapon());
						}
				
			}
		private static void adventureTime()
			{
				
				JFrame frame = new JFrame();
				 
				 Object[] options1 = {"Scout", "Rush", "1 by 1"};
					int className = JOptionPane.showOptionDialog(frame, "How would you like to take your target out.",
							"Choice",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, options1, options1[2]);
					switch(className)
					{
					case 0:
						{
						JOptionPane.showMessageDialog(frame, "You scout the complex and notice your target is on the top floor in a suite.");
						player1.get(2).setStrength(60);
						
						JOptionPane.showMessageDialog(frame, "Your Stength has been boosted " + player1.get(4).getStrength());
						
						
						 Object[] options11 = { "Rush", "1 by 1"};
							className = JOptionPane.showOptionDialog(frame, "What would you like to do now?",
									"Choice",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
									null, options11, options11[1]);
							switch(className)
							{
								case 0:
										{
											JOptionPane.showMessageDialog(frame,"You rush in now knowing the layout. You make your way to the top in a hurry.");
											
											
											JOptionPane.showMessageDialog(frame, "You have the enemy in your sights and use your ability" );
											
											


											JOptionPane.showMessageDialog(frame, "You have defeated your target");
											JOptionPane.showMessageDialog(frame,"Congrats! Head back to base and we'll evaluate our next target.");
											JOptionPane.showMessageDialog(frame,"Until Next time..................................");
											break;
										}
								case 1:
										{
											JOptionPane.showMessageDialog(frame,"You thin the heard. as smart as you are you find yourself out numbered.");
											JOptionPane.showMessageDialog(frame,"You Lose Better Luck next time");
											break;
										}
								
								
								
								
							}
						break;
						}
					case 1:
						{
						JOptionPane.showMessageDialog(frame, "You rush thinking it will be ok. But you end up dying to the hands of your target.");
						JOptionPane.showMessageDialog(frame,"You Lose Better Luck next time");
						break;
						}
					case 2:
						{
						JOptionPane.showMessageDialog(frame, "A smart choice you take out your targets body-guards one by one. Thinning the heard.");
						player1.get(0).setStrength(60);
								
					    JOptionPane.showMessageDialog(frame, "Your Stength has been boosted to " + player1.get(0).getStrength());
					    
					    Object[] options11 = { "Rush", "Sneak"};
						className = JOptionPane.showOptionDialog(frame, "What would you like to do now?",
								"Your Vocation",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, options11, options11[1]);
						switch(className)
						{
							case 0:
									{
								JOptionPane.showMessageDialog(frame,"You Rush in and end up finding your target but die to his trap.");
								JOptionPane.showMessageDialog(frame,"You Lose Better Luck next time");
								break;
									}
							
							case 1:
					                {
					                	JOptionPane.showMessageDialog(frame,"You Sneak right into your enemies trap and die to his hands. ");
					                	JOptionPane.showMessageDialog(frame,"You Lose Better Luck next time");
								
								break;
									}
						}
							
						
						break;
						}
					}
			}
		private static void choosePlayer()
			{
				int classJob;
				JFrame frame = new JFrame();
				for (int i = 0; i < player1.size(); i++)
					{
						 JOptionPane.showMessageDialog(frame, "Class = " + player1.get(i).getOccupation() + ", Ability is " + player1.get(i).getAbility()+ "with a Strength of  "+ player1.get(i).getStrength());
					}
				 Object[] options = {"Ninja", "Panda", "Giant", "Mage", "Serpant"};
					classJob = JOptionPane.showOptionDialog(frame, "Who would you like to play as?",
							"Character",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, options, null);
				
					
				
				
				if(player1.get(classJob).getOccupation().equals("Ninja"))
					
					{						
						JOptionPane.showMessageDialog(frame, "Ninja's are a great choice for silently taking out your enemy with Shadow Punch and a Katana.");
					}
                if(player1.get(classJob).getOccupation().equals("Panda"))
					
					{						
						JOptionPane.showMessageDialog(frame, "Panda's are a choice for those who want to get their paws dirty. A heavy hitter who will take you down with their Bamboo sword & smack.");
					}
                else if(player1.get(classJob).getOccupation().equals("Barbarian"))
					
					{						
						JOptionPane.showMessageDialog(frame, "Barbarian's are very strong muscle wise but lack the brains to do most things. They still pack a heavy punch and can counter almost all attacks that come at them.");
					}
                else if(player1.get(classJob).getOccupation().equals("Mage"))
					
					{						
						JOptionPane.showMessageDialog(frame, "Goblin's are one of the more intelligent speices in the game. Using their long range attacks and fireball ability to incinerate their foe's");
					}
                else if(player1.get(classJob).getOccupation().equals("Serpant"))
					
					{						
						JOptionPane.showMessageDialog(frame, "Serpant's are fast in water but slow on land. They have a strong bite and vicious tale that can cause Tsunami's");
					}
                
			}
		public static void occupationArray()
			{
				                player1.add(new Character("Ninja", 10,  " Shadow Punch "));
								player1.add(new Character("Panda", 20, " Bamboo smack "));
								player1.add(new Character("Barbarian", 50, " Counter Attack "));
								player1.add(new Character("Mage", 15," FireBall "));
								player1.add(new Character("Serpant", 30," Tsunami "));
								
			}

	}
