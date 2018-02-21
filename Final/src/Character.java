
public class Character
	{
     
	
	
	String occupation;
       int strength;
       String ability;
       
       public Character(String s, int m, String a)
		{
			occupation = s;
			strength = m;
			ability = a;
			
	
		}

	public String getOccupation()
		{
			return occupation;
		}

	public void setOccupation(String occupation)
		{
			this.occupation = occupation;
		}

	public int getStrength()
		{
			return strength;
		}

	public void setStrength(int strength)
		{
			this.strength = strength;
		}

	public String getAbility()
		{
			return ability;
		}

	public void setAbility(String ability)
		{
			this.ability = ability;
		}
       
		
	}
