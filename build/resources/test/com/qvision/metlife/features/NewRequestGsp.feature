Feature: I want to create a new customer

  Scenario: New custumer for Gsp
    Given I want create a new custumer for the webpages
    When We are go to type in the form
    | PrimerNombre | SegundoNombre | TercerNombre | PrimerApellido | SegundoApellido | FechaDeNacimiento | Nacionalidad | Genero | ClienteFumador | EstadoCivil | Ocupacion                     | TipoDeIdentificacion | NumeroDeIdentificacion | IngresosMensuales | Email                | TipoDeTelefono | NumeroDetelefono |
    | Pitter       |               |              | Vargas         |                 | 10/11/1975        | COLOMBIA     | M      | Si             | Soltero     | Chef / cocinero principal     | Cedula               |             43276591387|           25000000| ngomez@gmail.com     | Celular        |       3282556954 |
    
    And New necessities analysis
    | SalarioDeseado | IngresoMensual | SemanasCotizadas | EdadPension | 
    | 3000000        | 25000000       |    580           | 65          |  
    
    And New quotation
    | PrimerNombreFam| SegundoNombreFam | TercerNombreFam | PrimerApellidoFam | SegundorApellidoFam|RelacionFam |OcupacionFam |FechaNacimientoFam|Genero |TipoDocumentoFam     |DocumentoFam|MontoInvertir|TipoPago    |ValorAsegurado|AnhosFaltantes|
    | Julio          | Junior           |                 | Segura            |                    |Hijo (a)    |Estudiante   |05/01/2014        |M      |Tarjeta de Identidad |1000000002  |30000000     |PRIMA ÚNICA |3000000       |10            |
    
     And New request
    | PaisNac    |  DeptoNac     |  CiudadNac  | DireccionResid | PaisResid   |DeptoResid    | CiudadResid |TelefonoResid |TipoBeneficiario | TipoDocBene | DocumentoBene | PrimerNomBene| SegundoNomBene | PrimerApellBene | SegundoApellBene |   RelacionAsegurado    | FechaNaciBene | GeneroBene |PlanBene  |Porcentaje |Estatura | Peso |  TipoActividad  | NitEmpresa | NombreEmpresa | ActividadEcoEmpresa  | DireTrabajo   | PaisTrabajo | DeptoTrabajo | CiudadTrabajo |TeleEmpresa |ActEconoPrincipal |OtrosIngresos |PaisOrigenIngresos |TotalActivos|EgresosMensuales|TotalPasivos | OrigenFondosAseg|
    | COLOMBIA   |  CUNDINAMARCA | BOGOTA D.C. |  Cr7call34	    | COLOMBIA    |CUNDINAMARCA  | BOGOTA D.C. |4567098       |  Primario       | Cedula      |	1903486792		|	Julia 			 |								|		Cortez  			|									 |	Cónyugue/Compañero(a)	|	09/06/1987    |	  F        | Todas    |		100   	|	190	    |  87  |	Asalariado     | 900345708  |	Tecno SAS     | Seguros de vida      |Dg 23  N 15 23 |  COLOMBIA	 | CUNDINAMARCA | BOGOTA D.C.   |	4345123 	 |	Asalariados 		| 5000000      |   COLOMBIA				 | 80000000   | 8000000        | 3000000     |	Ahorros				 | 
    
    And New approval sgs
    Then I validate the new request
    