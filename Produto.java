package ProjetoJava;

      abstract class Produto {

      private int ID;
      private String descrição;
      private float preço;
      
      public Produto(int Id, String descrição, float preço) {
      
      this.ID = Id;
      this.descrição = descrição;
      this.preço = preço;
      }
      
      
      public int getId() {
      return ID;
      }
      public void setID(int ID){
      this.ID = ID;
      }
  
      
      public String getdescrição() {
      return descrição;  
      }
      public void setdescrição(String descrição) {
      this.descrição = descrição;
      }
      
      
      public float getpreço() {
      return preço;
      }
      public void setpreço(float preço) {
      this.preço = preço;
      }
      
      public void exibirDetalhes() {
	  }    
      }