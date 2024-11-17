package taller3.televisores;

public class Control {
    private TV tv;
    public void enlazar(TV televisor){
        televisor=tv;
        televisor.setControl(this);
    }
    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }
    public void turnOn(){
        if (tv != null){
            tv.setEstado(true);
        } 
    }
    public void turnOff(){
        if (tv != null){
            tv.setEstado(false);
        }
    }
    public void canalUp(){
        if(tv.getEstado()==true && tv.getCanal()>=1 && tv.getCanal()<=119 && tv!=null ){
            tv.setCanal(tv.getCanal()+1);
        }
    }
    public void canalDown(){
        if(tv.getEstado()==true && tv.getCanal()>=2 && tv.getCanal()<=120 && tv!=null ){
            tv.setCanal(tv.getCanal()-1);
        }
    }
 
    public void volumenUp(){
        if(tv.getVolumen()>=0 && tv.getVolumen()<=6 && tv != null){
            tv.setVolumen(tv.getVolumen()+1);
        }    
    }
    public void volumenDown(){
        if(tv.getVolumen()>=1 && tv.getVolumen()<=7 && tv != null){
            tv.setVolumen(tv.getVolumen()-1);
        }    
    }   
    public void setCanal(int canal){
        if(tv!=null){
            tv.setCanal(canal);
        } 
    }
    public void setVolumen(int volumen){
        if(tv!=null){
            tv.setCanal(volumen);
        }
    }
     


}
