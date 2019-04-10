package pl.krystianzybala.rcontract;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "server.port:0")
@AutoConfigureStubRunner(ids = "pl.krystianzybala:rcontract:+:stubs:9000", stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class RemoteContractConsumerApplicationTests {


    @LocalServerPort
    private int serverPort;

    @Before
    public void setup() {
        RestAssured.baseURI = "http://localhost:" + this.serverPort;
    }

    @Test
    @Ignore
    public void test_context_test() {
        //TODO: implement
    }
}
