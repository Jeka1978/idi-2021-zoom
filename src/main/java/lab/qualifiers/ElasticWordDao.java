package lab.qualifiers;

/**
 * @author Evgeny Borisov
 */
public class ElasticWordDao implements WordDao {
    @Override
    public void saveWord(String word) {
        System.out.println(word+" was saved to elastic search");
    }
}
