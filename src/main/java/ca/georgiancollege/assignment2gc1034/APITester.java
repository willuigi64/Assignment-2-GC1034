package ca.georgiancollege.assignment2gc1034;

import com.google.gson.Gson;

public class APITester {
    static void simpleJsonCall(){
        APIUtility api = new APIUtility();
        String json = api.sendRequest("https://api.mobygames.com/v1/games?api_key=moby_B7XtgpO1L9MbBw8SfOmdd8pk2n2&format=brief&id=1");
        System.out.println(json);
    }

    //if no search function (not documented in api docs) exists after some
    //tests with changing around the URI, my project will
    //no longer be about searching a list, rather it will be about
    //selecting a platform and then selecting one of the games in the
    //list (documented is max 100 complete objects, but I've recieved 110 twice now
    static void searchTest(){
        APIUtility api = new APIUtility();
        String json = api.sendRequest("https://api.mobygames.com/v1/games?api_key=moby_B7XtgpO1L9MbBw8SfOmdd8pk2n2&?q=final+fantasy&type=game&format=brief");
        System.out.println(json);
    }

    public static void main(String[] args) {

    }
}