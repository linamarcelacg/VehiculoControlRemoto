/**********************************
Autor: Lina Marcela Céspedes G.
 **********************************/
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		
		String comando;
		Scanner in=new Scanner (System.in); 
		System.out.print("\t**TAMAÑO DE LA SUPERFICIE** \nnumero de filas:");
		n=in.nextInt();
				
		System.out.print("numero de Columnas:");
		m=in.nextInt();
		
		VehiculoControlRemoto vcr=new VehiculoControlRemoto(n,m);
		
		System.out.print("\n***********************************************");
		System.out.print("\n\t FORMATO DEL COMANDO \nDesplazamiento=> numero de pasos \nDirección=> S:sur  N:norte O:oeste E:este  \n\nComando=> <Desplazamiento>,<Direccion> \nejemplo:5,N"+
		                  "\n\nPara varios comandos van separados por ; => <Desplazamiento>,<Direccion>;<Desplazamiento>,<Direccion> \n ejemplos:\n  5,N;4,E \n  5,E;2,N;3,S \n  5,E;2,N;3,S;1,E \n  etc.");
		System.out.print("\n***********************************************");
		do{
			
			System.out.print("\n\nDigite comando(s):");
			comando=in.next();
			if(vcr.validarComando(comando))
			{
				vcr.procesarComando(comando);
			}
			else
				System.out.print("\nError en formato de comando ");
				
		}while(comando.equalsIgnoreCase("T")==false);	
	}

}
