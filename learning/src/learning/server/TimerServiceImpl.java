package learning.server;

import static learning.server.OfyService.ofy;
import learning.client.TimeService;
import learning.domain.Time;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class TimerServiceImpl extends RemoteServiceServlet implements TimeService {


    private static final long serialVersionUID = 1L;

    @Override
    public void saveTime(String day, String arrive, String exit) {
        Time time = new Time();
        time.setDay(day);
        time.setArrive(arrive);
        time.setExit(exit);

        ofy().save().entities(time).now();

    }



}
