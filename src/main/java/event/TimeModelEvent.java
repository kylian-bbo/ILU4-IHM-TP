/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package event;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 *
 * @author acarayon
 */
public class TimeModelEvent extends EventObject {
    
    private final LocalDateTime time;
    
    public TimeModelEvent(Object source, LocalDateTime time) {
        super(source);
        this.time = time;
    }
    
    public LocalDateTime getTime() {
        return time;
    }
    
}
