package taller3.televisores;

public class TV {

	    private Marca marca;
	    private int canal;
	    private int precio;
	    private boolean estado;
	    private int volumen;
	    private static int numTV = 0;
	    private Control control;

	    public TV(Marca marca, boolean estado) {
	        this.marca = marca;
	        this.estado = estado;
	        this.canal = 1;
	        this.volumen = 1;
	        this.precio = 500;
	        numTV++;
	    }

	    public static int getNumTV() {
	        return numTV;
	    }

	    public static void setNumTV(int numTV) {
	        TV.numTV = numTV;
	    }

	    public void turnOn() {
	        this.estado = true;
	    }

	    public void turnOff() {
	        this.estado = false;
	    }

	    public void canalUp() {
	        if (estado && canal < 120) {
	            canal++;
	        }
	    }

	    public void canalDown() {
	        if (estado && canal > 1) {
	            canal--;
	        }
	    }

	    public void volumenUp() {
	        if (estado && volumen < 7) {
	            volumen++;
	        }
	    }

	    public void volumenDown() {
	        if (estado && volumen > 0) {
	            volumen--;
	        }
	    }

	    public Marca getMarca() {
	        return marca;
	    }

	    public int getCanal() {
	        return canal;
	    }

	    public int getPrecio() {
	        return precio;
	    }

	    public int getVolumen() {
	        return volumen;
	    }

	    public boolean getEstado() {
	        return estado;
	    }

	    public void setMarca(Marca marca) {
	        this.marca = marca;
	    }

	    public void setCanal(int canal) {
	        if (estado && canal >= 1 && canal <= 120) {
	            this.canal = canal;
	        }
	    }

	    public void setPrecio(int precio) {
	        this.precio = precio;
	    }

	    public void setVolumen(int volumen) {
	        if (estado && volumen >= 0 && volumen <= 7) {
	            this.volumen = volumen;
	        }
	    }

	    public Control getControl() {
	        return control;
	    }

	    public void setControl(Control control) {
	        this.control = control;
	    }
	}
