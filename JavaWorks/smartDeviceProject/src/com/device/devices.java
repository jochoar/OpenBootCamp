package com.device;

public class devices {
    public static void main(String[] args) {
     smartPhone samsungA53 = new smartPhone();
     samsungA53.setProducer("Samsung");
     samsungA53.setModel("A53");
     samsungA53.setMemRam(6);
     samsungA53.setCameras(5);

     smartWatch samsungWatch = new smartWatch();
     samsungWatch.setProducer("Samsung");   
     samsungWatch.setModel("Watch");    
     samsungWatch.setColor("white");
     samsungWatch.setWifiConnect(false);

     System.out.println("The producer is " + samsungA53.getProducer() + 
     "and model " + samsungA53.getModel());
     System.out.println("Ram memory is " + samsungA53.getMemRam() +
     " number of cameras " + samsungA53.getCameras());
     System.out.println(" ");
     System.out.println(samsungWatch.getProducer() + samsungWatch.getModel());
     System.out.println("Is color " + samsungWatch.getColor());
    }
      
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

class device{
 String producer;
 String model;
 double screenWidth;
 double screenHeight;
 //-------------------------------------------------

 public void setProducer(String producer) {
    this.producer = producer;}

 public String getProducer() {
    return this.producer;}
//---------------------------------------------------

 public void setModel(String model) {
    this.model = model;}
 public String getModel() {
    return  this.model;}
//---------------------------------------------------

 public void setScreenWidth(double screenWidth) {
    this.screenWidth = screenWidth;} 
 public double getScreenWidth() {
    return  this.screenWidth;}
//---------------------------------------------------

 public void setScreenHeight(double screenHeight) {
    this.screenHeight = screenHeight;} 
 public double getScreenHeight() {
    return  this.screenHeight;}



}

