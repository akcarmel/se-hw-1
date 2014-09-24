

/* First created by JCasGen Mon Sep 22 23:00:23 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 21:58:54 EDT 2014
 * XML source: /Users/alokkoth/Documents/java_workspace/hw1-alokkoth/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class SentenceAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SentenceAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentenceAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentenceAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Sentence

  /** getter for Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentence() {
    if (SentenceAnnotation_Type.featOkTst && ((SentenceAnnotation_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "SentenceAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceAnnotation_Type)jcasType).casFeatCode_Sentence);}
    
  /** setter for Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(String v) {
    if (SentenceAnnotation_Type.featOkTst && ((SentenceAnnotation_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "SentenceAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceAnnotation_Type)jcasType).casFeatCode_Sentence, v);}    
   
    
  //*--------------*
  //* Feature: sentid

  /** getter for sentid - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentid() {
    if (SentenceAnnotation_Type.featOkTst && ((SentenceAnnotation_Type)jcasType).casFeat_sentid == null)
      jcasType.jcas.throwFeatMissing("sentid", "SentenceAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceAnnotation_Type)jcasType).casFeatCode_sentid);}
    
  /** setter for sentid - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentid(String v) {
    if (SentenceAnnotation_Type.featOkTst && ((SentenceAnnotation_Type)jcasType).casFeat_sentid == null)
      jcasType.jcas.throwFeatMissing("sentid", "SentenceAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceAnnotation_Type)jcasType).casFeatCode_sentid, v);}    
  }

    