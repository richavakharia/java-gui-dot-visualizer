package dotlab;

import java.io.*;


public class DotReader 
{
	private BufferedReader			br;
	
	public DotReader(BufferedReader br)
	{
		this.br = br;
	}
	
	public Dot readDot() throws IOException, DotException{
		String line = br.readLine();
		if(line == null) {
			return null;
		}
		String[] parts = line.split(" ");
		
		if(parts.length != 4) {
			DotException de = new DotException("Invalid number of properties in line: "+ line);
			throw de;
		}
		
		String colorName = parts[0];
		int x = Integer.parseInt(parts[1]);
		int y = Integer.parseInt(parts[2]);
		int radius = Integer.parseInt(parts[3]);
		
		return new Dot(colorName, x, y, radius);
	}
	

}
