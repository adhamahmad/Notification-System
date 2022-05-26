package courses ;

import java.util.HashMap;
import java.util.Map;
import gateways.*;
import messages.DailyNewsEmailMessage;
import messages.DailyNewsMobileMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.GradesAnnouncementMobileMessage;
import messages.IMessage;
import messages.TaskAddedEmailMessage;
import messages.TaskAddedMobileMessage;
import users.User;
public class CoursePublisher 
{
    Course course;
    HashMap<IGateway, User> subscribers = new HashMap<IGateway, User>();

    public void subscribe(String gateWay, User user){
        IGateway gg;
        if(gateWay == "Email"){
            gg = new EmailGateway();
            subscribers.put(gg, user);
		}
		else if(gateWay == "SMS"){
            gg = new SMSGateway();
            subscribers.put(gg, user);
		}
		else if(gateWay == "Both"){
            gg = new EmailGateway();
            subscribers.put(gg, user);
            gg = new SMSGateway();
            subscribers.put(gg, user);
		}
    }
    public void getCourse(Course course){
        this.course = course;
    }

    public void notify(String postType, String user, String contents)
    {   // 3rf no3 el message 
        // hget el user for notification
        IMessage message;
        IGateway mail = new EmailGateway();
        for (Map.Entry<IGateway, User> entry : subscribers.entrySet()) {
            for(int i =0;i< entry.getValue().getEnrolledCourses().size();i++){
                
                if( entry.getValue().getEnrolledCourses().get(i) == course){
                    IGateway x = entry.getKey();
                    if(postType =="Annoucment"){
                        if(x == mail)
                        {
                            message = new DailyNewsEmailMessage();
                            x.sendMessage(message, entry.getValue(), contents);
                        }
                        else{
                            message = new DailyNewsMobileMessage();
                            x.sendMessage(message, entry.getValue(), contents)
                        }
                    }
                    else if(postType =="Task"){
                        if(x == mail)
                        {
                            message = new TaskAddedEmailMessage();
                            x.sendMessage(message, entry.getValue(), contents);
                        }
                        else{
                            message = new TaskAddedMobileMessage();
                            x.sendMessage(message, entry.getValue(), contents)
                        }

                    }
                    else if(postType =="Grades"){
                        if(x == mail)
                        {
                            message = new GradesAnnouncementEmailMessage();
                            x.sendMessage(message, entry.getValue(), contents);
                        }
                        else{
                            message = new GradesAnnouncementMobileMessage();
                            x.sendMessage(message, entry.getValue(), contents)
                        }

                    }
                }
                
            }
            // IGateway x = entry.getKey();
            // hshof fe el course lw la
            //((IGateway) entry).sendMessage(message,user,contents);
        }
    }
}