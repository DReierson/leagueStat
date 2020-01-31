package model;

public class PlayerStats {
	private String playerName;
	private double playerWinRate;
	private String ranking;
	private String currentChampion;

	public PlayerStats() {
		this.playerName = "";
		this.playerWinRate = 0.0;
		this.ranking = "";
		this.currentChampion = "";
	}

	public PlayerStats(String n, double wr, String r, String cc) {
		this.playerName = n;
		this.playerWinRate = wr;
		this.ranking = r;
		this.currentChampion = cc;
	}

	public PlayerStats(String n, double wr, String r) {
		this.playerName = n;
		this.playerWinRate = wr;
		this.ranking = r;
		this.currentChampion = "";
	}

	public PlayerStats(String n, double wr) {
		this.playerName = n;
		this.playerWinRate = wr;
		this.ranking = "";
		this.currentChampion = "";
	}

	public String getCurrentChampion() {
		return currentChampion;
	}

	public void setCurrentChampion(String currentChampion) {
		this.currentChampion = currentChampion;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public double getPlayerWinRate() {
		return playerWinRate;
	}

	public void setPlayerWinRate(double playerWinRate) {
		this.playerWinRate = playerWinRate;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
}
