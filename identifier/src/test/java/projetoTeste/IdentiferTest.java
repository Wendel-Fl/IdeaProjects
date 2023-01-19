package projetoTeste;

import org.junit.Before;
import org.junit.Test;
import src.Identifier;

import static org.junit.Assert.assertTrue;

public class IdentiferTest {

	private Identifier id;
	@Before
	public void setUp() throws Exception {
		id = new Identifier();
	}

	//cenário de teste 1:
	@Test
	public void teste1() {
		id.validateIdentifier("teste");
		assertTrue(id.valid_s('a'));
	}

	//cenário de teste 2:
	@Test
	public void teste2() {

	}

	//cenário de teste 3:

	//cenário de teste 4:

	//cenário de teste 5:

	//cenário de teste 6:

}
