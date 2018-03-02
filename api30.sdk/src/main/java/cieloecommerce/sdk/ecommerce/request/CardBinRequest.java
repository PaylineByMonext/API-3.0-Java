package cieloecommerce.sdk.ecommerce.request;

import cieloecommerce.sdk.Environment;
import cieloecommerce.sdk.Merchant;
import cieloecommerce.sdk.ecommerce.CardBinResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

/**
 * Bins Query is a credit or debit card search service that Cielo Ecommerce API merchants can use to validate if the card provided by the custumer is valid
 */
public class CardBinRequest extends AbstractSaleRequest<String, CardBinResponse> {
    public CardBinRequest(Merchant merchant, Environment environment) {
        super(merchant, environment);
    }

    @Override
    public CardBinResponse execute(String cardBin) throws IOException, CieloRequestException {
        String url = environment.getApiQueryURL() + "1/cardBin/" + cardBin;

        HttpGet request = new HttpGet(url);
        HttpResponse response = sendRequest(request);

        return readResponse(response, CardBinResponse.class);
    }
}
