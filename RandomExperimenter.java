package socialmedia;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class is the Experiment shell for the classification program.
 * 
 * @author sburton
 */
public class RandomExperimenter extends Experiment{
    
    /**
     * Builds a model and classifies the test set.
     * @param trainingSet
     * @param testSet
     * @return A mapping of true or false to each entry in the test set.
     */
    private abstract Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
                                                           Set<SocialMediaEntry> testSet);
//    {
//        
//        System.out.println("Running classifier...");
//        
//        // In a real use case, build a machine learning model from the training set,
//        // then use it to classify the entries in the test set.
//
//        
//        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
//        
//        // Right now this is putting a "true" for everything
//        // TODO: This method will need to be changes / replaced.
//        for (SocialMediaEntry entry : testSet) {
//            results.put(entry, true);
//        }
//        
//        return results;
//    }
    
}
