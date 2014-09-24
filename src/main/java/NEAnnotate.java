

/* First created by JCasGen Mon Sep 22 22:06:50 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 21:58:54 EDT 2014
 * XML source: /Users/alokkoth/Documents/java_workspace/hw1-alokkoth/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NEAnnotate extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NEAnnotate.class);
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
  protected NEAnnotate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NEAnnotate(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NEAnnotate(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NEAnnotate(JCas jcas, int begin, int end) {
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
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (NEAnnotate_Type.featOkTst && ((NEAnnotate_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "NEAnnotate");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NEAnnotate_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (NEAnnotate_Type.featOkTst && ((NEAnnotate_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "NEAnnotate");
    jcasType.ll_cas.ll_setIntValue(addr, ((NEAnnotate_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (NEAnnotate_Type.featOkTst && ((NEAnnotate_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "NEAnnotate");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NEAnnotate_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (NEAnnotate_Type.featOkTst && ((NEAnnotate_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "NEAnnotate");
    jcasType.ll_cas.ll_setIntValue(addr, ((NEAnnotate_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: NamedEntity

  /** getter for NamedEntity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNamedEntity() {
    if (NEAnnotate_Type.featOkTst && ((NEAnnotate_Type)jcasType).casFeat_NamedEntity == null)
      jcasType.jcas.throwFeatMissing("NamedEntity", "NEAnnotate");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NEAnnotate_Type)jcasType).casFeatCode_NamedEntity);}
    
  /** setter for NamedEntity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNamedEntity(String v) {
    if (NEAnnotate_Type.featOkTst && ((NEAnnotate_Type)jcasType).casFeat_NamedEntity == null)
      jcasType.jcas.throwFeatMissing("NamedEntity", "NEAnnotate");
    jcasType.ll_cas.ll_setStringValue(addr, ((NEAnnotate_Type)jcasType).casFeatCode_NamedEntity, v);}    
  }

    