package ProjetoJava;

import java.util.Scanner;

public class LojaDeDiscos {


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
         
         
         switch (opcao) {
         
         case 1:
         adicionarDiscoAoCarrinho(leia, carrinho);
         break;
             
         case 2:
         carrinho.exibirCarrinho();
         break;
             
         case 3:
         carrinho.finalizarCompra();
         break;
         
         case 0:
         System.out.println("Obrigado por nos visitar!!");
         break;
         
         default:
         System.out.println("Invalido. Tente Novamente.");       
         }
         } while (opcao !=0);
         leia.close();
         }


	   public static void adicionarDiscoAoCarrinho(Scanner leia, CarrinhoDeCompras1 carrinho) {
	   System.out.println("Digite o ID do disco: ");
	   int ID = leia.nextInt();

	   System.out.println("Digite a descrição do Disco: ");
	   leia.nextLine(); 
	   String descrição = leia.nextLine();

	   System.out.println("Digite o nome do Artista: ");
	   String artista = leia.nextLine();

	   System.out.println("Digite o preço do Disco:");
	   float preço = leia.nextFloat();   
		   
	   BoogieDiscos disco = new BoogieDiscos(ID, descrição, artista, preço);
       carrinho.adicionarItem(disco);   
	   }
	   }