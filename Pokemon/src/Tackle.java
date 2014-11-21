
public class Tackle implements AttackBehavior
	{
	final int maxPP = 30;
	int pp = 30;
	Pokemon pokemon = Run.currentPokemon;
	@Override
	public void applyStatusEffects()
		{
		
		}

	@Override
	public int attack()
		{
		pp--;
		int damageBoost = 1;
		int damage = pokemon.getAtk() * damageBoost;
		return damage;
		}
	}
