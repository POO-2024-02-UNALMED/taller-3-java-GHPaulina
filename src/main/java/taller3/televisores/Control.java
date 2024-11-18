package taller3.televisores;

public class Control {
	    private TV tv; // El televisor que el control manejará.

	    // Método para conectar el control a un televisor.
	    public void enlazar(TV tv) {
	        this.tv = tv; // Se guarda el televisor en el control.
	        tv.setControl(this); // El televisor también sabe que este es su control.
	    }

	    // Métodos para encender y apagar el televisor.
	    public void turnOn() {
	        if (tv != null) { // Asegura que haya un televisor conectado.
	            tv.turnOn();
	        }
	    }

	    public void turnOff() {
	        if (tv != null) {
	            tv.turnOff();
	        }
	    }

	    // Métodos para cambiar el canal.
	    public void canalUp() {
	        if (tv != null) {
	            tv.canalUp();
	        }
	    }

	    public void canalDown() {
	        if (tv != null) {
	            tv.canalDown();
	        }
	    }

	    // Métodos para cambiar el volumen.
	    public void volumenUp() {
	        if (tv != null) {
	            tv.volumenUp();
	        }
	    }

	    public void volumenDown() {
	        if (tv != null) {
	            tv.volumenDown();
	        }
	    }

	    public void setCanal(int canal) {
	        if (tv != null) {
	            tv.setCanal(canal);
	        }
	    }
	}


