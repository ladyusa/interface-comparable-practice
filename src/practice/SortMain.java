package practice;

public class SortMain {

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(100);
        accounts[1] = new BankAccount(400);
        accounts[2] = new BankAccount(80);

        DataUtility.sort(accounts);

        for (BankAccount act : accounts) {
            System.out.println(act);
        }

        System.out.println("--------");

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Dingdong", 7);
        animals[1] = new Animal("Chao Chao", 4);
        animals[2] = new Animal("Willie", 2);

        DataUtility.sort(animals);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
