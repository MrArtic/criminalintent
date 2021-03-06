package criminalintent.jenske.net.criminalintent;

import android.text.format.DateFormat;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Jens Kristian Espevik on 21/08/14.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private DateFormat mDateFormat;



    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();

        mDate = new Date();
        mDateFormat = new DateFormat();
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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public DateFormat getDateFormat() {
        return mDateFormat;
    }
}
