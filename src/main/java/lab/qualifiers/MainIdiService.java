package lab.qualifiers;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MainIdiService {

    private WordDao wordDao;

    private WordDao wordDaoBackup;

    private List<String> words = List.of("java", "scala", "groovy", "kotlin", "Jython");


    private String getNeededData() {
        Random random = new Random();
        int i = random.nextInt(words.size());
        return words.get(i);
    }

    //this method should work each second
    public void doWork(){
        String word = getNeededData();
        wordDao.saveWord(word);
    }

    //this method should work each 3 seconds
    public void doBackup(){
        String word = getNeededData();
        wordDaoBackup.saveWord(word);
    }
}









