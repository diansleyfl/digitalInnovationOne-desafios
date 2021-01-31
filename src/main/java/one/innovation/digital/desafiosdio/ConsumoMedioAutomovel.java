package one.innovation.digital.desafiosdio;

import java.io.BufferedReader;
import java.text.DecimalFormat;

public class ConsumoMedioAutomovel {
    
public static void main(String[] args)  {
    
        DecimalFormat df = new DecimalFormat("0.000");

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        
        try{
        int distancia = Integer.parseInt(br.readLine());
        double combustivel = Double.parseDouble(br.readLine());
        double consumoMedio = (distancia / combustivel);
        System.out.println(df.format(consumoMedio).replaceAll("," , ".") + " Km/l ");
        
        } catch (Exception e){
            System.out.println(e.getCause());
        }
}
          
}