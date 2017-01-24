
public class Hero
	{
		private String name;
		private String fight;
		private String gender;
		private String race;
		private String magic;
		
		public Hero (String n, String f, String g, String r, String m)
			{
				name = n;
				fight = f;
				gender = g;
				race = r;
				magic = m;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getFight()
			{
				return fight;
			}

		public void setFight(String fight)
			{
				this.fight = fight;
			}

		public String getGender()
			{
				return gender;
			}

		public void setGender(String gender)
			{
				this.gender = gender;
			}

		public String getRace()
			{
				return race;
			}

		public void setRace(String race)
			{
				this.race = race;
			}

		public String getMagic()
			{
				return magic;
			}

		public void setMagic(String magic)
			{
				this.magic = magic;
			}
	}
