/**********************************
Autor: Lina Marcela Céspedes G.
 **********************************/
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VehiculoControlRemoto {	
	private int posfila;
	private int poscolumna;
	private String[][] superficie;
	/**
	 * @param args
	 */
	public VehiculoControlRemoto(int n, int m){
		superficie=new String[n][m];
		posfila=0;
		poscolumna=0;
	}
	public boolean validarComando(String comando){
		Pattern pattern = Pattern.compile("^([0-9]+,[SNEO];)*[0-9]+,[SNEO]$");
		Matcher matcher=pattern.matcher(comando);
		
		return matcher.matches();
		
	}
	
	public void procesarComando(String comando){
		String []comandos=comando.split(";");
		for(int i=0; i<comandos.length;i++ )
		{
			moverVehiculo(comandos[i]);
		}
		superficie[posfila][poscolumna]="Aqui estoy";
	}

	public void moverVehiculo(String comando){		
		int desplazamiento;
		String direccion;
		StringTokenizer token= new StringTokenizer(comando);
		desplazamiento=Integer.parseInt(token.nextToken(","));
		direccion=token.nextToken();
		//System.out.print("Desplazamiento"+desplazamiento+" Direcccion"+direccion);
		switch(direccion){
		case "S":			
			for(int j=posfila; j>0; j--)
			{
			   
			   if(desplazamiento==0)
			   {
				   break;
			   }
			   desplazamiento--;
			   posfila--;
			}
			if(desplazamiento>0)
			{
				System.out.print("\n\t##Se ha detenido el avance por salir de los límites");
			}
			System.out.print("\n posicion del automovil:("+posfila+","+poscolumna+")");
					 
			break;
			
		case "N":			
			for(int j=posfila+1; j<superficie.length; j++)
			{
			   
			   if(desplazamiento==0)
			   {
				   break;
			   }
			   desplazamiento--;
			   posfila++;
			}
			if(desplazamiento>0)
			{
				System.out.print("\n\t##Se ha detenido el avance por salir de los límites");
			}
			System.out.print("\n posicion del automovil:("+posfila+","+poscolumna+")");
			break;
			
		case "E":
			for(int j=poscolumna+1; j<superficie[0].length; j++)
			{
			   
			   if(desplazamiento==0)
			   {
				   break;
			   }
			   desplazamiento--;
			   poscolumna++;
			}
			if(desplazamiento>0)
			{
				System.out.print("\n\t##Se ha detenido el avance por salir de los límites");
			}
			System.out.print("\n posicion del automovil:("+posfila+","+poscolumna+")");
			
			break;
			
		case "O":
			for(int j=poscolumna; j>0; j--)
			{
			   
			   if(desplazamiento==0)
			   {
				   break;
			   }
			   desplazamiento--;
			   poscolumna--;
			}
			if(desplazamiento>0)
			{
				System.out.print("\n\t##Se ha detenido el avance por salir de los límites");
			}
			System.out.print("\n posicion del automovil:("+posfila+","+poscolumna+")");
			break;
		default:break;
		}
	}

		
		
		
}


