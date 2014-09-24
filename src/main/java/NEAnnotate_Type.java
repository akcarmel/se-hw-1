
/* First created by JCasGen Mon Sep 22 22:06:50 EDT 2014 */

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
public class NEAnnotate_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NEAnnotate_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NEAnnotate_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NEAnnotate(addr, NEAnnotate_Type.this);
  			   NEAnnotate_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NEAnnotate(addr, NEAnnotate_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NEAnnotate.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("NEAnnotate");
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "NEAnnotate");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "NEAnnotate");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "NEAnnotate");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "NEAnnotate");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NamedEntity;
  /** @generated */
  final int     casFeatCode_NamedEntity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNamedEntity(int addr) {
        if (featOkTst && casFeat_NamedEntity == null)
      jcas.throwFeatMissing("NamedEntity", "NEAnnotate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NamedEntity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNamedEntity(int addr, String v) {
        if (featOkTst && casFeat_NamedEntity == null)
      jcas.throwFeatMissing("NamedEntity", "NEAnnotate");
    ll_cas.ll_setStringValue(addr, casFeatCode_NamedEntity, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NEAnnotate_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_NamedEntity = jcas.getRequiredFeatureDE(casType, "NamedEntity", "uima.cas.String", featOkTst);
    casFeatCode_NamedEntity  = (null == casFeat_NamedEntity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NamedEntity).getCode();

  }
}



    