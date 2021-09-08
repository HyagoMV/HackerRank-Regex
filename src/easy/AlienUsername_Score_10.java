package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
Em uma galáxia muito, muito distante, em um planeta diferente do nosso, 
cada nome de usuário de computador usa o seguinte formato:

1. Deve começar com um sublinhado, _ (valor 95 ASCII) ou um ponto, . (Valor 46 ASCII).
2. O primeiro caractere deve ser seguido imediatamente por um ou mais dígitos no intervalo de 0 a 9.
3. Após algum número de dígitos, deve haver 0 ou mais letras inglesas (maiúsculas e/ou minúsculas).
4. Ele pode ser encerrado com um opcional _ (valor 95 ASCII). Observe que, se não terminar com um sublinhado, 
	não deve haver nenhum caractere após a sequência de 0 ou mais letras em inglês.

Determinadas strings, determine quais são nomes de usuário alienígenas válidos. Se uma string for um nome de 
usuário estrangeiro válido, imprima VALID em uma nova linha; caso contrário, imprima INVALID.

# Formato de entrada

A primeira linha contém um único inteiro, n, denotando o número de nomes de usuário.
Cada linha i das n linhas subsequentes contém uma string denotando um nome de usuário estrangeiro para validar.

# Restrições

1 <= n <= 100

# Formato de saída

Repita cada uma das n strings em ordem e determine se cada string é um nome de usuário estrangeiro válido ou não. 
Se um nome de usuário for um nome de usuário estrangeiro válido, imprima VALID em uma nova linha; caso contrário, imprima INVALID.

 */
public class AlienUsername_Score_10 {

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("AlienUsername_Score_10_STC0"));
			var pattern = Pattern.compile("^[_\\.]\\d+[A-Za-z]*_?$");
			try (var scanner = new Scanner(System.in)) {
				scanner.nextLine(); // skip 1 first line
				scanner.findAll(Pattern.compile("^.+$", Pattern.MULTILINE))
					.forEach(result -> {
						var matcher = pattern.matcher(result.group());
						if (matcher.matches())
							System.out.println("VALID");
						else
							System.out.println("INVALID");
					});
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
