package br.com.caelum.argentum.modelo;

import org.junit.Assert;
import org.junit.Test;
import br.com.caelum.argentum.indicadores.GeradorDeSerie;
import br.com.caelum.argentum.indicadores.MediaMovelSimples;

public class SerieTemporalTest {

	@Test(expected=IllegalArgumentException.class)
	public void recebeListaNula() {
		SerieTemporal serie =
				GeradorDeSerie.criaSerie(null);
		
	}

}
