package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
Você receberá N linhas de possíveis endereços IP. 
Você precisa detectar se o texto contido em cada uma das linhas representa um 
(a) endereço IPv4 (b) endereço IPv6 ou (c) Nenhum desses.

IPv4 foi o primeiro protocolo de Internet usado publicamente que usava endereços de 4 bytes que permitiam 232 endereços. 
O formato típico de um endereço IPv4 é A.B.C.D, onde A, B, C e D são números inteiros entre 0 e 255 (ambos inclusivos).

O IPv6, com 128 bits, foi desenvolvido para permitir a expansão do espaço de endereçamento. 
Para citar o artigo vinculado: Os 128 bits de um endereço IPv6 são representados em 8 grupos de 16 bits cada. 
Cada grupo é escrito com 4 dígitos hexadecimais e os grupos são separados por dois pontos (:). 
O endereço 2001: 0db8: 0000: 0000: 0000: ff00: 0042: 8329 é um exemplo dessa representação. 
Seções consecutivas de zeros serão deixadas como estão.
Um valor IPv6 como "...: 0: ..." ou "...: 5: ..." é idêntico em termos de endereço a "...: 0000: ..." ou "... : 0005: .... ". 
Os zeros iniciais podem ser omitidos por escrito no endereço.

# Formato de entrada

Um inteiro N tal que N <= 50. 
Isto é seguido por N linhas tal que cada texto em cada linha seja um endereço IPv4 ou um endereço IPv6,
ou um pedaço de texto que não seja igual a nenhum destes. Não haverá texto extra ou espaço em branco antes ou 
depois do endereço IP em uma linha (se for um endereço IP). O número de caracteres em cada linha não excederá 500.

# Formato de saída

N linhas.
A i-ésima linha de saída deve ser igual a (a) IPv4 ou (b) IPv6 ou (c) Nenhum, dependendo de como você detectou a i-ésima linha de entrada.
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
