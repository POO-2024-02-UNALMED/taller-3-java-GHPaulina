package taller3.televisores;

public class TV {

	    private Marca marca;
	    private int canal = 1;
	    private int precio = 500;
	    private boolean estado;
	    private int volumen = 1;
	    private Control control;
	    private static int numTV = 0;

	    public TV(Marca marca, boolean estado) {
	        this.marca = marca;
	        this.estado = estado;
	        numTV++;
	    }

	    public static int getNumTV() {
	        return numTV;
	    }

	    public static void setNumTV(int num) {
	        numTV = num;
	    }

	    public void turnOn() {
	        estado = true;
	    }

	    public void turnOff() {
	        estado = false;
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

	    public Control getControl() {
	        return control;
	    }

	    public boolean getEstado() {
	        return estado;
	    }

	    public void setMarca(Marca marca) {
	        this.marca = marca;
	    }

	    public void setCanal(int nuevoCanal) {
	        if (estado && nuevoCanal >= 1 && nuevoCanal <= 120) {
	            canal = nuevoCanal;
	        }
	    }

	    public void setPrecio(int precio) {
	        this.precio = precio;
	    }

	    public void setVolumen(int nuevoVolumen) {
	        if (estado && nuevoVolumen >= 0 && nuevoVolumen <= 7) {
	            volumen = nuevoVolumen;
	        }
	    }

	    public void setControl(Control control) {
	        this.control = control;
	    }
	}
