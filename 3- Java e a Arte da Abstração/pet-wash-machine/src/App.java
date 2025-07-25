import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        PetMachine petMachine = new PetMachine(null);

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("=========================");
            System.out.println("1 - Adicionar Pet");
            System.out.println("2 - Lavar Pet");
            System.out.println("3 - Adicionar Água");
            System.out.println("4 - Adicionar Shampoo");
            System.out.println("5 - Verificar Água e Shampoo");
            System.out.println("6 - Remover Pet");
            System.out.println("7 - Lavar Máquina");
            System.out.println("0 - Sair");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    // Implementar lógica para adicionar pet
                    System.out.println("Digite o nome do pet:");
                    String petName = scanner.next();
                    Pet pet = new Pet(petName);
                    petMachine.setPet(pet);
                    break;
                case 2:
                    // Implementar lógica para lavar pet
                    petMachine.washPet();
                    break;
                case 3:
                    // Implementar lógica para adicionar água
                    System.out.println("Digite a quantidade de água a ser adicionada:");
                    int waterAmount = scanner.nextInt();
                    petMachine.addWater(waterAmount);
                    break;
                case 4:
                    // Implementar lógica para adicionar shampoo
                    System.out.println("Digite a quantidade de shampoo a ser adicionada:");
                    int shampooAmount = scanner.nextInt();
                    petMachine.addShampoo(shampooAmount);
                    break;
                case 5:
                    // Implementar lógica para verificar água e shampoo
                    System.out.println("Água disponível: " + petMachine.getWater());
                    System.out.println("Shampoo disponível: " + petMachine.getShampoo());
                    break;
                case 6:
                    // Implementar lógica para remover pet
                    petMachine.removePet();
                    break;
                case 7:
                    // Implementar lógica para lavar máquina
                    petMachine.washMachine();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (true);
    }
}
