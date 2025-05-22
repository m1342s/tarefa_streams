package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
