package io.github.dft.mothership;

import io.github.dft.mothership.model.quote.auth.AccessCredential;
import io.github.dft.mothership.model.quote.request.QuoteRequest;
import io.github.dft.mothership.model.quote.response.QuoteResponse;

import java.net.URI;
import java.net.http.HttpRequest;

public class QuoteAPI extends MotherShipSdk {

    public QuoteAPI(AccessCredential accessCredential) {
        super(accessCredential);
    }

    public QuoteResponse createQuote(QuoteRequest quoteRequest) {
        URI uri = baseUrl("quotes");
        HttpRequest post = post(uri, quoteRequest);

        return getRequestWrapped(post, QuoteResponse.class);
    }
}
