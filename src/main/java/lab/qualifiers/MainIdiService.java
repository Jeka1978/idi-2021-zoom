package lab.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainIdiService {

    @ModeQualifier(Modes.REGULAR)
    private WordDao wordDao;

    @ModeQualifier(Modes.BACKUP)
    private WordDao wordDaoBackup;

    private List<String> words = List.of("java", "scala", "groovy", "kotlin", "Jython");


    private String getNeededData() {
        Random random = new Random();
        int i = random.nextInt(words.size());
        return words.get(i);
    }


    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        String word = getNeededData();
        wordDao.saveWord(word);
    }

    @Scheduled(fixedDelay = 3000)
    public void doBackup(){
        String word = getNeededData();
        wordDaoBackup.saveWord(word);
    }
}









