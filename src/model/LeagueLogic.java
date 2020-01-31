package model;

public class LeagueLogic {

	public double winRateDifferencePlayerVChamp(PlayerStats player, ChampionStats champ) {

		double diffInWinRate = champ.getChampionWinRate() - player.getPlayerWinRate();
		diffInWinRate = Math.abs(diffInWinRate);
		return diffInWinRate;
	}

	public boolean playerWinRateHigher(PlayerStats player, ChampionStats champ) {
		boolean playerRateHigher;
		if (player.getPlayerWinRate() > champ.getChampionWinRate()) {
			playerRateHigher = true;
		} else {
			playerRateHigher = false;
		}
		return playerRateHigher;
	}
	public boolean playerInGame(PlayerStats player) {
		boolean inGame;
		if(player.getCurrentChampion()!="") {
			inGame=true;
		}else {
			inGame=false;
		}
		return inGame;
	}
}
