import java.util.Scanner;

/**
 * Created by adavi on 23.12.2017.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("*****Welcome to Battle Ship Game*****");

        BuildBattleField buildBattleField = new BuildBattleField();

      String [][] field =  buildBattleField.buildField(12,12);

     String [][] fieldWithShip =  buildBattleField.addElementToField(field);

     buildBattleField.showField(fieldWithShip);
    }
}
