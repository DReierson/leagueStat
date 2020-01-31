package tests;
import model.LeagueLogic;
import model.PlayerStats;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class inGame {

	@Before
	public void setUp() throws Exception {
	}
	//if they are on a champion then they are in a game could be used for live statistic tracking in game
	@Test
	public void test() {
		PlayerStats player = new PlayerStats("John", .8, "Iron 4");
		LeagueLogic logic = new LeagueLogic();
		
		assertFalse(logic.playerInGame(player));
	}

}
