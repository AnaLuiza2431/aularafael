package pacoteRafael;

public class Animal {

    private String tipo;
    private int energia; 
    private int saude;
    private int felicidade;
    private int higiene;

    public Animal(String tipo) {
        this.tipo = tipo;
        this.energia = 100;
        this.saude = 100;
        this.felicidade = 100;
        this.higiene = 100;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getFelicidade() {
        return felicidade;
    }

    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public void brincar() {
        setFelicidade(getFelicidade() + 15);
        setEnergia(getEnergia() - 10);
        validar();
    }

    public void dormir() {
        setEnergia(getEnergia() + 20);
        setHigiene(getHigiene() - 5);
        validar();
    }

    public void comer() {
        setSaude(getSaude() + 15);
        setHigiene(getHigiene() - 10);
        validar();
    }

    public void cuidarHigiene() {
        setHigiene(getHigiene() + 20);
        setEnergia(getEnergia() - 5);
        validar();
    }

    public void cuidarSaude() {
        setSaude(getSaude() + 20);
        setEnergia(getEnergia() - 10);
        validar();
    }

    public boolean estaVivo() {
        return saude > 0;
    }

    private void validar() {
        if (felicidade <= 0) {
            saude -= 20;
            felicidade = 0;
        }
        if (energia <= 0) {
            saude -= 10;
            energia = 0;
        }
        if (higiene <= 0) {
            saude -= 15;
            higiene = 0;
        }

        if (saude < 0) saude = 0;
    }

    public void status() {
        System.out.println("\n=== STATUS DO " + tipo.toUpperCase() + " ===");
        System.out.println("Energia: " + energia);
        System.out.println("Saúde: " + saude);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Higiene: " + higiene);
    }
}
