package criminalintent.jenske.net.criminalintent;

import java.util.UUID;

/**
 * Created by Jens Kristian Espevik on 21/08/14.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
    }


    // Getter and setters

    public UUID getId() {

        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


}
