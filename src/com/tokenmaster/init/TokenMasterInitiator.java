package tokenmaster.init;

import tokenmaster.configure.TokenMasterConfigurator;

/**
 * Created by kushagra on 12/12/2017.
 */
public class TokenMasterInitiator {

    public static TokenMasterConfigurator getTokenMasterrConfiguratorInstance()
    {
        return new TokenMasterConfigurator();
    }
}
