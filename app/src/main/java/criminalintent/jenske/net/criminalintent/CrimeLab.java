package criminalintent.jenske.net.criminalintent;

import android.content.Context;

/**
 * Created by Jens Kristian Espevik on 26/08/14.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
}
