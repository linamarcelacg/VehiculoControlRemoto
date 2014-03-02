Autor: Lina Marcela Céspedes García
Cédula:1121869936

INSTRUCCIONES:
El proyecto fue realizado en eclipse Juno Service Release 2 y Java 1.70_17 
Para Ejecutar el proyecto se oprimirá la tecla Ctrl+F11.

Al iniciar el programa este pedira el tamaño de la superficie (nxm) en donde n=fila y m=columnas. Se tiene encuenta como primera casilla la posición 0,0, es decir que si se digita una matriz 5X3, existira la fila0 fila1 fila2 fila3 fila4 y las columnas columna0 colunma1 columna2. 

Despues de digitar el tamaño de la superficie se procederá a dar las intrucciones para  mover el carro, teniendo el formato que se presenta a continuación:

***********************************************
	 FORMATO DEL COMANDO 
Desplazamiento=> numero de pasos 
Dirección=> S:sur  N:norte O:oeste E:este  

Comando=> <Desplazamiento>,<Direccion> 
ejemplo:5,N

Para varios comandos van separados por ; => <Desplazamiento>,<Direccion>;<Desplazamiento>,<Direccion> 
 ejemplos:
  5,N;4,E 
  5,E;2,N;3,S 
  5,E;2,N;3,S;1,E 
  etc.
***********************************************

El Desplazamiento es el numero de pasos(casillas) a mover en la superficie, si se desea mover 5 pasos al sur, el comando será 5,S

Para SALIR, digitar la letra: T 



