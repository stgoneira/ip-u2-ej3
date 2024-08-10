package cl.iplacex;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class ConversorImp {

    public double convertirLongitud(double metros) {
        return metros * 3.28084;
    }

    public double convertirVolumen(double litros) {
        return litros * 0.264172;
    }

    public double convertirPeso(double kilogramos) {
        return kilogramos * 2.20462;
    }
    
}

