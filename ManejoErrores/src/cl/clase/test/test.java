package cl.clase.test;

public class test {

	public static void main(String[] args)  {
		
		try {
			double a=10;
			if(a==0) {
				throw new Exception("El valor de a es 0"); //Forzar un error
			}else {
				double resp = 20 / a;
				System.out.println("El resultado es " + resp);
			}
			//System.out.println(obtenernumero());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Codigo finally");
		}
		
	}
	
	public static int obtenernumero() throws Exception {
		//throws Exception : Indica que el error lo capture el metodo que lo llama
		
		int a = Integer.parseInt("prueba");
		return a;
	}
	
}
