import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String productName;
        float costPrice;
        float salePrice;

        float averageCost = 0.0f;
        float averageSale = 0.0f;

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Digite o nome do produto:");
            productName = scanner.next();
            System.out.println("Digite o o preço de custo:");
            costPrice = scanner.nextFloat();
            System.out.println("Digite o preço de venda:");
            salePrice = scanner.nextFloat();

            averageCost = averageCost + costPrice;
            averageSale = averageSale + salePrice;

            if (costPrice == salePrice) {
                System.out.println("Houve empate entre preço de custo e preço de venda");
            } else {
                if (costPrice > salePrice) {
                    System.out.println("Houve prejuízo.");
                } else {
                    System.out.println("Houve lucro.");
                }
            }
            System.out.println(productName + ", preço de custo: " + costPrice +
                    ", preço de venda: " + salePrice);
        }
        System.out.println("A média do preço de custo é de: " + (averageCost / i));
        System.out.println("A média do preço de venda é de: " + (averageSale / i));
    }
}