public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return topN+"/"+btmN;
    }
    public String toFloat() {
        double d = topN;
        double num = d/btmN;
        return num+"";
    }
    public void addFraction(Fraction f) {
        if ( btmN == f.btmN) {
            topN += f.topN;
        }
        else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }
    }
}
