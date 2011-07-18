package calculadora;

import java.util.ArrayList;

import numero.Numero;

public class Calculadora {

	private ArrayList<Numero> numeros;
	
	public Calculadora(){
		numeros = new ArrayList<Numero>();
	}
	
	public void registrarNumero(int dato) {
		Numero num = new Numero(dato);
		numeros.add(num);
	}

	public ArrayList<Numero> getNumeros() {
		return numeros;
	}

	public double obtenerSumatoria() {
		double sum = 0; 
		for(Numero numero: numeros){
			sum += numero.getValor();
		}
		/*
		 for(int i=0;i< numeros.size();i++ ){
			sum = sum + numeros.get(i).getValor(); 
		}*/
		
		return sum;
	}
	
	public double obtenerPromedio() {
		/*
		double prom = 0; 
		prom = (obtenerSumatoria() / numeros.size());		
		return prom;
		*/
		double rpta = 0;
		if(!numeros.isEmpty()){
			double sum = 0;
			for(Numero numero: numeros){
				sum += numero.getValor();
			}
			rpta = sum / numeros.size();
		}
		
		return rpta;
		
	}
	public double obtenerMin() {
		double min = 0;
		if(!numeros.isEmpty()){
			min = numeros.get(0).getValor();
			for(Numero numero: numeros){
				if (numero.getValor() < min){
					min = numero.getValor();
				}
			}
		}
		return min;
	}
	
	public double obtenerMax() {
		double max = 0;
		if(!numeros.isEmpty()){
			max = numeros.get(0).getValor();
			for(Numero numero: numeros){
				if (numero.getValor() > max){
					max = numero.getValor();
				}
			}
		}
		return max;
	}
	
	public double obtenerMinNegativo() {
		double minNeg = 0;
		if(!numeros.isEmpty()){
			
			//minNeg = numeros.get(0).getValor();
			
			for(Numero numero: numeros){
				if ((numero.getValor() < 0) || ( minNeg < numero.getValor()))
				{
					minNeg = numero.getValor();
				}
			}
		}
		return minNeg;
	}
	
	public double obtenerMaxNegativos() {
		double maxNeg = -9999;
		double aux = 0;
		if(!numeros.isEmpty()){
			
			//maxNeg = numeros.get(0).getValor();
			
			for(Numero numero: numeros){
				if (numero.getValor() < 0){
					aux = numero.getValor();
				
				if ( aux > maxNeg)
				{
					maxNeg = numero.getValor();
				}
				}
			}
		}
		return maxNeg;
	}
	

}
