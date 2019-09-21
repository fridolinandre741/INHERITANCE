
public class Player {
	private String name;
	private double att;
	private double def;
	private double health=100;
	
	public Player(String name, double att, double def) {
		this.name = name;
		this.att= att;
		this.def=def;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAtt() {
		return att;
	}
	public void setAtt(double att) {
		this.att = att;
	}
	public double getDef() {
		return def;
	}
	public void setDef(double def) {
		this.def = def;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	
	public void Status(Player p) {
		if(this.getHealth()<=0) {
			System.out.println("Enemy Victory");
		}else if(p.getHealth()<=0) {
			System.out.println("Player Victory");
		}
	}
	
	public void infoStat() {
		System.out.println("Class   : "+this.getName());
		System.out.println("Attack  : "+this.getAtt());
		System.out.println("Defens  : "+this.getDef());
	}
	
	public void buffAttack() {
		if(this.getName()=="GOLEM") {
			double golemAtt=this.getAtt()+(0.2*this.getAtt());
			this.setAtt(golemAtt);
		}else if(this.getName()=="MAGE") {
			double mageAtt=this.getAtt()+(1*this.getAtt());
			this.setAtt(mageAtt);
		}else if(this.getName()=="KNIGHT") {
			double knightAtt=this.getAtt()+(0.7*this.getAtt());
			this.setAtt(knightAtt);
		}
		
	}
	
	public void buffDefens() {
		if(this.getName()=="GOLEM") {
			double golemDef=this.def+(1*this.def);
			this.setDef(golemDef);
		}else if(this.getName()=="MAGE") {
			double mageDef=this.def+(0.2*this.def);
			this.setDef(mageDef);
		}else if(this.getName()=="KNIGHT") {
			double knightDef=this.def+(1*this.def);
			this.setDef(knightDef);
		}
		
	}
	
	public void Attack(Player p) {
		p.health-=this.att;
		if(this.getHealth()<=0 || p.getHealth()<=0) {
			Status(p);
		}else {
			System.out.println(this.getName() + " Attack "+p.getName());
			System.out.println("Sisa nyawa "+this.getName()+" "+this.getHealth());
			System.out.println("Sisa nyawa "+p.getName()+" "+p.getHealth());
		}
	}
	
}
