package stream;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		JogadorImpl jogImpl = new JogadorImpl();
		String enderecoDir = "C:\\Users\\junior\\OneDrive\\Documentos\\estudos";
		String nomeArquivo = "jogadores.txt";
		List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo));
		
		
		if (!jogImpl.verificarArquivoExiste(Paths.get(enderecoDir))) {
			System.out.println("Arquivo não encontrado");
		} else {
			jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);
			jogImpl.imprimirJogadorMaisVelho(listaDeJogadores);
			jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
		}

	}
}
