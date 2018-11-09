
/**
 * Der Hamster Paule läuft von Korn zu Korn, sammelt diese ein und legt 
 * sie am Ende in die Hamsterhöhle. Nach jedem Einsammeln und Ablegen eines 
 * Korns, gibt er die Anzahl der Körner in seinem Mund aus.
 * 
 * @author Kim Lingemann 
 *         3380756 
 *         st160814@stud.uni-stuttgart.de
 *         Sarah Breckner 
 *         3425446
 *         st163632@stud.uni-stuttgart.de
 * @version 09.11.18
 */
public class HomeworkHamster extends HomeworkHamsterGame{

    /**
     * Paule dreht sich nach rechts
     */
    public void turnRight() {
        paule.turnLeft();
        paule.turnLeft();
        paule.turnLeft();
    }
    
    /**
     * Anzahl der Körner in Paules Mund
     */
    public int grainCount=0;
    
    /**
     * Paule sammelt ein Korn und die um eins größere Anzahl der Körner in seinem Mund 
     * wird gespeichert, dann gibt er diese aus.
     */
    public void pickGrainAndCount() {
       paule.pickGrain();
       grainCount++;
       if (grainCount==1) {
           paule.write("Ich habe leider nur " +grainCount + " Korn");
        }
       else { 
       paule.write("Ich habe " +grainCount + " Körner"); 
    }
    }
    
    /**
     * Paule legt ein Korn ab und die um eins kleinere Anzahl der Körner in seinem Mund 
     * wird gespeichert, dann gibt er diese aus.
     */
    public void putGrainAndCount() {
       paule.putGrain();
       grainCount--;
        if (grainCount==1) {
           paule.write("Ich habe leider nur noch " +grainCount + " Korn");
        }
       else { 
       paule.write("Ich habe " +grainCount + " Körner"); 
    }
    }
    /*
     * Verwirrter Paule!
     * Helfe Paule um durch das Territorium zu laufen und alle Körner in seine Höhle zu bringen
     * Dabei soll Paule alle Körner auf dem Feld aufsammeln und sie in seiner Höhle (rechts unten
     * - Spalte 6 * Zeile 4 bei 0 beginnend) wieder ablegen. 
     */
    @Override
    protected void run(){
        paule.write("Ich weiß nicht wie :'(");
        // Helfe Paule dabei durch das Territorium zu laufen 
        // und alle Körner nachhause zu bringen
        //Paule läuft zum ersten Korn und sammelt es ein
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        paule.move();
        pickGrainAndCount();
        //Paule läuft zum nächsten Korn und sammelt es ein
        turnRight();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        pickGrainAndCount();
        //Paule läuft zum Korn unten links und sammelt es ein
        paule.move();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        pickGrainAndCount();
        //Paule läuft zum Korn links in der Mitte und sammelt es ein
        turnRight();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        pickGrainAndCount();
        //Paule läuft zum letzten Korn in der Hamsterhöhle und sammelt es ein
        turnRight();
        paule.move();
        paule.move();
        paule.move();
        turnRight();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.move();
        paule.turnLeft();
        paule.move();
        paule.move(); 
        pickGrainAndCount();
        //Paule legt alle Körner in seine Hamsterhöhle
        while(!paule.mouthEmpty()) {
            putGrainAndCount();
        }
        
        
        
        
        
        
        
        
    }
}
