package streams;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ClassificaPessoas {

	public static void main(String[] args) {
		String[] listaHomemMulher={"Maria-M","Joao-H","Bruna-M","Pedro-H","Daniela-M"};
		List<String> listaMulheres=Arrays.stream(listaHomemMulher)
				.filter(p->p.endsWith("-M"))
				.map(p->p.split("-")[0])
				.collect(Collectors.toList());
		System.out.println(listaMulheres);
				
	
}
	
	
}
