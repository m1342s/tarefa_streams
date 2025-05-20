package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClassificaPessoas {

	public static void main(String[] args) {
		String[] listaHomemMulher={"Maria-M","Joao-H","Bruna-M","Pedro-H","Daniela-M"};
		List<String> separacao=(List<String>) Arrays.stream(listaHomemMulher).map(pessoa->{
			String[] partes=pessoa.split("-");
			String nome= partes[0];
			String genero=partes[1];
			if(genero.equals("M")) {
				 return nome;
			}
			else if(genero.equals("H")) {
				return nome;
			}
			
			
		});
		.collect(Collectors.toList());
	
}
}
