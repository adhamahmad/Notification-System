package courses ;

import java.util.HashMap;
import java.util.Map;
import gateways.*;
import messages.IMessage;
public class CoursePublisher 
{
    HashMap<IGateway, String> subscribers = new HashMap<IGateway, String>();

    public void subscribe(IGateway gateWay, String postType)
    {
        subscribers.put(gateWay, postType);
    }

    public void notify(String postType,IMessage message,  user, String contents)
    {
        for (Map.Entry<IGateway, String> entry : subscribers.entrySet()) {
            ((IGateway) entry).sendMessage(message,user,contents);
        }
    }
}