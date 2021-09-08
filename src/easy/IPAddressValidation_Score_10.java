package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
Voc� receber� N linhas de poss�veis endere�os IP. 
Voc� precisa detectar se o texto contido em cada uma das linhas representa um 
(a) endere�o IPv4 (b) endere�o IPv6 ou (c) Nenhum desses.

IPv4 foi o primeiro protocolo de Internet usado publicamente que usava endere�os de 4 bytes que permitiam 232 endere�os. 
O formato t�pico de um endere�o IPv4 � A.B.C.D, onde A, B, C e D s�o n�meros inteiros entre 0 e 255 (ambos inclusivos).

O IPv6, com 128 bits, foi desenvolvido para permitir a expans�o do espa�o de endere�amento. 
Para citar o artigo vinculado: Os 128 bits de um endere�o IPv6 s�o representados em 8 grupos de 16 bits cada. 
Cada grupo � escrito com 4 d�gitos hexadecimais e os grupos s�o separados por dois pontos (:). 
O endere�o 2001: 0db8: 0000: 0000: 0000: ff00: 0042: 8329 � um exemplo dessa representa��o. 
Se��es consecutivas de zeros ser�o deixadas como est�o.
Um valor IPv6 como "...: 0: ..." ou "...: 5: ..." � id�ntico em termos de endere�o a "...: 0000: ..." ou "... : 0005: .... ". 
Os zeros iniciais podem ser omitidos por escrito no endere�o.

# Formato de entrada

Um inteiro N tal que N <= 50. 
Isto � seguido por N linhas tal que cada texto em cada linha seja um endere�o IPv4 ou um endere�o IPv6,
ou um peda�o de texto que n�o seja igual a nenhum destes. N�o haver� texto extra ou espa�o em branco antes ou 
depois do endere�o IP em uma linha (se for um endere�o IP). O n�mero de caracteres em cada linha n�o exceder� 500.

# Formato de sa�da

N linhas.
A i-�sima linha de sa�da deve ser igual a (a) IPv4 ou (b) IPv6 ou (c) Nenhum, dependendo de como voc� detectou a i-�sima linha de entrada.
 */
public class IPAddressValidation_Score_10 {

	public static void main(String[] args) {
		try(var scanner = new Scanner(new FileInputStream("IPAddressValidation_Score_10_STC1"))) {
			scanner.nextLine(); // Ignore first line
			var pattern = Pattern.compile("((((2[0-5][0-5]|1?\\d?\\d)(\\.)){3}(2[0-5][0-5]|1?\\d?\\d))|((([a-f0-9]?[a-f0-9]?[a-f0-9]?[a-f0-9])(:)){7}([a-f0-9]?[a-f0-9]?[a-f0-9]?[a-f0-9])))$");
			while (scanner.hasNextLine()) {
				var matcher = pattern.matcher(scanner.nextLine());
				if (matcher.find()) {
					if (matcher.group(2) != null)
						System.out.println("IPv4");
					else if (matcher.group(7) != null)
						System.out.println("IPv6");
				} else
					System.out.println("Neither");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
