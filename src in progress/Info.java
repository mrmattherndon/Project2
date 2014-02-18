
public abstract class Info{
		
	public static Info buildInfoObject(String data, char id){
		switch(id){
			case '0':
				return new Name(data);
			case '1':
				return new Population(data);
			case '2':
				return new Area(data);
			case '3':
				return new Name(data);
			case '4':
				return new Name(data);
			case '5':
				return new Name(data);
			case '6':
				return new Name(data);
		}
		return null;
	}

	public abstract String toString();
}
