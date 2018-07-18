package cl.clase.app;

public interface Crud2<T> {
	//<T> : Tipo Generico
	public void create(T objeto);
	public Object read(T objeto);
	public void update(T objeto);
	public void delete(T objeto);
}
