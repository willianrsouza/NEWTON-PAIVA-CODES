public abstract class Figura implements Prototype {

	protected int x;
	protected int y;
	protected int raio;

	public Figura(int x, int y, int raio) {
		super();
		this.x = x;
		this.y = y;
		this.raio = raio;
	}

	public Figura(Figura source) {
		this.x = source.x;
		this.y = source.y;
		this.raio = source.raio;
	}

	public String toString() {
		return "Figura [x = " + x + ", y = " + y + ", raio =" + raio + "]";
	}

}