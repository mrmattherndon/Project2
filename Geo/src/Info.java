/**
 *This class abstracts a "group" into an object that is capable of accepting an arbitrary number of Info objects as constructor arguments.
 * </P>
 * @version 1.0
 */
public interface Info{
	/**
	 * Builds a formatted string representation of the object. Useful for debugging.
	 * @param No parameters.
	 * @return A formatted string object of all the data members.
	 */
	public abstract String toString();
}
