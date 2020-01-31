package model;

public class ChampionStats {
	private String championName;
	private double championWinRate;

	public ChampionStats() {
		this.championName = "";
		this.championWinRate = 0.0;
	}

	public ChampionStats(String n, double wr) {
		this.championName = n;
		this.championWinRate = wr;
	}

	public String getChampionName() {
		return championName;
	}

	public void setChampionName(String championName) {
		this.championName = championName;
	}

	public double getChampionWinRate() {
		return championWinRate;
	}

	public void setChampionWinRate(double championWinRate) {
		this.championWinRate = championWinRate;
	}
}
