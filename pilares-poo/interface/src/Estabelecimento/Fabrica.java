package Estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Deskjet;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.Laserjet;
import Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        Impressora impressora2 = new Laserjet();
        

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora3 = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        impressora2.imprimir();
        em.imprimir();
        copiadora.copia();
    }
}
