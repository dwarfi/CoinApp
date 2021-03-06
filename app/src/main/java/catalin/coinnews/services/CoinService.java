package catalin.coinnews.services;

import android.accounts.NetworkErrorException;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

import catalin.coinnews.models.Coin;

/**
 * Created by catalin on 17/12/17.
 */

public interface CoinService {

    Coin getCoin(String symbol) throws IOException, NetworkErrorException, JSONException;

}
