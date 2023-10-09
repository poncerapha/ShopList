import models.Buy;
import models.CreditCard;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limit = scanner.nextDouble();
        CreditCard creditCard = new CreditCard(limit);

        int quit = 1;
        while(quit != 0) {
            System.out.println("Digite a descrição da compra:");
            String description = scanner.next();

            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            Buy buy = new Buy(description, valor);
            boolean currentBuy = creditCard.launchBuy(buy);

            if (currentBuy) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                quit = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                quit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(creditCard.getShopList());

        for (Buy c : creditCard.getShopList()) {
            System.out.println(c.getDescription() + " - " + c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + creditCard.getCurrentMoney());

    }
}