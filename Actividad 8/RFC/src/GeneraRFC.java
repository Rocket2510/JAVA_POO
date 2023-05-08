public class GeneraRFC {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String anio, mes, dia;

    public GeneraRFC(){}
    public GeneraRFC(String apellidoPaterno, String apellidoMaterno , String nombre, String anio, String mes, String dia) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public String RFC() {
        //Obtener la primera letra del primer apellido
        char primeraLetraApellidoPaterno = this.apellidoPaterno.toUpperCase().charAt(0);
        
        //Obtener la primera vocal del primer apellido
        String vocales = "aeiouAEIOU";
        String primeraVocalApellidoPaterno = "";
        for (int i = 1; i < this.apellidoPaterno.length(); i++) {
            char letra = this.apellidoPaterno.charAt(i);
            if (vocales.indexOf(letra) != -1) {
                primeraVocalApellidoPaterno = Character.toString(letra);
                break;
            }
        }
        
        //Obtener la primera letra del primer nombre
        char primeraLetraNombre = this.nombre.toUpperCase().charAt(0);
        
        //Obtener los últimos 2 dígitos del año de nacimiento
        String ultimosDosDigitosAnio = this.anio.substring(2);
        
        //Obtener el número del mes de nacimiento
        int numeroMes = Integer.parseInt(this.mes);
        String letraMes = "";
        switch (numeroMes) {
            case 1: letraMes = "01"; break;
            case 2: letraMes = "02"; break;
            case 3: letraMes = "03"; break;
            case 4: letraMes = "04"; break;
            case 5: letraMes = "05"; break;
            case 6: letraMes = "06"; break;
            case 7: letraMes = "07"; break;
            case 8: letraMes = "08"; break;
            case 9: letraMes = "09"; break;
            case 10: letraMes = "10"; break;
            case 11: letraMes = "11"; break;
            case 12: letraMes = "12"; break;
        }
        
        // Obtener los últimos 2 dígitos del día de nacimiento
        String ultimosDosDigitosDia = this.dia.length() == 2 ? "" + this.dia : this.dia.substring(1);
        
        // Generar el dígito verificador
        String homoclave = "";
        String caracteresHomoclave = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; i < 2; i++) {
            int indiceAleatorio = (int) (Math.random() * caracteresHomoclave.length());
            homoclave += caracteresHomoclave.charAt(indiceAleatorio);
        }
        
        //devolver el RFC
        String RFC = "";
        RFC += primeraLetraApellidoPaterno;
        RFC += primeraVocalApellidoPaterno.toUpperCase();
        RFC += this.apellidoMaterno.toUpperCase().charAt(0);
        RFC += primeraLetraNombre;
        RFC += ultimosDosDigitosAnio;
        RFC += letraMes;
        RFC += ultimosDosDigitosDia;
        RFC += homoclave;
        return RFC;
    }
   
}
    