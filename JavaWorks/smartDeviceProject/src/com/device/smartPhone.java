package com.device;

public class smartPhone extends device{
    boolean headphones = true;
    int cameras = 0;
    int memRam = 0;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

public boolean isHeadphones() {
   return headphones;}
public void setHeadphones(boolean headphones) {
   this.headphones = headphones;}
//--------------------------------------------------

public int getCameras() {
   return cameras;}
public void setCameras(int cameras) {
   this.cameras = cameras;}
//--------------------------------------------------

public int getMemRam() {
   return memRam;}
public void setMemRam(int memRam) {
   this.memRam = memRam;}


}
    

  