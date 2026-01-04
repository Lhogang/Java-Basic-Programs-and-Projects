package classdiscussion;


class Discussion{
  
    String time;
    String location;
    String subject;
    
    Discussion(String time, String location, String subject){
    
        this. time = time;
        this. location = location;
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
    void printDiscussioninfo(){
    
        System.out.println("Discussion in the room" + location +  "at"  + time + "\nSubject:" +subject);
    
    }
}

public class Classdiscussion{

    public static void main(String[]args){
    Discussion discussion = new Discussion("12:30pm", "room T101", "Final Year Project Discussion");
    discussion.printDiscussioninfo();
    
    }
}