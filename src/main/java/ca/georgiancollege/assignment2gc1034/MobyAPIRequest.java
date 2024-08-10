package ca.georgiancollege.assignment2gc1034;

import com.google.gson.Gson;

public class MobyAPIRequest extends APIUtility{
    StringBuilder json = new StringBuilder();
    private Gson gson = new Gson();

    public Games getData(String url){
        json.setLength(0);
        json.append(sendRequest(url));

        return gson.fromJson(json.toString(), Games.class);
    }
}
