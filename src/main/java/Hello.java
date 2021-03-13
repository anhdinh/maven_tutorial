class Hello{
	
	public static void main(String[] args){
		System.out.println("Hello");
		System.out.println("Os name: " + System.getProperty("os.name"));
		System.out.println("Os arch: " + System.getProperty("os.arch"));
		System.out.println("Os version: " + System.getProperty("os.version"));
	}
}