package model;
/**
*this class contains the information of the polls
*/
public class Poll{

  private int serviceRendered;
  private int responseTime;
  private int costBenefitAcquired;



/**
*Poll Constructor 
*@param serviceRendered service Rendered 
*@param responseTime time of response 
*@param costBenefitAcquired  cost benefit acquired 
*/
  public Poll(int serviceRendered,int responseTime,int costBenefitAcquired){
  	this.serviceRendered=serviceRendered;
  	this.responseTime=responseTime;
  	this.costBenefitAcquired=costBenefitAcquired;
  }
/**
*Gets the service of the rendered 
*@return the service rendered
*/
  public int getServiceRendered(){
  	return serviceRendered;
  }
  /**
*Sets the service rendered 
*@param availability the service rendered 
*/
  public void setServiceRendered(int serviceRendered){
  	this.serviceRendered=serviceRendered;
  }
/**
*Gets the time of reponse 
*@return the time of renponse 
*/
  public int getResponseTime(){
  	return responseTime;
  }

/**
*Sets the time of renponse 
*@param responseTime  the time of response  
*/
  public void setResponseTime(int responseTime){
  	this.responseTime=responseTime;
  }
/**
*Gets the cost benefit acquired  
*@return the cost benefit acquired 
*/
  public int getCostBenefitAcquired(){
  	return costBenefitAcquired;
  }
/**
*Sets the  cost benefit acquired 
*@param costBenefitAcquired the cost benefit acquired   
*/

  public void setCostBenefitAcquired(int costBenefitAcquired){
  	this.costBenefitAcquired=costBenefitAcquired;
  }


}