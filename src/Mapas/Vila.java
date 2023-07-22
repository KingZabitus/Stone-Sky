package Mapas;
import Enum.*;
import Modelo.Mapa;
public class Vila extends Mapa{

    public Vila(int altura, int largura, int pontoInicialX, int pontoInicialY) {
        super(altura, largura, pontoInicialX, pontoInicialY);
    }

    @Override
    public void preencherMapa(){
        setEspaco(5, 1, EnumNPCs.MERC_BENS.getNPC());
        setEspaco(5, 2, EnumNPCs.MERC_ARMAS.getNPC());
        setEspaco(5, 5, EnumNPCs.ALDEAO.getNPC());
        setEspaco(0, 4, EnumProps.ALTAR.getPROP());
        setEspaco(1, 3, EnumNPCs.GUARDA.getNPC());
        setEspaco(1, 5, EnumNPCs.GUARDA.getNPC());
        setEspaco(3, 0, EnumProps.ENTRADA.getPROP());
    }

}
