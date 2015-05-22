package Data;

import Jeu.Monopoly;
import java.util.ArrayList;
import Jeu.Monopoly;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	private Monopoly _monopoly;
	private ArrayList<Compagnie> _compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> _gares = new ArrayList<Gare>();
	private Carreau _positionCourante;
	private ArrayList<ProprieteAConstruire> _proprietesAConstruire = new ArrayList<ProprieteAConstruire>();

	public int getNbGares() {
		throw new UnsupportedOperationException();
	}

	public int getCash() {
		return this._cash;
	}

	public void avancerJoueur(int aScoreDes) {
		throw new UnsupportedOperationException();
	}

	public int getPos() {
		throw new UnsupportedOperationException();
	}

	public void recevoirLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public void payerLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public void affecterProprietaire() {
		throw new UnsupportedOperationException();
	}

	public int getNbCompagnies() {
		throw new UnsupportedOperationException();
	}
}