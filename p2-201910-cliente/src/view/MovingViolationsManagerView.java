package view;

import model.data_structures.IQueue;
import model.vo.*;

public class MovingViolationsManagerView {

	/**
	 * Constante con el numero maximo de datos maximo que se deben imprimir en consola
	 */
	public static final int N = 20;
	
	public void printMenu() {
		System.out.println("---------ISIS 1206 - Estructuras de datos----------");
		System.out.println("---------------------Proyecto 2----------------------");
		System.out.println("0. Cargar datos del semestre");
		System.out.println("1. Obtener el ranking de las N franjas horarias que tengan mas infracciones. (REQ 1A)");
		System.out.println("2. Realizar  el  ordenamiento  de  las  infracciones  por  Localizacion  Geografica. (REQ 2A)");
		System.out.println("3. Buscar las infracciones por rango de fechas (REQ 3A)");
		
		System.out.println("4. Obtener  el  ranking  de  las  N  tipos  de  infraccion  (ViolationCode)  que  tengan  mas infracciones. (REQ 1B)");		
		System.out.println("5. Realizar  el  ordenamiento  de  las  infracciones  por  Localizacion  Geografica. (REQ 2B)");
		System.out.println("6. Buscar las franjas de fecha-hora donde se tiene un valor acumulado de infracciones en un rango dado. (REQ 3B)");
		
		System.out.println("7. Obtener  la informacion de  una  localizacion dada. (REQ 1C)");
		System.out.println("8. Obtener  las infracciones  en  un  rango de  horas. (REQ 2C)");
		System.out.println("9. Obtener  el  ranking  de  las  N localizaciones geograficas con la mayor cantidad de infracciones. (REQ 3C)");
		System.out.println("10. Mostrar  una  grafica ASCII con los codigos (ViolationCode) ordenados por numero de infracciones. (REQ 4C)");
		
		System.out.println("11. Salir");
		System.out.println("Digite el numero de opcion para ejecutar la tarea, luego presione enter: (Ej., 1):");
		
	}
	
	public void printMessage(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void printResumenLoadMovingViolations(EstadisticasCargaInfracciones resultados) {
		int mes = 1;
		System.out.println("Total de Infracciones :" + resultados.darTotalInfracciones());
		for (int infraccionesXMes : resultados.darNumeroDeInfraccionesXMes())
		{
			System.out.println("Infracciones mes:" + mes + " = " + infraccionesXMes);
			mes++;
		}
		double [] minimax = resultados.darMinimax();
		System.out.println("Minimax: [" + minimax[0] + ", " + minimax[1] + "], [" + minimax[2] + ", " + minimax[3] + "]");
	}
	
	public void printReq1A(IQueue<InfraccionesFranjaHoraria> resultados) {
		for(InfraccionesFranjaHoraria vinfraFranjas: resultados) {
			System.out.println(vinfraFranjas.toString());
			
			/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
			/*
			for(VOMovingViolations vo: vinfraFranjas.getListaInfracciones()) {
				System.out.println(vo.toString());
			}
			*/
		}
	}
	
	public void printReq2A(InfraccionesLocalizacion resultado) {
		System.out.println(resultado.toString());
		
		/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
		/*
		for(VOMovingViolations v: resultado.getListaInfracciones()) {
			System.out.println(v.toString());
		}
		*/
	}
	
	public void printReq3A(IQueue<InfraccionesFecha> resultados) {
		for(InfraccionesFecha infraFechas: resultados) {
			System.out.println(infraFechas.toString());
			/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
			/*
			for(VOMovingViolations vo: infraFechas.getListaInfracciones()) {
				System.out.println(vo.toString());
			}
			*/
		}
	}
	
	public void printReq1B(IQueue<InfraccionesViolationCode> resultados) {
		for(InfraccionesViolationCode infraVioCode: resultados) {
			System.out.println(infraVioCode.toString());
			/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
			/*
			for(VOMovingViolations vo: infraVioCode.getListaInfracciones()) {
				System.out.println(vo.toString());
			}
			*/
		}
	}
	
	public void printReq2B(InfraccionesLocalizacion resultado) {
		System.out.println(resultado.toString());
		/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
		/*
		for(VOMovingViolations v: resultado.getListaInfracciones()) {
			System.out.println(v.toString());
		}
		*/
	}
	
	
	public void printReq3B(IQueue<InfraccionesFechaHora> resultados) {
		for(InfraccionesFechaHora infraFechas: resultados) {
			System.out.println(infraFechas.toString());
			/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
			/*
			for(VOMovingViolations vo: infraFechas.getListaInfracciones()) {
				System.out.println(vo.toString());
			}
			*/
		}
	}
	
	public void printReq1C(InfraccionesLocalizacion resultado) {
		System.out.println(resultado.toString());
		/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
		/*		
		for(VOMovingViolations v: resultado.getListaInfracciones()) {
			System.out.println(v.toString());
		}
		*/
	}
	
	public void printReq2C(InfraccionesFranjaHorariaViolationCode resultado) {
		System.out.println(resultado.toString());
		
		
		for(InfraccionesViolationCode v: resultado.getInfViolationCode()) {
			System.out.println(v.toString());

			/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
			/*
			for(VOMovingViolations vv: v.getListaInfracciones()) {
				System.out.println(vv.toString());
			}
			*/
		}

		/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
		/*
		for(VOMovingViolations v: resultado.getListaInfracciones()) {
			System.out.println(v.toString());
		}
		*/
	}
	
	
	public void printReq3C(IQueue<InfraccionesLocalizacion> resultados) {
		for(InfraccionesLocalizacion infraLoc: resultados) {
			System.out.println(infraLoc.toString());
			/* Detalle de las infracciones (Se requiere SOLO en caso de validacion)*/
			/*		
			for(VOMovingViolations vo: infraLoc.getListaInfracciones()) {
				System.out.println(vo.toString());
			}
			*/
		}
	}
	
	
	public void printReq4C(Contenedora<InfraccionesViolationCode> resultados) {
		//TODO La estructura Contenedora depende del metodo que retorna el resultado
		//TODO Imprimir grafica ASCII con los codigos ordenados (de mayor a menor) por el total de sus infracciones 
	}
	
	
	
	
	
	
}
