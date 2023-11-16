import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = { new Eagle("white",26,"male"),
                new Shark("blue",30,"female"),
                new Turtle("yellow",130,"male")};
        Animal animal = new Animal();
        System.out.println("Your white animals are :");
        animal.getWhiteAnimal(animals);
        System.out.println("Enter your gender: ");

        Animal.getAnimalsByGender(scanner.nextLine(),animals);
        System.out.println("Get shark : ");
        Shark.getShark(animals);

    }
}