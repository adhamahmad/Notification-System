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

    public void notify(IMessage message)
    {   // 3rf no3 el message 
        // hget el user for notification
        for (Map.Entry<IGateway, User> entry : subscribers.entrySet()) {
            entry.getKey().sendMessage(entry.getValue(),message);
        }
    }
}