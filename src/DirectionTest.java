import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {
        Direction[] directions = Direction.values();

        System.out.println("Możliwe kierunki: ");
        for(Direction direction: directions) {
            System.out.println(direction);
        }

        System.out.println("Podaj kierunek geograficzny");
        try{
            Scanner input = new Scanner(System.in);
            Direction userDirection = Direction.valueOf(input.nextLine());
            System.out.println("Ok, więc idziemy na " + userDirection.getDirectionName() );
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}