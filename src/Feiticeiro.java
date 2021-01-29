public class Feiticeiro extends Personagem{
    private int[] arr = {36, 26, 26, 10, 50, 50 }; // life, escudo, ataque , defesa, mana
    private double power = 1.5;

    public Feiticeiro(String nome) {
        super(nome);
        setAtributos(this.arr);
        setPower(this.power);
    }
    void aumentarMana(){
        getAtributos()[4] += 20;
    }
}
