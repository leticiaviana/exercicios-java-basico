public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public PetMachine(Pet pet) {
        this.pet = pet;
        this.clean = true;
        this.water = 0;
        this.shampoo = 0;
    }

    public void washPet() {
        if (pet == null) {
            System.out.println("Nenhum pet selecionado para lavar.");
            return;
        }
        if (water > 0 && shampoo > 0) {
            pet.setClean(true);
            clean = true;
            this.water -= 10;
            this.shampoo -= 2;
            System.out.println("Pet " + pet.getName() + " lavado com sucesso!");
        } else {
            System.out.println("Não há água ou shampoo suficiente para lavar o pet.");
        }
    }

    public void addWater(int amount) {
        if (amount <= 0) {
            System.out.println("Quantidade de água inválida.");
            return;
        }
        if (water == 30) {
            System.out.println("Quantidade de água excede o limite de 30.");
            return;
        }
        water += amount;
        System.out.println("Água adicionada: " + amount);
    }

    public void addShampoo(int amount) {
        if (amount <= 0) {
            System.out.println("Quantidade de shampoo inválida.");
            return;
        }
        if (shampoo == 10) {
            System.out.println("Quantidade de shampoo excede o limite de 10.");
            return;
        }
        shampoo += amount;
        System.out.println("Shampoo adicionado: " + amount);
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public String hasPet(){
        return pet != null ? "Já temos um pet na máquina" : "Máquina vazia";
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja. Por favor, limpe-a antes de adicionar um novo pet.");
            return;
        }
        if(pet != null) {
            System.out.println("Já existe o pet " + pet.getName() + " na máquina. Remova-o antes de adicionar outro.");
            this.pet = pet;
            return;
        }
        
    }

    public void removePet() {
        this.clean = this.pet.isClean().equals("LIMPO");
        System.out.println("O Pet " + this.pet.getName() + " está limpo!");
        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("Máquina lavada com sucesso!");
    }

    


}
