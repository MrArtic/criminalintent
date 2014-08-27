package criminalintent.jenske.net.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jens Kristian Espevik on 27/08/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
