
/* First created by JCasGen Mon Sep 22 23:00:23 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 23 21:58:54 EDT 2014
 * @generated */
public class SentenceAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SentenceAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SentenceAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SentenceAnnotation(addr, SentenceAnnotation_Type.this);
  			   SentenceAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SentenceAnnotation(addr, SentenceAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SentenceAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("SentenceAnnotation");
 
  /** @generated */
  final Feature casFeat_Sentence;
  /** @generated */
  final int     casFeatCode_Sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentence(int addr) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "SentenceAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentence(int addr, String v) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "SentenceAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sentid;
  /** @generated */
  final int     casFeatCode_sentid;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentid(int addr) {
        if (featOkTst && casFeat_sentid == null)
      jcas.throwFeatMissing("sentid", "SentenceAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentid);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentid(int addr, String v) {
        if (featOkTst && casFeat_sentid == null)
      jcas.throwFeatMissing("sentid", "SentenceAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentid, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SentenceAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sentence = jcas.getRequiredFeatureDE(casType, "Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Sentence  = (null == casFeat_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence).getCode();

 
    casFeat_sentid = jcas.getRequiredFeatureDE(casType, "sentid", "uima.cas.String", featOkTst);
    casFeatCode_sentid  = (null == casFeat_sentid) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentid).getCode();

  }
}



    