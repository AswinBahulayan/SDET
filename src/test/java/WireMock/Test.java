package WireMock;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class Test {

    @org.junit.jupiter.api.Test
    public void tes(){
        WireMockServer wireMockServer = new WireMockServer(options().port(8089)); //No-args constructor will start on port 8080, no HTTPS
        wireMockServer.start();
    }
}
