package lambda_practice;

public class Apartman {
        /*
    Pojo Class :
            variables
            parametresiz - parametreli constructor
            getter-setter methodlari
            toString methodu
        */

    private String cephe;
    private int katSayi;
    private int kira;

    Apartman(){
    }
    Apartman(String cephe,int katSayi, int kira) {
        this.cephe = cephe;
        this.katSayi = katSayi;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatSayi() {
        return katSayi;
    }

    public void setKatSayi(int katSayi) {
        this.katSayi = katSayi;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "lambda_practice.Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katSayi=" + katSayi +
                ", kira=" + kira +
                '}';
    }
}
