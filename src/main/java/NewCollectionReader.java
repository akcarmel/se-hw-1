

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;

public class NewCollectionReader extends CollectionReader_ImplBase {
  private Scanner Scr;
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    /* @param CAS aCAS
     * Iterates through the file line by line. Splits the line into ID and actual text.
     * It the adds this to the CAS.
     */
    String line = Scr.nextLine();
    String[] leid = line.split(" ",2);
    try
    {
      JCas java_cas = aCAS.getJCas();
      SentenceAnnotation sent = new SentenceAnnotation(java_cas);
      sent.setSentence(leid[1]);
      sent.setSentid(leid[0]);
      sent.addToIndexes();
              
    }
    catch(CASException E)
    {
      E.printStackTrace();
    }
  }

  @Override
  public void initialize()
  /*
   * Created a Scanner to read the Input File.
   */
  {
    try
    {
    Scr = new Scanner(new BufferedReader(new FileReader((String) getConfigParameterValue("InputString"))));
    }
    catch(FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }
  public void close() throws IOException {
    // TODO Auto-generated method stub
  Scr.close();
  
  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    return Scr.hasNext();
  }

}
