// Zadatak za player i enemy na vjezbama

class Player {

	private int x;
	private int y;
	private int width;
	private int height;
	private int health;

	public Player(int x, int y, int width, int height, int health) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setHealth(health);
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (health >= 0 && health <= 100) {
			this.health = health;
		} else {
			System.out.println("Health mora biti izmedju 0 i 100.");
		}
	}
}

class Enemy {

	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;

	public Enemy(int x, int y, int width, int height, int damage) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setDamage(damage);
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if (damage >= 0 && damage <= 100) {
			this.damage = damage;
		} else {
			System.out.println("Damage mora biti izmedju 0 i 100.");
		}
	}
}

public class Game {

	public static boolean checkCollision(Player p, Enemy e) {
		boolean preklapanjeX = p.getX() < e.getX() + e.getWidth()
				&& p.getX() + p.getWidth() > e.getX();

		boolean preklapanjeY = p.getY() < e.getY() + e.getHeight()
				&& p.getY() + p.getHeight() > e.getY();

		return preklapanjeX && preklapanjeY;
	}


	public static void decreaseHealth(Player p, Enemy e) {
		int novoZdravlje = p.getHealth() - e.getDamage();
		if (novoZdravlje < 0) {
			novoZdravlje = 0;
		}
		p.setHealth(novoZdravlje);
	}


	public static void main(String[] args) {

		Player player = new Player(0, 0, 50, 50, 100);

		Enemy enemy1 = new Enemy(30, 30, 40, 40, 30);
		Enemy enemy2 = new Enemy(200, 200, 40, 40, 50);

		System.out.println("Pocetni health igraca: " + player.getHealth());
		System.out.println();

		if (checkCollision(player, enemy1)) {
			System.out.println("Sudar sa enemy1!");
			decreaseHealth(player, enemy1);
		} else {
			System.out.println("Nema sudara sa enemy1.");
		}
		System.out.println("Health igraca: " + player.getHealth());
		System.out.println();

		if (checkCollision(player, enemy2)) {
			System.out.println("Sudar sa enemy2!");
			decreaseHealth(player, enemy2);
		} else {
			System.out.println("Nema sudara sa enemy2.");
		}
		System.out.println("Health igraca: " + player.getHealth());
		System.out.println();

		enemy1.setDamage(150);
		enemy1.setDamage(90);

		enemy2.setX(10);
		enemy2.setY(10);

		if (checkCollision(player, enemy1)) {
			decreaseHealth(player, enemy1);
		}
		System.out.println("Health igraca nakon napada jacine 90: " + player.getHealth());

		if (checkCollision(player, enemy2)) {
			System.out.println("Sada je doslo do sudara i sa enemy2.");
		}
	}
}