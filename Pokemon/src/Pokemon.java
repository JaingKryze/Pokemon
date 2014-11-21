
public abstract class Pokemon
	{
	protected AttackBehavior myAttackBehavior;
	protected String name;
	protected int atk;
	protected int def;
	protected int maxHP;
	protected int hp;
	protected int spd;
	protected int lvl;
	protected String type;
	protected String weakness;
	protected String strength;
	protected String[] skills = new String[4];
	public int performAttack()
		{
		return myAttackBehavior.attack();
		}
	public AttackBehavior getMyAttackBehavior()
		{
		return myAttackBehavior;
		}
	public void setMyAttackBehavior(AttackBehavior myAttackBehavior)
		{
		this.myAttackBehavior = myAttackBehavior;
		}
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public int getAtk()
		{
		return atk;
		}
	public void setAtk(int atk)
		{
		this.atk = atk;
		}
	public int getDef()
		{
		return def;
		}
	public void setDef(int def)
		{
		this.def = def;
		}
	public int getMaxHP()
		{
		return maxHP;
		}
	public void setMaxHP(int maxHP)
		{
		this.maxHP = maxHP;
		}
	public int getHp()
		{
		return hp;
		}
	public void setHp(int hp)
		{
		this.hp = hp;
		}
	public int getSpd()
		{
		return spd;
		}
	public void setSpd(int spd)
		{
		this.spd = spd;
		}
	public int getLvl()
		{
		return lvl;
		}
	public void setLvl(int lvl)
		{
		this.lvl = lvl;
		}
	public String[] getSkills()
		{
		return skills;
		}
	public void setSkills(String[] skills)
		{
		this.skills = skills;
		}
	}
