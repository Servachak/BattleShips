/**
 * Created by adavi on 24.12.2017.
 */
public class BuildBattleField implements BuildField {


    @Override
    public String[][] buildField(int x, int y) {
        String [][] array = new String[x][y];

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array.length; j++){

                if (i == 0 || i == array.length - 1) {

                    if (j != 0 && j != array.length - 1) {

                        if (array[i][j] == null) {
                            array[i][j] = "" + j;
                        }
                    }
                    else{
                        array[i][j] = "  ";
                    }
                }else{
                    if (j != 0 && j != array.length - 1) {

                        if (array[i][j] == null) {
                            array[i][j] = " ";
                        }
                    }
                    else{
                        if (j == 0){
                        array[i][j] = i+ "|";
                        }else{
                            array[i][j] = "|" + i;
                        }
                    }
                } System.out.print(array[i][j]);
            }
            System.out.println();
        }
        return array;
    }


    @Override
    public String [][] addElementToField(String [][] array) {

        System.out.println();
        int countShip = 1;
        boolean isFalse;

        do {

            System.out.println("Enter X coordinate for your " + countShip + " ship");
            int coordinateX = Main.scanner.nextInt();

            System.out.println("Enter Y coordinate for your " + countShip + " ship");
            int coordinateY = Main.scanner.nextInt();

            if (coordinateX > 0 || coordinateY > 0) {

                for (int i = 0; i < array.length; i++) {

                    for (int j = 0; j < array.length; j++) {

                        if (i == coordinateX && j == coordinateY) {
                            array[i][j] = "@";
                        }
                        if (array[i][j].equals("@")) {
                            array[i][j] = "@";
                        }
                    }
                }

                System.out.println("Can add more? Y/N");
                String answer = Main.scanner.next();

                isFalse = equalsAnswer(answer);
            }else{
                System.out.println("You must place the ship in the range from 0 to 10!\nTry again? Y/N");
                String answer = Main.scanner.next();

                isFalse = equalsAnswer(answer);
            }
            countShip++;
        }while(isFalse);
        return array;
    }



    @Override
    public boolean equalsAnswer(String answer) {
        if (!answer.equalsIgnoreCase("y")) {
            return false;
        }else
        return true;
    }

    @Override
    public void showField(String[][] array) {

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array.length; j++){

                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }

    @Override
    public void compAddShipsToField(String[][] array) {
        System.out.println();
        int countShip = 1;
        boolean isFalse = true;

        while(isFalse){

            int coordinateX = (int)(Math.random() * 10 + 1);
            int coordinateY = (int) (Math.random() * 10 + 1);

            for (int i = 0; i < array.length; i++){

                for (int j = 0; j < array.length; j++){

                    if (coordinateX == i && coordinateY == j){
                        array[i][j] = "@";
                    }
                    if (array[i][j].equals("@")) {
                        array[i][j] = "@";
                    }
                }
            }
        }

    }
}

