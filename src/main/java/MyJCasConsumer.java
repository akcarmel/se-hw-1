import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;


public class MyJCasConsumer extends CasConsumer_ImplBase {
  private BufferedWriter bw;
  @Override
  
  public void initialize() throws ResourceInitializationException {
    /*
     * Creates a BufferedWriter to write the output file. Reads the file name from the parameter "outputfilename".
     */
    try {
      bw = new BufferedWriter(new FileWriter((String) getConfigParameterValue("outputfilename")));
    } catch (IOException e) {
      e.printStackTrace();
    }
    super.initialize();
  }
  
  public void processCas(CAS CasConsumer) throws ResourceProcessException {
    
    /* @param CAS CasConsumer
     * Loads both type systems (Sentence and Annotation) from CAS. Then corresponding to each sentence id, outputs the begin and end, and the identified named-entity.
     * Writes the id,begin,end,named entity in the output file via the created buffered reader.
     */
    JCas jcas_consumer = null;
    try {
      jcas_consumer = CasConsumer.getJCas();
    } catch (CASException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    String id = ((SentenceAnnotation)  jcas_consumer.getJFSIndexRepository().getAllIndexedFS(SentenceAnnotation.type).get()).getSentid(); 
    FSIterator it = jcas_consumer.getJFSIndexRepository().getAllIndexedFS(NEAnnotate.type);
    while (it.hasNext()) {
      NEAnnotate ner = ((NEAnnotate) it.get());
      try {
        bw.write(id + "|" + ner.getBegin() + " " + ner.getEnd() + "|" + ner.getNamedEntity()+'\n');
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      it.next();
    }
    try{
    bw.flush();  
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    
    }

}
