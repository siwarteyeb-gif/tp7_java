package tp8;

public class AssietteCar extends Assiette {
	private double cote;
	public AssietteCar(int annee,double cote) {
		super(annee);
		this.cote=cote;
	}
	public double calculSurface() {
		return cote*cote;
	}
	public double calculTotal() {
		return super.calculTotal()*5;
}}
