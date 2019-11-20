package EntidadesDeJuego.Entidad;

import java.awt.Graphics;
import java.awt.Rectangle;

//clase padre de todos los objetos de nuestro juego
public abstract class ActorDeJuego {

    protected float x, y;
    protected ID id;
    protected float velX, velY;

    public ActorDeJuego(float x, float y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    //metodo que actualiza las variables del objeto
    public abstract void tick();
    //metodo que pinta el objeto
    public abstract void render(Graphics g);
    //metodo que retorna el rectangulo del objeto
    public abstract Rectangle getBounds();

    //setters y getters de las variables
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setID(ID id) {
        this.id = id;
    }
    public ID getID() {
        return id;
    }
    public void setVelX(float velX) {
        this.velX = velX;
    }
    public void setVelY(float velY) {
        this.velY = velY;
    }
    public float getVelX() {
        return velX;
    }
    public float velY() {
        return velY;
    }
}
