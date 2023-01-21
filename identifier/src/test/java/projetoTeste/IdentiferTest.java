package projetoTeste;

import org.junit.Before;
import org.junit.Test;
import src.Identifier;
import static org.junit.Assert.*;

public class IdentiferTest {

	private Identifier id;
	private String senha;
	@Before
	public void setUp() {
		id = new Identifier();
	}

	//cenário de teste 1: senha com 7 caracteres
	@Test
	public void teste1() {
		senha = "TesteSe";
		assertFalse(id.validateIdentifier(senha));
	}

	//cenário de teste 2: senha com 8 caracteres
	@Test
	public void teste2() {
		senha = "senhaTes";
		assertTrue(id.validateIdentifier(senha));
	}

	//cenário de teste 3: senha com 12 caracteres
	@Test
	public void teste3() {
		senha = "TestandoSenh";
		assertTrue(id.validateIdentifier(senha));
	}

	//cenário de teste 4: senha com 13 caracteres
	@Test
	public void teste4() {
		senha = "SenhaTestando";
		assertFalse(id.validateIdentifier(senha));
	}

	//cenário de teste 5: senha com caracter especial
	@Test
	public void teste5() {
		senha = "!standosen";
		assertFalse(id.validateIdentifier(senha));
	}

	//cenário de teste 6: testando valid_s com número
	@Test
	public void teste6() {
		senha = "prof3ssor";
		assertFalse(id.valid_s(senha.charAt(4)));
	}

	//cenário de teste 7: testando valid_f com número
	@Test
	public void teste7() {
		senha = "prof3ssor";
		assertTrue(id.valid_f(senha.charAt(4)));
	}

	//cenário de teste 8: senha com caracter especial
	@Test
	public void teste8() {
		senha = "Tes#S@n";
		assertFalse(id.validateIdentifier(senha));
	}

}
