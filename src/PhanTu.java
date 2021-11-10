public class PhanTu<T extends Comparable<T>> {
    public T num;

    public PhanTu(T num) {
        this.num = num;
    }

    public boolean isGreaterThan(T value) {
        return this.getNum().compareTo(value) > 0;
    }

    public void setT(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }
}
