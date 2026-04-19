public interface Handler {
    void setNext(Handler handler);
    void solve(Equation equation);
}
