package ca.georgiancollege.assignment2gc1034;

import com.google.gson.Gson;

public class APITester {
    static void simpleJsonCall(){
        APIUtility api = new APIUtility();
        String json = api.sendRequest("https://api.mobygames.com/v1/games?api_key=moby_B7XtgpO1L9MbBw8SfOmdd8pk2n2&format=normal&id=1");
        System.out.println(json);
    }

    //if no search function (not documented in api docs) exists after some
    //tests with changing around the URI, my project will
    //no longer be about searching a list, rather it will be about
    //selecting a platform and then selecting one of the games in the
    //list (documented is max 100 complete objects)
    static void searchTest(){
        APIUtility api = new APIUtility();
        String json = api.sendRequest("https://api.mobygames.com/v1/games?api_key=moby_B7XtgpO1L9MbBw8SfOmdd8pk2n2&?q=final+fantasy&type=game&format=brief");
        System.out.println(json);
    }
    //conclusion: no search functionality. solution?
    //user choice comes in the form of selecting a platform,
    //or a random game.

    static void createGameObject(){
        MobyAPIRequest request = new MobyAPIRequest();
        Games games = request.getData("https://api.mobygames.com/v1/games/random?api_key=moby_B7XtgpO1L9MbBw8SfOmdd8pk2n2&format=brief&limit=20");
        System.out.println("Game ID: "+games.getGames()[0].getGame_id());
        System.out.println("Game Title: "+games.getGames()[0].getTitle());
    }

    public static void main(String[] args) {
        createGameObject();
    }
}