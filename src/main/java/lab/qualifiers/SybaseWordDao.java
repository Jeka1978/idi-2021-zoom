package lab.qualifiers;

/**
 * @author Evgeny Borisov
 */
@ModeQualifier(Modes.REGULAR)
public class SybaseWordDao implements WordDao {
    @Override
    public void saveWord(String word) {
        System.out.println("Saving to sybase");
    }
}
