package taller3.televisores;

public class TV {
    Marca marca;
    public int canal=1;
    private int precio=500;
    public boolean estado;
    public int volumen=1;
    public Control control;
    public static int numTV;
    
    public TV(Marca marca, boolean estado){
        this.marca=marca;
        this.estado=estado;
        numTV++;
    }
    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int canal){
        this.canal=canal;
    }
    public int getCanal(){
        return canal;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public int getPrecio(){
        return precio;
    }
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setControl(Control control){
        this.control=control;
    }
    public Control getControl(){
        return control;
    }
    public static int getNumtv() {
        return numTV;
    }
    public void turnOn(){
        this.estado=true;
    }
    public void turnOff(){
        this.estado=false;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    public int canalUp(){
        if(this.estado==true && canal>=1 && canal<120){
            canal=getCanal()+1;
            return canal;
        }
        return canal;
    }
    public int canalDown(){
        if(this.estado==true && canal>1 && canal<=120){
            canal=getCanal()-1;
            return canal;
        }
        return canal;
    }
    public int volumenUp(){
        if(this.estado==true && this.volumen>=0 && this.volumen<=6){
            volumen=getVolumen()+1;
            return volumen;
        }
        return volumen; 
    }
    public int volumenDown(){
        if(this.estado==true && this.volumen>=1 && this.volumen<=7){
            volumen=getVolumen()-1;
            return volumen;
        }
        return volumen;
    }   
    public static void setNumTV(int num){
        numTV=num;
    }
    public static int getNumTV(){
        return numTV;
    }

}
