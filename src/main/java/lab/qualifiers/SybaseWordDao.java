package lab.qualifiers;

/**
 * @author Evgeny Borisov
 */
public class SybaseWordDao implements WordDao {
    @Override
    public void saveWord(String word) {
        System.out.println("Saving to sybase");
    }
}
