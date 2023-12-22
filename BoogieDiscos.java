package ProjetoJava;

public class BoogieDiscos {

   private int Id;
   private String Titulo;
   private String Artista;
   private float Preco;
 
   public BoogieDiscos(int Id, String Titulo, String Artista, float Preco) {
	  
	   this.Id = Id;
	   this.Titulo = Titulo;
	   this.Artista = Artista;
	   this.Preco = Preco;
       }
       
       public int getId() {
       return Id;
       }
       public void setId(int Id) {
       this.Id = Id;
       }
      
       public String getTitulo() {
       return Titulo;
       }
       public void setTitulo(String Titulo) {
       this.Titulo = Titulo;
       }
   
       public String getArtista() {
       return Artista;
       }
       public void setArtista(String Artista) {
       this.Artista = Artista;
       }
       
       public float getPreco() {
       return Preco;
       }
       public void setPreco(float Preco) {
       this.Preco = Preco;
       }
       
   
       public void exibirDetalhes() {
    	   System.out.println("\n************************************************");
    	   System.out.println("***************Detalhes do Disco:*****************");
    	   System.out.println("**************************************************");
    	   System.out.println("               Id:                 " + this.Id     );
    	   System.out.println("               Titulo:             " + this.Titulo );
    	   System.out.println("               Artista:            " + this.Artista);
    	   System.out.println("               Preço:              " + this.Preco  );
       }      
       }
   
   