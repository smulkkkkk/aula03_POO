package Principal;

public class principal {
	/**
	public static void main(String[] args) {
		 int avaliacao = 0;
		 
		 switch (avaliacao) {
		 case 5:
			 System.out.println("Excelente");
			 break;
		 case 4:
			 System.out.println("Bom");
			 break;
		 case 3:
			 System.out.println("Regular");
			 break;
		 case 2:
			 System.out.println("Ruim");
			 break;
		 case 1:
			 System.out.println("Péssimo");
			 break;
		 default:
			 System.out.println("Sem resposta");
			 break;
		 }
	 }*/
	    public static void ParImpar () {
	        int pares = 0;
	        int impares = 0;

	        for (int i = 0; i <= 30; i++) {
	            if (i % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.println("Quantidade de pares: " + pares);
	        System.out.println("Quantidade de ímpares: " + impares);
	    }
	
	    public static void MultiplosDeDois() {
	        int contador = 0;

	        for (int i = 1; i <= 22; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i + " - Java");
	                contador++;
	            }
	        }

	        System.out.println("Total de múltiplos de 2 encontrados: " + contador);
	    }
	}

