package taller3.televisores;

public class Control {

	    private TV televisor;

	    public void enlazar(TV televisor) {
	        this.televisor = televisor;
	        televisor.setControl(this);
	    }

	    public void turnOn() {
	        if (televisor != null) {
	            televisor.turnOn();
	        }
	    }

	    public void turnOff() {
	        if (televisor != null) {
	            televisor.turnOff();
	        }
	    }

	    public void canalUp() {
	        if (televisor != null) {
	            televisor.canalUp();
	        }
	    }

	    public void canalDown() {
	        if (televisor != null) {
	            televisor.canalDown();
	        }
	    }

	    public void volumenUp() {
	        if (televisor != null) {
	            televisor.volumenUp();
	        }
	    }

	    public void volumenDown() {
	        if (televisor != null) {
	            televisor.volumenDown();
	        }
	    }

	    public void setCanal(int canal) {
	        if (televisor != null) {
	            televisor.setCanal(canal);
	        }
	    }

	    public void setVolumen(int volumen) {
	        if (televisor != null) {
	            televisor.setVolumen(volumen);
	        }
	    }

	    public TV getTelevisor() {
	        return televisor;
	    }

	    public void setTelevisor(TV televisor) {
	        this.televisor = televisor;
	    }
	}

