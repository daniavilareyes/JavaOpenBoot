public class ejercicio {

    public static void main ( String [] args) {
        int valor  = 8;
    if ( valor >= 0 ){
        System.out.println("Es positivo");
    } else if ( valor <= 0 ){
        System.out.println( "Es negativo");
    }
    
    
        int contadorwhile = 3;
        while (contadorwhile < 10 ) {
            System.out.println(contadorwhile);
            contadorwhile = contadorwhile + 1; 
        }
        
    
        int  contadorwhiledo = 3;
        do {
            contadorwhiledo = contadorwhiledo + 1;
        } while (contadorwhiledo < 10 );
        
        int values[] = new int [5]; 
        for (int i = 0; i < values.length; i++ ) {
            System.out.println(values);
        }
        var estacion = "verano";
        switch (estacion) {
            case "invierno":
            System.out.println("es invierno" );
                break;
            case "verano":
            System.out.println("es verano" );
                break;
            case "otoño":
            System.out.println("es otoño" );
                break;
            default:
            System.out.println("no se ha encontrado la estacion" );
                break;
        
}
}
}
