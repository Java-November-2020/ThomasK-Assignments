import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public static void main(String[] args) {

        HashMap<String, String> titleTrackList = new HashMap<String, String>();
        titleTrackList.put("Dragula","Dead I am the one, exterminating son. Slipping through the trees, strangling the breeze");
        titleTrackList.put("You Shook Me All Night Long","She was a fast machine She kept her motor clean She was the best damn woman I had ever seen");
        titleTrackList.put("Peace Sells, But Who's Buying?","What do you mean, 'I couldn't be the President Of the United States of America'? Tell me something, it's still 'We the people' right?");
        titleTrackList.put("Skeletons Of Society", "Minutes seem like days Since fire ruled the sky The rich became the beggars And the fools became the wise");

        String name = titleTrackList.get("Skeletons Of Society");
        System.out.println(name);

        Set<String> keys = titleTrackList.keySet();
        for(String key: keys){
            System.out.println(key + ": " + titleTrackList.get(key));
        }
    }
}
