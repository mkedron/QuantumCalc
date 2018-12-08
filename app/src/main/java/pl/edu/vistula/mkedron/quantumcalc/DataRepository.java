package pl.edu.vistula.mkedron.quantumcalc;

public class DataRepository {

    private Float alphaReal;
    private Float alphaImg;
    private Float betaReal;
    private Float betaImg;

    private static DataRepository dataRepository;

    private DataRepository() {

    }

    public static DataRepository getInstance() {
        if(dataRepository == null) {
            dataRepository = new DataRepository();
        }

        return dataRepository;
    }

    public Float getAlphaReal() {
        return alphaReal;
    }

    public void setAlphaReal(Float alphaReal) {
        this.alphaReal = alphaReal;
    }

    public Float getAlphaImg() {
        return alphaImg;
    }

    public void setAlphaImg(Float alphaImg) {
        this.alphaImg = alphaImg;
    }

    public Float getBetaReal() {
        return betaReal;
    }

    public void setBetaReal(Float betaReal) {
        this.betaReal = betaReal;
    }

    public Float getBetaImg() {
        return betaImg;
    }

    public void setBetaImg(Float betaImg) {
        this.betaImg = betaImg;
    }
}
