package Seminar.Seminar_01;

public interface Service<T, S> {
    T restock(T automat, S product);
}
