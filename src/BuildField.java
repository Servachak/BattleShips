/**
 * Created by adavi on 24.12.2017.
 */
public interface BuildField {

    String[][] buildField(int x, int y);

    String[][] addElementToField(String[][] array);

    void showField(String[][] array);

    boolean equalsAnswer(String answer);
}
