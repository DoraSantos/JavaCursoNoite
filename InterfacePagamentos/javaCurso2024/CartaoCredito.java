package javaCurso2024;

	public class CartaoCredito implements InterfacePagamento{
		public void realizarPagamento() {
			System.out.println("Pagamento realizado com sucesso");
			System.out.println("Método utilizado: Cartao de Credito");
		}
}
