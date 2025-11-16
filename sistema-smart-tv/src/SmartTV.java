public class SmartTV {
    boolean ligada = false; 
    int canal = 1;
    int volume = 25;
    
    public void mudarCanal(int Canal) {
        canal = Canal;
    }

    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume:" + volume);
        //volume = volume + 1;
        
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume:" + volume);
    }

    public void ligar() {
        ligada = true;
    }   

    public void desligar() {
        ligada = false;
    }
}
