
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int canal) {
        if (canal < 1 || canal > 50) {
            return;
        }
        this.canal = canal;

    }

    public void aumentarCanal() {
        if (canal == 50) {
            return;
        }
        canal++;
    }

    public void diminuirCanal() {
        if (canal == 1) {
            return;
        }
        canal--;
    }

    public void aumentarVolume() {
        if (volume == 30) {
            return;
        }
        volume++;
    }

    public void diminuirVolume() {
        if (volume == 0) {
            return;
        }
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
