package taller3.televisores;

public class TV {
    Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    static int numTV;
    
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
    public void turnOn(boolean estado){
        this.estado=true;
    }
    public void turnOff(boolean estado){
        this.estado=false;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    public int canalUP(){
        if(this.estado==true && canal>=1 && canal<=119){
            canal=getCanal()+1;
            return canal;
        }
        return canal;
    }
    public int canalDown(){
        if(this.estado==true && canal>=2 && canal<=120){
            canal=getCanal()-1;
            return canal;
        }
        return canal;
    }
    public int volumenUp(){
        if(this.volumen>=0 && this.volumen<=6){
            volumen=getVolumen()+1;
            return volumen;
        }
        return volumen; 
    }
    public int volumenDown(){
        if(this.volumen>=1 && this.volumen<=7){
            volumen=getVolumen()-1;
            return volumen;
        }
        return volumen;
    }   
}
