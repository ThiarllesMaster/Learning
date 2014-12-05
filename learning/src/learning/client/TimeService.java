package learning.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath(value = "timeService")
public interface TimeService extends RemoteService {

    public void saveTime(String day, String arrive, String exit);
}
