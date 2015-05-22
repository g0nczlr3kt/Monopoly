package Data;


import Data.Joueur;

public abstract class CarreauPropriete extends Carreau {
	private int _loyerBase;
	private int _prixAchat;
	private Joueur _proprietaire;

	public int getPrixAchat() {
		return this._prixAchat;
	}

	public void affecterProprietaire() {
		throw new UnsupportedOperationException();
	}
}