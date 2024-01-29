
package Dni;

/**
 *
 * @author joel
 */
public class CalcularDni {



    //Atributo Instancia
    private int numDni;
    
        
    public int getDni() {
        return numDni;
    }
    
    public String getNIF(){
        String cadenaNIF;
        char letraNIF;
        
        letraNIF= CalcularDni.calcularLetraNIF(numDni);
        cadenaNIF= Integer.toString(numDni)+ String.valueOf(letraNIF);
        
        return cadenaNIF;
    }

    public void setNumDni(int numDni) {
        this.numDni = numDni;
    }

       
    private static final String LETRAS_DNI="TRWAGMYFPDXBNJZSQVHLCKE";
    
       
    private static char calcularLetraNIF(int dni){
        char letra;
        
        letra=LETRAS_DNI.charAt(dni%23);
        return letra;
    }
    
    private static char extraerLetraNIF(String nif){
        
        char letra= nif.charAt(nif.length()-1);
        return letra;
    
    }
    
    private static int extraerNumeroNIF(String nif){
        
        int numero= Integer.parseInt(nif.substring(0, nif.length()-1));
        return numero;
    
    }

    private static boolean validarNIF(String nif){
        
        boolean valido= true;
        char letra_calculada;
        char letra_leida;
        int dni_leido;
        
        if(nif == null){
            valido= false;
        } else if(nif.length() < 8 || nif.length()>9){
            valido = false;
        } else{
            letra_leida= CalcularDni.extraerLetraNIF(nif);
            dni_leido= CalcularDni.extraerNumeroNIF(nif);
            letra_calculada= CalcularDni.calcularLetraNIF(dni_leido);
            
            if(letra_leida == letra_calculada){
                valido=true;
            }else{
                valido=false;
            }
            
            
        }
        
        return valido;
    }
    
    public void set (String nif) throws Exception{
        if(validarNIF(nif)){
            this.numDni = CalcularDni.extraerNumeroNIF(nif);
        } else{
            throw new Exception ("NIF Invalido: "+ nif);
        }
    }
    
    public void set (int dni) throws Exception{
        if (dni > 0 && dni < 999999999){
            this.numDni=dni;
        } else{
            throw new Exception ("DNI invalido: "+String.valueOf(dni));
        }
    }
    
}
