package aeroporto;

public class TesteAeroporto {
	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto();
		ListaLigada lista = new ListaLigada();

		aeroporto.setSigla("GRU");
		lista.adicionaInicio(aeroporto);


		Aeroporto aeroporto1 = new Aeroporto();

		aeroporto1.setSigla("URU");
		lista.adicionaInicio(aeroporto1);

		Aeroporto aeroporto2 = new Aeroporto();

		aeroporto2.setSigla("RUU");
		lista.adicionaFinal(aeroporto2);

		Aeroporto aeroporto3 = new Aeroporto();

		aeroporto3.setSigla("OPA");
		lista.adicionaFinal(aeroporto3);

		Aeroporto aeroporto4 = new Aeroporto();

		aeroporto4.setSigla("LOL");
		lista.adicionaPos(aeroporto4, 1);
		lista.removeFinal();
		lista.removePos(1);
		lista.contem("RUU");
		lista.exibir();

	}
}
