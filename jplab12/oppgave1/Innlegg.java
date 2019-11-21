package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
		// TODO 
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id= id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		// TODO - START
		
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		return bruker;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		return dato;
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {
		return id;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {
		return likes;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public void doLike () {
		
		likes++;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if( id == innlegg.getId())
			return true;
		else
			return false;
	}
		
		//throw new UnsupportedOperationException(TODO.method());

	
	
	@Override
	public String toString() {
		
	String str;
		
		
		// TODO - start
		str = id +"\n" + bruker + "\n" + dato + "\n" + likes +"\n";
		
		return str;
		
		//throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		return "";
		
		//throw new UnsupportedOperationException(TODO.method());
				
	}
}
