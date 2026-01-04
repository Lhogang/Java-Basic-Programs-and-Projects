package class;
import java.util.scanner;

class Discussion{

    String time;
    String location;
    String subject;
    scanner input = new scanner();
    
  
    Discussion(String time, String location, String subject){
    this.time = time;
    this.location = location;
    this.subject = subject;
    }
    
    void setTime(String time){
    this.time = time;
    }
    
    void setLocation(String location){
    this.location = location;
    }
    
    void setSubject(String subject){
    this.subject = subject;
    }
    String getSubject(){
    return this.subject;
    }
public static void main(string[]args){
Discussion meeting = new Discussion("10:00","RoomS230","Technology Club Discussion");
}
}
