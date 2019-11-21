package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {
		
		private  Innlegg[] samling;
		private int antall;

	public Blogg() {
		
		samling = new Innlegg[20];
		antall = 0;
		
	
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
	samling = new Innlegg[lengde];
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		
		return antall;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		
		return samling;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false; 
		int pos = 0;
		while( pos < antall && !funnet) {
			if(samling[pos].getId() == innlegg.getId())
				funnet = true ;
			else pos++;}
		if( funnet )
			return pos;
		else return-1;
		}
		//throw new UnsupportedOperationException(TODO.method());
	

	public boolean finnes(Innlegg innlegg) {
		
	
		
		return (finnInnlegg(innlegg) >= 0);
			
		
		
		
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		if(antall < samling.length)
			return true;
		else
			return false;
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny && antall < samling.length)
		{samling[antall] = innlegg;
		antall++;
		return true;
		}else 
			return false ;
		}
		//throw new UnsupportedOperationException(TODO.method());
	
	
	public String toString() {
		String str = Integer.toString(getAntall())+"\n";
		for(int i = 0; i < antall; i++) {
			str +=  samling[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
return false;
		//throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		return false;
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		return null;
		//throw new UnsupportedOperationException(TODO.method());

	}
}