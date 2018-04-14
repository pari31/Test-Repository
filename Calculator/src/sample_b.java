
public interface sample_b
{
	void print();
	void multi();
	default void sum2()
	{
		System.out.println("Sum B");
	}
}
