package exo5;

public class Article {
	
	private String ref;
	private String designation;
	private int prix;
	
	public String getRef() {
		return ref;
			
	}
	
	public String getDes() {
		return designation;
			
	}
	
 public int getPrix() {
	 return prix;
	 
 }
 
 public void setPrix(int prix) {
	 this.prix = prix; 
 }
	
	Article(String ref,  String designation, int prix){
		
		this.ref = ref;
		this.designation = designation;
		this.prix = prix; 
	}

}

