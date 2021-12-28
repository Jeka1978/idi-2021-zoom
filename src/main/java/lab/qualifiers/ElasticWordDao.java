package lab.qualifiers;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@ModeQualifier(Modes.BACKUP)
public class ElasticWordDao implements WordDao {
    @Override
    public void saveWord(String word) {
        System.out.println(word+" was saved to elastic search");
    }
}
