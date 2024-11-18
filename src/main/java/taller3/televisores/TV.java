package taller3.televisores;

public class TV {
	    private Marca marca; 
	    private int canal; 
	    private int precio;
	    private boolean estado;
	    private int volumen; 
	    private Control control; 

	    
	    private static int numTV = 0;

	   
	    public TV(Marca marca, boolean estado) {
	        this.marca = marca; 
	        this.estado = estado; 
	        this.canal = 1; 
	        this.volumen = 1; 
	        this.precio = 500; 
	        numTV++; 
	    }

	   
	    public void turnOn() {
	        estado = true; // Cambia el estado a encendido.
	    }

	    public void turnOff() {
	        estado = false; // Cambia el estado a apagado.
	    }

	    // Métodos para subir y bajar el canal.
	    public void canalUp() {
	        if (estado && canal < 120) { // Solo cambia si está encendido y el canal es menor a 120.
	            canal++;
	        }
	    }

	    public void canalDown() {
	        if (estado && canal > 1) { // Solo cambia si está encendido y el canal es mayor a 1.
	            canal--;
	        }
	    }

	    // Métodos para subir y bajar el volumen.
	    public void volumenUp() {
	        if (estado && volumen < 7) { // Solo cambia si está encendido y el volumen es menor a 7.
	            volumen++;
	        }
	    }

	    public void volumenDown() {
	        if (estado && volumen > 0) { // Solo cambia si está encendido y el volumen es mayor a 0.
	            volumen--;
	        }
	    }

	    // Métodos para cambiar el canal y el volumen directamente.
	    public void setCanal(int canal) {
	        if (estado && canal >= 1 && canal <= 120) { // Solo cambia si el canal está dentro de los límites.
	            this.canal = canal;
	        }
	    }

	    public void setVolumen(int volumen) {
	        if (estado && volumen >= 0 && volumen <= 7) { // Solo cambia si el volumen está dentro de los límites.
	            this.volumen = volumen;
	        }
	    }

	    // Métodos para obtener información del televisor.
	    public int getCanal() {
	        return canal;
	    }

	    public int getVolumen() {
	        return volumen;
	    }

	    public Marca getMarca() {
	        return marca;
	    }

	    public int getPrecio() {
	        return precio;
	    }

	    public boolean getEstado() {
	        return estado;
	    }

	    // Métodos para configurar valores.
	    public void setPrecio(int precio) {
	        this.precio = precio;
	    }

	    public void setControl(Control control) {
	        this.control = control;
	    }

	    // Métodos para contar los televisores creados.
	    public static int getNumTV() {
	        return numTV;
	    }
	}



