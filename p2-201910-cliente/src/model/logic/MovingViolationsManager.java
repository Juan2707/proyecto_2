package model.logic;

import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import model.data_structures.IQueue;
import model.data_structures.SeparateChainingHashST;
import model.vo.EstadisticaInfracciones;
import model.vo.EstadisticasCargaInfracciones;
import model.vo.InfraccionesFecha;
import model.vo.InfraccionesFechaHora;
import model.vo.InfraccionesFranjaHoraria;
import model.vo.InfraccionesFranjaHorariaViolationCode;
import model.vo.InfraccionesLocalizacion;
import model.vo.InfraccionesViolationCode;
import model.vo.VOMovingViolations;
import view.MovingViolationsManagerView;

public class MovingViolationsManager {

	//TODO Definir atributos necesarios
	SeparateChainingHashST<String, VOMovingViolations> datos;
	
	private MovingViolationsManagerView view ;
	
	private String[] listaMes;
	/**
	 * Metodo constructor
	 */
	public MovingViolationsManager()
	{
		view = new MovingViolationsManagerView();
		
		datos = new SeparateChainingHashST();
		
		listaMes = new String[]{"January" , "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		//TODO inicializar los atributos
	}
	
	/**
	 * Cargar las infracciones de un semestre de 2018
	 * @param numeroSemestre numero del semestre a cargar (1 o 2)
	 * @return objeto con el resultado de la carga de las infracciones
	 */
	public EstadisticasCargaInfracciones loadMovingViolations(int numeroSemestre) {
		int limSup;
		int limInf;
		int total=0;
		int[] numPorMeses= new int[6];
		if ( numeroSemestre == 1 ){
			limSup = 6;
			limInf = 0;
		}
		else{
			limSup = 12;
			limInf = 6;
		}
		String dataFile;
		int indicador=0;
		try{
			for(int f = limInf ; f < limSup ; f++){
				view.printMessage(listaMes[f]);
				dataFile = "." + File.separator + "data" + File.separator + "Moving_Violations_Issued_in_" + listaMes[f] + "_2018.csv";
				FileReader n1 = new FileReader(dataFile);
				CSVReader n2 = new CSVReaderBuilder(n1).withSkipLines(1).build();
				List <String[]> info = n2.readAll();
				int carga2=0;
				for(int j = 0 ; j < info.size() ; j++){
					
					if(info.get(j).length>17){
						VOMovingViolations infraccion = new VOMovingViolations(info.get(j)[0], info.get(j)[1], info.get(j)[2], info.get(j)[3], info.get(j)[4], info.get(j)[5], info.get(j)[6], info.get(j)[7], info.get(j)[8], info.get(j)[9], info.get(j)[10], info.get(j)[11], info.get(j)[12], info.get(j)[14], info.get(j)[15], info.get(j)[16], info.get(j)[17]);
						datos.put(info.get(j)[14], infraccion);
					}
					else{
						VOMovingViolations infraccion = new VOMovingViolations(info.get(j)[0], info.get(j)[1], info.get(j)[2], info.get(j)[3], info.get(j)[4], info.get(j)[5], info.get(j)[6], info.get(j)[7], info.get(j)[8], info.get(j)[9], info.get(j)[10], info.get(j)[11], info.get(j)[12], info.get(j)[13], info.get(j)[14], info.get(j)[15], info.get(j)[16]);
					datos.put(info.get(j)[14], infraccion);
					}
					carga2++;
					//cargar

					}
				numPorMeses[indicador]=carga2;
				n1.close();
				n2.close();

			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		EstadisticasCargaInfracciones esto=new EstadisticasCargaInfracciones(total,6,numPorMeses);
		return esto;
	}

	/**
	  * Requerimiento 1A: Obtener el ranking de las N franjas horarias
	  * que tengan más infracciones. 
	  * @param int N: Número de franjas horarias que tienen más infracciones
	  * @return Cola con objetos InfraccionesFranjaHoraria
	  */
	public IQueue<InfraccionesFranjaHoraria> rankingNFranjas(int N)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 2A: Consultar  las  infracciones  por
	  * Localización  Geográfica  (Xcoord, Ycoord) en Tabla Hash.
	  * @param  double xCoord : Coordenada X de la localizacion de la infracción
	  *			double yCoord : Coordenada Y de la localizacion de la infracción
	  * @return Objeto InfraccionesLocalizacion
	  */
	public InfraccionesLocalizacion consultarPorLocalizacionHash(double xCoord, double yCoord)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 3A: Buscar las infracciones por rango de fechas
	  * @param  LocalDate fechaInicial: Fecha inicial del rango de búsqueda
	  * 		LocalDate fechaFinal: Fecha final del rango de búsqueda
	  * @return Cola con objetos InfraccionesFecha
	  */
	public IQueue<InfraccionesFecha> consultarInfraccionesPorRangoFechas(LocalDate fechaInicial, LocalDate fechaFinal)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 1B: Obtener  el  ranking  de  las  N  tipos  de  infracción
	  * (ViolationCode)  que  tengan  más infracciones.
	  * @param  int N: Numero de los tipos de ViolationCode con más infracciones.
	  * @return Cola con objetos InfraccionesViolationCode con top N infracciones
	  */
	public IQueue<InfraccionesViolationCode> rankingNViolationCodes(int N)
	{
		
		return null;		
	}

	
	/**
	  * Requerimiento 2B: Consultar las  infracciones  por  
	  * Localización  Geográfica  (Xcoord, Ycoord) en Arbol.
	  * @param  double xCoord : Coordenada X de la localizacion de la infracción
	  *			double yCoord : Coordenada Y de la localizacion de la infracción
	  * @return Objeto InfraccionesLocalizacion
	  */
	public InfraccionesLocalizacion consultarPorLocalizacionArbol(double xCoord, double yCoord)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 3B: Buscar las franjas de fecha-hora donde se tiene un valor acumulado
	  * de infracciones en un rango dado [US$ valor inicial, US$ valor final]. 
	  * @param  double valorInicial: Valor mínimo acumulado de las infracciones
	  * 		double valorFinal: Valor máximo acumulado de las infracciones.
	  * @return Cola con objetos InfraccionesFechaHora
	  */
	public IQueue<InfraccionesFechaHora> consultarFranjasAcumuladoEnRango(double valorInicial, double valorFinal)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 1C: Obtener  la información de  una  addressId dada
	  * @param  int addressID: Localización de la consulta.
	  * @return Objeto InfraccionesLocalizacion
	  */
	public InfraccionesLocalizacion consultarPorAddressId(int addressID)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 2C: Obtener  las infracciones  en  un  rango de
	  * horas  [HH:MM:SS  inicial,HH:MM:SS  final]
	  * @param  LocalTime horaInicial: Hora  inicial del rango de búsqueda
	  * 		LocalTime horaFinal: Hora final del rango de búsqueda
	  * @return Objeto InfraccionesFranjaHorariaViolationCode
	  */
	public InfraccionesFranjaHorariaViolationCode consultarPorRangoHoras(LocalTime horaInicial, LocalTime horaFinal)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 3C: Obtener  el  ranking  de  las  N localizaciones geográficas
	  * (Xcoord,  Ycoord)  con  la mayor  cantidad  de  infracciones.
	  * @param  int N: Numero de las localizaciones con mayor número de infracciones
	  * @return Cola de objetos InfraccionesLocalizacion
	  */
	public IQueue<InfraccionesLocalizacion> rankingNLocalizaciones(int N)
	{
		// TODO completar
		return null;		
	}
	
	/**
	  * Requerimiento 4C: Obtener la  información  de  los códigos (ViolationCode) ordenados por su numero de infracciones.
	  * @return Contenedora de objetos InfraccionesViolationCode.
	  // TODO Definir la estructura Contenedora
	  */
	public Contenedora<InfraccionesViolationCode> ordenarCodigosPorNumeroInfracciones()
	{
		// TODO completar
		// TODO Definir la Estructura Contenedora
		return null;		
	}


}
