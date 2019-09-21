
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knight k1 = new Knight();
		Mage m1 = new Mage();
		Golem g1 = new Golem();
		
		m1.infoStat();
		m1.buffAttack();
		m1.infoStat();
		m1.Attack(k1);
		m1.Attack(k1);
		m1.Attack(k1);
		k1.infoStat();
		k1.buffDefens();
		k1.infoStat();
		k1.Attack(m1);
		k1.Attack(m1);
		k1.infoStat();
		m1.infoStat();
		
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
		g1.Attack(m1);
	}
}
