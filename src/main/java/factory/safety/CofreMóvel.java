package factory.safety;

public class CofreMóvel implements ArmazenamentoSeguro {
	@Override
	public void armazenar(Object objeto) {
		System.out.println("Armazenando [" + objeto +"] no CofreMóvel." );
		
	}

}
