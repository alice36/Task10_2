import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {
        Direction[] directions = Direction.values();

        System.out.println("Możliwe kierunki: ");

        for (int i = 0; i < directions.length-1; i++) {
            System.out.println(directions[i] + " " + directions[i].ordinal());
        }

        System.out.println("Podaj kierunek geograficzny z nazwy");
        try{
            Scanner input = new Scanner(System.in);
            Direction userDirection = Direction.valueOf(input.nextLine());
            System.out.println("Ok, więc idziemy na " + userDirection.getDirectionName() );
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Podaj kierunek geograficzny z liczby");
        try{
            Scanner input = new Scanner(System.in);
            Direction userDirection = Direction.convert(input.nextInt());
            System.out.println("Ok, więc idziemy na " + userDirection.getDirectionName() );
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}