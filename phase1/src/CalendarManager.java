//import java.util.ArrayList;
//
//public class CalendarManager {
//
//    private CreatorManager creatorManager;
//    private DatabaseManager databaseManager;
//
//    public CalendarManager()
//    {
//        creatorManager = new CreatorManager();
//        databaseManager = new DatabaseManager();
//    }
//
//    public void createEvent()
//    {
//        e = creatorManager.createEvent();
//        databaseManager.addEvent(e);
//    }
//
//    public void createSeries()
//    {
//        s = creatorManager.createSeries();
//        databaseManager.addSeries(s);
//    }
//
//    public void viewEvents()
//    {
//        ArrayList<Event> allEvents = databaseManager.getAllEvents();
//        for(Event e: allEvents)
//        {
//            System.out.println(e.toString());
//            System.out.println();
//        }
//    }
//
//}

public class CalendarManager {
    public UserManager userMg = new UserManager();

    public int login(String user, String pass){
        int code = userMg.login(user, pass);
        if(code > 0){
//            DataManager.login(user);
        }
        return code;
    }

    public boolean createNewUser(String user, String pass){
        return userMg.createNewUser(user, pass);
    }

    public void deleteUserID(int userID) {
        userMg.deleteUserByName(userID);
    }

    public Event getEventByID(String id) {
        return null;
    }
}

