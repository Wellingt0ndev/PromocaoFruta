package promocaofruta;

import java.util.Scanner;

/**
 *
 * @author Wellington F.morango
 */
public class PromocaoFruta {

    public static void main(String[] args) {
        String[] promocao = {"banana", "maçã", "abacaxi", "melão", "mamão"};
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual fruta deseja comprar hoje? ");
        String fruta = leitor.nextLine();
        boolean frutaEmPromo = false;
        for(String promo : promocao){
            if(promo.equalsIgnoreCase(fruta)){
                frutaEmPromo = true;
                break;
            }
        }
        if (frutaEmPromo) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Essa fruta não está na promoção");
        }
    }

}
