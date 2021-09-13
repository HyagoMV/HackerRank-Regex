package easy;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Tarefa
 *
 * Você tem uma string S de teste.
 * Sua tarefa é escrever uma expressão regular que corresponda apenas e exatamente a strings de form: abc.def.ghi.jkx, 
 * 	onde cada variável pode ser qualquer caractere único, exceto a nova linha.
 */
public class Matching_Anything_But_a_Newline_Score_5 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			System.out.println(Pattern.compile("(...\\.){3}...").matcher(scanner.nextLine()).matches());
		}
	}

}
