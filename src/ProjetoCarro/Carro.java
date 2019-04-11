package ProjetoCarro;

public class Carro {
        String modelo, cor, marca, proprietario, chassi;
        int ano, nDePortas, nMarchas, marchaAtual;
        double vMaxima, vAtual, vCombustivel;
        boolean tetoSolar, cambio_automatico;
        Proprietario proprietario;

        void acelera(){
            vAtual += 1;
        }

        void freia(){
            vAtual = 0;
        }
    
        void trocaMarcha(int marchaDesejada){
            if(marchaDesejada > nMarchas){
                System.out.println("Marcha Inexistente!");
            }else marchaAtual = marchaDesejada;
        }
    
        void reduzMarcha(){
            marchaAtual -= 1;
    }
}
