package pt.ul.fc;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

/** Utilizar uma máquina de café. */
@StateSet({"desligada", "pronta", "aFazerCafe"})
public class MaquinaCafe {

    @StateRefinement(to="desligada()")
    public MaquinaCafe() {}

    /** Descalcifica a máquina (continua desligada). */
    @StateRefinement(from="true", to="true")
    public void descalcificar() {}

    /** Recolhe a chávena; a máquina fica pronta. */
    @StateRefinement(from="true", to="true")
    public void recolher() {}

    /** Liga a máquina. */
    @StateRefinement(from="desligada()", to="pronta()")
    public void ligar() {}

    /** Desliga a máquina (cancela o café, se houver). */
    @StateRefinement(from="true", to="true")
    public void desligar() {}

    /** Começa a fazer um café. */
    @StateRefinement(from="true", to="true")
    public void fazerCafe() {}
}
