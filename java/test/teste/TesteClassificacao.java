package teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TesteClassificacao {

@Test
public void test() {
String[] listaMulheres= {"Bruna-M","Letícia-M","Fernanda-M"};
for(String nome : listaMulheres) {
	assertTrue(nome.endsWith("-M"));
}
}

}
