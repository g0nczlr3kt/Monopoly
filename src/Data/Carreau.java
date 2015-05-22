package Data;


import Jeu.Monopoly;

public abstract class Carreau {
	private int _numero;
	private String _nomCarreau;
	private Monopoly _monopoly;

	public void getCarreau(int aPositionJoueur) {
		throw new UnsupportedOperationException();
	}

	public String getInfo() {
		throw new UnsupportedOperationException();
	}

	public String getNomCarreau() {
		return this._nomCarreau;
	}
}