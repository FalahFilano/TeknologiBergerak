package com.filano.tekber;

public class StandingsRow {
    protected int rank;
    protected String country;
    protected int gold;
    protected int silver;
    protected int bronze;

    public StandingsRow(int rank, String country, int gold, int silver, int bronze) {
        this.rank = rank;
        this.country = country;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getTotal() {
        return gold + silver + bronze;
    }
}
