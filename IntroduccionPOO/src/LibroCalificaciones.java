/**
 * Clase libroCalificaciones que utiliza un arreglo bidimensional para almacenar calificaciones
 */
public class LibroCalificaciones {
    
    private String nombreDelCurso; //nombre del curso que representa este libroCalificaciones
    private int[][] calificaciones; //arreglo bidimensional de calificaciones de estudiantes
    
    //El constructor con dos arguentos inicializa nombreDelCurso y el arreglo calificaciones
    public LibroCalificaciones(String nombreDelCurso, int[][]calificaciones){
       
        this.nombreDelCurso = nombreDelCurso;
       this.calificaciones = calificaciones;
    }
    
    /**
     * Método para establecer el nombre del curso
     */
    public void setNombreDelCurso(String nombreDelCurso){
       this.nombreDelCurso = nombreDelCurso;
    }
    
    public String getNombreDelCurso(){
       return this.nombreDelCurso;
    }
    
    //realiza varias operaciones sobre los datos
    public void procesaCalificaciones(){
       //imprime el arreglo de calificaciones
       imprimirCalificaciones();
       
       //Llama a los métodos obtenerMinima y obtenerMaxima
       System.out.printf("%n%s %d%n%s %d",
               "La calificación más baja en el libro de calificaciones es:",
               obtenerMinima(),
               "La calificación más alta en el libro de calificaciones es:",
               obtenerMaxima());
       
        System.out.println("");
       
       //imprime gráfico de distribución de todas las calificaciones para todas las pruebas
       imprimirGraficoBarras();
    }//fin del método procesaCalificaciones
    
    //busca la calificación más baja
    public int obtenerMinima(){
       //asuma que el primer elemento del arreglo calificaciones es el más bajo
       int califBaja = calificaciones[0][0];
       
       //itera a través de las filas del arreglo calificaciones
       for(int[] califEstudiantes : calificaciones){
           
           //itera a través de las columnas de la fila actual
           for(int calificacion : califEstudiantes){
              //si la calificación es mayor que califBaja, la asigna a califBaja
               if (calificacion < califBaja) {
                   califBaja = calificacion;
               }
           }
       
       }
       
       return califBaja;
    }
    
    //busca la calificación más alta
    public int obtenerMaxima(){
       //asuma que el primer elemento del arreglo calificaciones es el más alto
       int califAlta = calificaciones[0][0];
       
       //itera a través de las filas del arreglo calificaciones
       for(int[]califEstudiantes : calificaciones){
          //itera a través de las columnas de la fila actual
          for(int calificacion : califEstudiantes){
             //si la calificación es mayor que califAlta, la asigna a califAlta
              if (calificacion > califAlta) {
                  califAlta = calificacion;
              }
          }
       }
       return califAlta;
    }
    
    //imprime el contenido del arreglo calificaciones
    public void imprimirCalificaciones(){
        System.out.printf("Las calificaciones son: %n%n");
        
        System.out.print("            ");
        
        //crea un encabezado de columna para cada una de las pruebas
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba%d ", prueba + 1);
        }
        
        System.out.println("Promedio"); //encabezado de columna de promedio de estudiantes
        
        //crea filas/columnas de texto que representan el arreglo calificaciones
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);
            
            for (int prueba : calificaciones[estudiante]) { //imprime calificaciones de estudiante
                System.out.printf("%8d", prueba);
            }
            
            //llama al método obtenerPromedio para calcular la calificación promedio del estudiante
            //pasa fila de calificaciones como argumento para obtenerPromedio
            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n", promedio);
        }
    }
    
    //determina la calificación promedio para un conjunto específico de calificaciones
    public double obtenerPromedio(int[] conjuntoDeCalif){
       int total = 0;
       
       //suma las calificaciones para un estudiante
       for(int calificacion : conjuntoDeCalif){
          total += calificacion;
       }
       
       //devuelve el promedio de calificacion
       
       return (double) total / conjuntoDeCalif.length;
    }
    
    //imprime gráfico de barras que muestra la distribución de calificaciones en general
    public void imprimirGraficoBarras(){
        System.out.println("Distribución de calificaciones en general:");
        
        //almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];
        
        //para cada calificación en LibroCalificaciones, incrementa la frecuencia apropiada
        for(int[] califEstudiantes : calificaciones){
           for(int calificacion : califEstudiantes){
              ++frecuencia[calificacion / 10];
           }
        }
        
        //para cada frecuencia de calificaciones, imprime una barra en el gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            //imprime etiquetas de las barras ("00-99: ", ..., "90-99: ", "100: ")
            if (cuenta == 10) {
               System.out.printf("%5d: ", 100);
            }
            else{
               System.out.printf("%02d-%02d: ",
                       cuenta * 10, cuenta * 10 + 9);
            }
            
            //imprime barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
    
    
}//fin de la clase LibroCalificaciones


