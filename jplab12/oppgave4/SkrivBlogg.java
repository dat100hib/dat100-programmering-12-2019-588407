package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		try {
			PrintWriter skriver = new PrintWriter(MAPPE + filnavn);
			skriver.write(samling.toString());
			skriver.close();
			return true;
		} catch (FileNotFoundException e) {
			// feil ved skriving
			return false;
		}
//		String[] info = { "2\n", "TEKST\n1\nOle Olsen\n23-10-2019\n0\nen tekst\n",
//				"BILDE\n2\nOline Olsen\n24-10-2019\n0\net bilde\nhttp://www.picture.com/oo.jpg\n" };
		// throw new UnsupportedOperationException(TODO.method());
	}
}
