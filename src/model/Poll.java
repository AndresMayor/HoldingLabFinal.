package model;

public class Poll{

  private int serviceRendered;
  private int responseTime;
  private int costBenefitAcquired;




  public Poll(int serviceRendered,int responseTime,int costBenefitAcquired){
  	this.serviceRendered=serviceRendered;
  	this.responseTime=responseTime;
  	this.costBenefitAcquired=costBenefitAcquired;
  }
  public int getServiceRendered(){
  	return serviceRendered;
  }
  public void setServiceRendered(int serviceRendered){
  	this.serviceRendered=serviceRendered;
  }

  public int getResponseTime(){
  	return responseTime;
  }
  public void setResponseTime(int responseTime){
  	this.responseTime=responseTime;
  }

  public int getCostBenefitAcquired(){
  	return costBenefitAcquired;
  }
  public void setCostBenefitAcquired(int costBenefitAcquired){
  	this.costBenefitAcquired=costBenefitAcquired;
  }


}