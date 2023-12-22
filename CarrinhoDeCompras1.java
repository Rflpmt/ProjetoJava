package ProjetoJava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


      public class CarrinhoDeCompras1 {
 
    	  
      private List<Produto> itens1;
      private float total1;
      
      public CarrinhoDeCompras1() {
      this.itens = new ArrayList<>();
      this.total = 0;
      
      }
	  public static void main(String[] args) {
	
      Scanner leia = new Scanner(System.in);
     CarrinhoDeCompras1 carrinho = new CarrinhoDeCompras1();
     
      int opcao;
     
     do {
    	 System.out.println("\n********Menu Principal********");
    	 System.out.println("1 - Adicionar Disco ao Carrinho");
    	 System.out.println("2 - Exibir Carrinho");
    	 System.out.println("3 - Finalizar Compra");
    	 System.out.println("0 - Sair");
    	 System.out.println("Escolha a opção desejada");
    	 opcao = leia.nextInt();
    	 
    	 switch(opcao) {
    	 
    	 case 1:
         adicionarDiscoAoCarrinho(leia,carrinho);
         break;
         
    	 case 2:
         carrinho.exibirCarrinhoCompras();
         break;
         
    	 case 3:
         carrinho.FinalizarCompra();
         break;
         
    	 case 0:
         System.out.println("Obrigado por nos visitar!!");
         break;
         
         default:
        System.out.println("Invalido. Tente Novamente.");
    	}
    	 
        } while(opcao !=0);
          leia.close();
	    }
        private void FinalizarCompra() {
	    } 
		private void exibirCarrinhoCompras() {
	    }

		public static <Disco> void adicionarDiscoAoCarrinho(Scanner leia, CarrinhoDeCompras1 carrinho) {
        System.out.println("Digite o ID do disco: ");
        int ID = leia.nextInt();
        
        System.out.println("Digite a descrição do Disco: ");
        leia.nextLine(); 
        String descrição = leia.nextLine();
        
        System.out.println("Digite o nome do Artista: ");
        String artista = leia.nextLine();
        
        System.out.println("Digite o preço do Disco:");
        float preço = leia.nextFloat();
        
        Disco disco = new Disco(ID, descrição, artista, preço);
        carrinho.adicionarItem(disco);
        System.out.println("Disco adicionado ao carrinho!");
        }   
    	
        private List<Produto> itens;
        private float total;

        public void CarrinhoDeCompras11() {
        this.itens1 = new ArrayList<>();
        this.total1 = 0;
} 

        public void adicionarItem(Disco disco) {
        this.itens1.add(disco);
        this.total1 += disco.getpreço();
}

        public void exibirCarrinho() {
        System.out.println("\n***********************************************************");
        System.out.println("Carrinho de Compras:");
        System.out.println("***********************************************************");

      for (Produto produto : this.itens1) {
        produto.exibirDetalhes();
      }

      System.out.println("Total: " + this.total1);
      }

      public void finalizarCompra() {
     System.out.println("Compra finalizada! Obrigado por comprar na nossa loja!");
}
	public void adicionarItem(BoogieDiscos disco) {
		// TODO Auto-generated method stub
		
	}
}