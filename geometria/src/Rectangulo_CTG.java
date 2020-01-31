
/**
 * @author Cristina Tremi�o Girona
 * @version 1.2
 */
public class Rectangulo_CTG extends FiguraGeometrica_CTG {
	private double l1;
	private double l2;
	
	/**
	 * Constructor
	 * @param tipoFigura indica que es un rectangulo
	 * @param lG tama�o del lado grande
	 * @param lP tama�o del lado peque�o
	 */
	public Rectangulo_CTG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Calculo del �rea del rectangulo
	 * @return devuelve el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calculo del per�metro el rectangulo
	 * @return devuelve el valor del per�metro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
