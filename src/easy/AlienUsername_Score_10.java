package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
Em uma gal�xia muito, muito distante, em um planeta diferente do nosso, 
cada nome de usu�rio de computador usa o seguinte formato:

1. Deve come�ar com um sublinhado, _ (valor 95 ASCII) ou um ponto, . (Valor 46 ASCII).
2. O primeiro caractere deve ser seguido imediatamente por um ou mais d�gitos no intervalo de 0 a 9.
3. Ap�s algum n�mero de d�gitos, deve haver 0 ou mais letras inglesas (mai�sculas e/ou min�sculas).
4. Ele pode ser encerrado com um opcional _ (valor 95 ASCII). Observe que, se n�o terminar com um sublinhado, 
	n�o deve haver nenhum caractere ap�s a sequ�ncia de 0 ou mais letras em ingl�s.

Determinadas strings, determine quais s�o nomes de usu�rio alien�genas v�lidos. Se uma string for um nome de 
usu�rio estrangeiro v�lido, imprima VALID em uma nova linha; caso contr�rio, imprima INVALID.

# Formato de entrada

A primeira linha cont�m um �nico inteiro, n, denotando o n�mero de nomes de usu�rio.
Cada linha i das n linhas subsequentes cont�m uma string denotando um nome de usu�rio estrangeiro para validar.

# Restri��es

1 <= n <= 100

# Formato de sa�da

Repita cada uma das n strings em ordem e determine se cada string � um nome de usu�rio estrangeiro v�lido ou n�o. 
Se um nome de usu�rio for um nome de usu�rio estrangeiro v�lido, imprima VALID em uma nova linha; caso contr�rio, imprima INVALID.

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
