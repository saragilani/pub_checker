import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest perfectGuest = new Guest("Bond", 35, 10, 75, false, '£');
    Guest ageGuest = new Guest("Skip", 5, 6, 100, false, '£');
    Guest walletGuest = new Guest("Porpy", 35, 0, 100, false, '£');
    Guest sobernessGuest = new Guest("Barney", 35, 10, 10, false, '£');
    Guest bannedGuest = new Guest("Scar", 35, 10, 100, true, '£');
    Guest currencyGuest = new Guest("Pierre", 35, 10, 100, false, '$');

    @BeforeEach
    public void setUp(){
        this.server = new Server();
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canDealUnder18(){
        boolean result = server.canServeGuest(ageGuest);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void canServeOver18(){
        boolean result = server.canServeGuest(perfectGuest);
        assertThat(result).isEqualTo(true);
    }


    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canDealWallet(){
        boolean result = server.canServeGuest(walletGuest);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void canServeWallet(){
        boolean result = server.canServeGuest(perfectGuest);
        assertThat(result).isEqualTo(true);
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canDealSober(){
        boolean result = server.canServeGuest(sobernessGuest);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void canServeSober(){
        boolean result = server.canServeGuest(perfectGuest);
        assertThat(result).isEqualTo(true);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canDealBan(){
        boolean result = server.canServeGuest(bannedGuest);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void canServeBan(){
        boolean result = server.canServeGuest(perfectGuest);
        assertThat(result).isEqualTo(true);
    }
    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canDealCurrency(){
        boolean result = server.canServeGuest(currencyGuest);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void canServeCurrency(){
        boolean result = server.canServeGuest(perfectGuest);
        assertThat(result).isEqualTo(true);
    }
    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
