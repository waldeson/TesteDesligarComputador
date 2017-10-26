package classeDeDados;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class ClasseDeDadosDesligar {

    //Atributos
    private int horas = LocalTime.now().getHour();
    private int minutos = LocalTime.now().getMinute();

    //Metodos    
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public float desligarAcao() {
        while (true) {
            if (this.horas > 19 && this.minutos == 30) {
                // Recebendo a string como parametros
                String comando = "cmd /c C:/Desligar.cmd";
                System.out.println(comando);
                try {
                    Runtime.getRuntime().exec(comando);
                    System.out.println(comando);
                } catch (Exception erro) {
                    erro.printStackTrace();
                }

                break;
            }
        }
        return 0;
    }
}
